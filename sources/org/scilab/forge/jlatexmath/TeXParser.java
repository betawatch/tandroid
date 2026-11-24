package org.scilab.forge.jlatexmath;

import java.lang.Character;
import java.util.HashSet;
import java.util.Set;
import org.scilab.forge.jlatexmath.TeXFormula;
import ru.noties.jlatexmath.awt.Color;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class TeXParser {
    private static final char BACKPRIME = 8245;
    private static final char DEGRE = 176;
    private static final char DOLLAR = '$';
    private static final char DQUOTE = '\"';
    private static final char ESCAPE = '\\';
    private static final char L_BRACK = '[';
    private static final char L_GROUP = '{';
    private static final int MAX_FIRSTPASS_EXPANSIONS = 10000;
    private static final int MAX_FIRSTPASS_LENGTH = 65536;
    private static final long MAX_FIRSTPASS_WORK = 33554432;
    private static final int MAX_LASTPASS_EXPANSIONS = 10000;
    private static final int MAX_MACRO_ARGS = 256;
    private static final int MAX_PARSE_DEPTH = 64;
    private static final char PERCENT = '%';
    private static final char PRIME = '\'';
    private static final char R_BRACK = ']';
    private static final char R_GROUP = '}';
    private static final char SUBEIGHT = 8328;
    private static final char SUBEQUAL = 8332;
    private static final char SUBFIVE = 8325;
    private static final char SUBFOUR = 8324;
    private static final char SUBLPAR = 8333;
    private static final char SUBMINUS = 8331;
    private static final char SUBNINE = 8329;
    private static final char SUBONE = 8321;
    private static final char SUBPLUS = 8330;
    private static final char SUBRPAR = 8334;
    private static final char SUBSEVEN = 8327;
    private static final char SUBSIX = 8326;
    private static final char SUBTHREE = 8323;
    private static final char SUBTWO = 8322;
    private static final char SUBZERO = 8320;
    private static final char SUB_SCRIPT = '_';
    private static final char SUPEIGHT = 8312;
    private static final char SUPEQUAL = 8316;
    private static final char SUPER_SCRIPT = '^';
    private static final char SUPFIVE = 8309;
    private static final char SUPFOUR = 8308;
    private static final char SUPLPAR = 8317;
    private static final char SUPMINUS = 8315;
    private static final char SUPN = 8319;
    private static final char SUPNINE = 8313;
    private static final char SUPONE = 185;
    private static final char SUPPLUS = 8314;
    private static final char SUPRPAR = 8318;
    private static final char SUPSEVEN = 8311;
    private static final char SUPSIX = 8310;
    private static final char SUPTHREE = 179;
    private static final char SUPTWO = 178;
    private static final char SUPZERO = 8304;
    private static long firstpassExpansionWork = 0;
    protected static boolean isLoading = false;
    private static int lastpassExpansions;
    private static int parseDepth;
    private static final Set<String> unparsedContents;
    private boolean arrayMode;
    private int atIsLetter;
    private int col;
    TeXFormula formula;
    private int group;
    private boolean ignoreWhiteSpace;
    private boolean insertion;
    private boolean isPartial;
    private int len;
    private int line;
    private StringBuffer parseString;
    private int pos;
    private int spos;

    static {
        HashSet hashSet = new HashSet(6);
        unparsedContents = hashSet;
        hashSet.add("jlmDynamic");
        hashSet.add("jlmText");
        hashSet.add("jlmTextit");
        hashSet.add("jlmTextbf");
        hashSet.add("jlmTextitbf");
        hashSet.add("jlmExternalFont");
    }

    public TeXParser(boolean z, String str, TeXFormula teXFormula, boolean z2) {
        this.ignoreWhiteSpace = true;
        this.formula = teXFormula;
        this.isPartial = z;
        if (str == null) {
            this.parseString = null;
            this.pos = 0;
            this.len = 0;
        } else {
            this.parseString = new StringBuffer(str);
            this.len = str.length();
            this.pos = 0;
            if (z2) {
                firstpass();
            }
        }
    }

    private static char convertToRomanNumber(char c) {
        int i;
        if (c == 1643) {
            return '.';
        }
        if (1632 <= c && c <= 1641) {
            i = c - 1584;
        } else if (1776 <= c && c <= 1785) {
            i = c - 1728;
        } else if (2406 <= c && c <= 2415) {
            i = c - 2358;
        } else if (2534 <= c && c <= 2543) {
            i = c - 2486;
        } else if (2662 <= c && c <= 2671) {
            i = c - 2614;
        } else if (2790 <= c && c <= 2799) {
            i = c - 2742;
        } else if (2918 <= c && c <= 2927) {
            i = c - 2870;
        } else if (3174 <= c && c <= 3183) {
            i = c - 3126;
        } else if (3430 <= c && c <= 3439) {
            i = c - 3382;
        } else if (3664 <= c && c <= 3673) {
            i = c - 3616;
        } else if (3792 <= c && c <= 3801) {
            i = c - 3744;
        } else if (3872 <= c && c <= 3881) {
            i = c - 3728;
        } else if (4160 <= c && c <= 4169) {
            i = c - 4112;
        } else if (6112 <= c && c <= 6121) {
            i = c - 6064;
        } else if (6160 <= c && c <= 6169) {
            i = c - 6112;
        } else if (6992 <= c && c <= 7001) {
            i = c - 6944;
        } else if (7088 <= c && c <= 7097) {
            i = c - 7040;
        } else if (7232 <= c && c <= 7241) {
            i = c - 7184;
        } else if (7248 <= c && c <= 7257) {
            i = c - 7200;
        } else {
            if (43216 > c || c > 43225) {
                return c;
            }
            i = c - 43168;
        }
        return (char) i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0590  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void firstpass() {
        int i;
        char charAt;
        NewCommandMacro.reset();
        lastpassExpansions = 0;
        if (this.len != 0) {
            firstpassExpansionWork = 0L;
            int i2 = 0;
            while (this.pos < this.len) {
                if (this.parseString.length() > 65536) {
                    qn0.g("Formula too large after macro expansion");
                    return;
                }
                char charAt2 = this.parseString.charAt(this.pos);
                if (charAt2 == '%') {
                    int i3 = this.pos;
                    this.pos = i3 + 1;
                    do {
                        int i4 = this.pos;
                        if (i4 < this.len) {
                            StringBuffer stringBuffer = this.parseString;
                            this.pos = i4 + 1;
                            charAt = stringBuffer.charAt(i4);
                            if (charAt != '\r') {
                            }
                        }
                        i = this.pos;
                        if (i < this.len) {
                            i--;
                            this.pos = i;
                        }
                        this.parseString.replace(i3, i, "");
                        this.len = this.parseString.length();
                        this.pos = i3;
                    } while (charAt != '\n');
                    i = this.pos;
                    if (i < this.len) {
                    }
                    this.parseString.replace(i3, i, "");
                    this.len = this.parseString.length();
                    this.pos = i3;
                } else if (charAt2 == '\\') {
                    int i5 = this.pos;
                    String command = getCommand();
                    if ("newcommand".equals(command) || "renewcommand".equals(command)) {
                        try {
                            MacroInfo.Commands.get(command).invoke(this, getOptsArgs(2, 2));
                        } catch (ParseException e) {
                            if (!this.isPartial) {
                                throw e;
                            }
                        }
                        this.parseString.delete(i5, this.pos);
                        this.len = this.parseString.length();
                        this.pos = i5;
                    } else if (NewCommandMacro.isMacro(command)) {
                        i2++;
                        if (i2 > 10000) {
                            qn0.g("Macro expansion limit exceeded");
                            return;
                        }
                        long j = firstpassExpansionWork + this.len;
                        firstpassExpansionWork = j;
                        if (j > MAX_FIRSTPASS_WORK) {
                            qn0.g("Formula expands too much");
                            return;
                        }
                        MacroInfo macroInfo = MacroInfo.Commands.get(command);
                        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? 1 : 0);
                        optsArgs[0] = command;
                        try {
                            this.parseString.replace(i5, this.pos, (String) macroInfo.invoke(this, optsArgs));
                        } catch (ParseException e2) {
                            if (!this.isPartial) {
                                throw e2;
                            }
                            i5 += command.length() + 1;
                        }
                        this.len = this.parseString.length();
                        this.pos = i5;
                    } else if ("begin".equals(command)) {
                        String[] optsArgs2 = getOptsArgs(1, 0);
                        MacroInfo macroInfo2 = MacroInfo.Commands.get(optsArgs2[1] + "@env");
                        if (macroInfo2 != null) {
                            i2++;
                            if (i2 > 10000) {
                                qn0.g("Macro expansion limit exceeded");
                                return;
                            }
                            long j2 = firstpassExpansionWork + this.len;
                            firstpassExpansionWork = j2;
                            if (j2 > MAX_FIRSTPASS_WORK) {
                                qn0.g("Formula expands too much");
                                return;
                            }
                            try {
                                String[] optsArgs3 = getOptsArgs(macroInfo2.nbArgs - 1, 0);
                                String group = getGroup("\\begin{" + optsArgs2[1] + "}", "\\end{" + optsArgs2[1] + "}");
                                String str = "{\\makeatletter \\" + optsArgs2[1] + "@env";
                                for (int i6 = 1; i6 <= macroInfo2.nbArgs - 1; i6++) {
                                    str = str + "{" + optsArgs3[i6] + "}";
                                }
                                this.parseString.replace(i5, this.pos, str + "{" + group + "}\\makeatother}");
                                this.len = this.parseString.length();
                                this.pos = i5;
                            } catch (ParseException e3) {
                                if (!this.isPartial) {
                                    throw e3;
                                }
                            }
                        } else if (!this.isPartial) {
                            throw new ParseException("Unknown environment: " + optsArgs2[1] + " at position " + getLine() + ":" + getCol());
                        }
                    } else if ("makeatletter".equals(command)) {
                        this.atIsLetter++;
                    } else if ("makeatother".equals(command)) {
                        this.atIsLetter--;
                    } else if (unparsedContents.contains(command)) {
                        getOptsArgs(1, 0);
                    }
                } else if (charAt2 == 176) {
                    StringBuffer stringBuffer2 = this.parseString;
                    int i7 = this.pos;
                    stringBuffer2.replace(i7, i7 + 1, "^{\\circ}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 == 185) {
                    StringBuffer stringBuffer3 = this.parseString;
                    int i8 = this.pos;
                    stringBuffer3.replace(i8, i8 + 1, "\\jlatexmathcumsup{1}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 == 8304) {
                    StringBuffer stringBuffer4 = this.parseString;
                    int i9 = this.pos;
                    stringBuffer4.replace(i9, i9 + 1, "\\jlatexmathcumsup{0}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 == 178) {
                    StringBuffer stringBuffer5 = this.parseString;
                    int i10 = this.pos;
                    stringBuffer5.replace(i10, i10 + 1, "\\jlatexmathcumsup{2}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 != 179) {
                    switch (charAt2) {
                        case 8308:
                            StringBuffer stringBuffer6 = this.parseString;
                            int i11 = this.pos;
                            stringBuffer6.replace(i11, i11 + 1, "\\jlatexmathcumsup{4}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8309:
                            StringBuffer stringBuffer7 = this.parseString;
                            int i12 = this.pos;
                            stringBuffer7.replace(i12, i12 + 1, "\\jlatexmathcumsup{5}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8310:
                            StringBuffer stringBuffer8 = this.parseString;
                            int i13 = this.pos;
                            stringBuffer8.replace(i13, i13 + 1, "\\jlatexmathcumsup{6}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8311:
                            StringBuffer stringBuffer9 = this.parseString;
                            int i14 = this.pos;
                            stringBuffer9.replace(i14, i14 + 1, "\\jlatexmathcumsup{7}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8312:
                            StringBuffer stringBuffer10 = this.parseString;
                            int i15 = this.pos;
                            stringBuffer10.replace(i15, i15 + 1, "\\jlatexmathcumsup{8}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8313:
                            StringBuffer stringBuffer11 = this.parseString;
                            int i16 = this.pos;
                            stringBuffer11.replace(i16, i16 + 1, "\\jlatexmathcumsup{9}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8314:
                            StringBuffer stringBuffer12 = this.parseString;
                            int i17 = this.pos;
                            stringBuffer12.replace(i17, i17 + 1, "\\jlatexmathcumsup{+}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8315:
                            StringBuffer stringBuffer13 = this.parseString;
                            int i18 = this.pos;
                            stringBuffer13.replace(i18, i18 + 1, "\\jlatexmathcumsup{-}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8316:
                            StringBuffer stringBuffer14 = this.parseString;
                            int i19 = this.pos;
                            stringBuffer14.replace(i19, i19 + 1, "\\jlatexmathcumsup{=}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8317:
                            StringBuffer stringBuffer15 = this.parseString;
                            int i20 = this.pos;
                            stringBuffer15.replace(i20, i20 + 1, "\\jlatexmathcumsup{(}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8318:
                            StringBuffer stringBuffer16 = this.parseString;
                            int i21 = this.pos;
                            stringBuffer16.replace(i21, i21 + 1, "\\jlatexmathcumsup{)}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8319:
                            StringBuffer stringBuffer17 = this.parseString;
                            int i22 = this.pos;
                            stringBuffer17.replace(i22, i22 + 1, "\\jlatexmathcumsup{n}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8320:
                            StringBuffer stringBuffer18 = this.parseString;
                            int i23 = this.pos;
                            stringBuffer18.replace(i23, i23 + 1, "\\jlatexmathcumsub{0}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8321:
                            StringBuffer stringBuffer19 = this.parseString;
                            int i24 = this.pos;
                            stringBuffer19.replace(i24, i24 + 1, "\\jlatexmathcumsub{1}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8322:
                            StringBuffer stringBuffer20 = this.parseString;
                            int i25 = this.pos;
                            stringBuffer20.replace(i25, i25 + 1, "\\jlatexmathcumsub{2}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8323:
                            StringBuffer stringBuffer21 = this.parseString;
                            int i26 = this.pos;
                            stringBuffer21.replace(i26, i26 + 1, "\\jlatexmathcumsub{3}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8324:
                            StringBuffer stringBuffer22 = this.parseString;
                            int i27 = this.pos;
                            stringBuffer22.replace(i27, i27 + 1, "\\jlatexmathcumsub{4}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8325:
                            StringBuffer stringBuffer23 = this.parseString;
                            int i28 = this.pos;
                            stringBuffer23.replace(i28, i28 + 1, "\\jlatexmathcumsub{5}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8326:
                            StringBuffer stringBuffer24 = this.parseString;
                            int i29 = this.pos;
                            stringBuffer24.replace(i29, i29 + 1, "\\jlatexmathcumsub{6}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8327:
                            StringBuffer stringBuffer25 = this.parseString;
                            int i30 = this.pos;
                            stringBuffer25.replace(i30, i30 + 1, "\\jlatexmathcumsub{7}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8328:
                            StringBuffer stringBuffer26 = this.parseString;
                            int i31 = this.pos;
                            stringBuffer26.replace(i31, i31 + 1, "\\jlatexmathcumsub{8}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8329:
                            StringBuffer stringBuffer27 = this.parseString;
                            int i32 = this.pos;
                            stringBuffer27.replace(i32, i32 + 1, "\\jlatexmathcumsub{9}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8330:
                            StringBuffer stringBuffer28 = this.parseString;
                            int i33 = this.pos;
                            stringBuffer28.replace(i33, i33 + 1, "\\jlatexmathcumsub{+}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8331:
                            StringBuffer stringBuffer29 = this.parseString;
                            int i34 = this.pos;
                            stringBuffer29.replace(i34, i34 + 1, "\\jlatexmathcumsub{-}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8332:
                            StringBuffer stringBuffer30 = this.parseString;
                            int i35 = this.pos;
                            stringBuffer30.replace(i35, i35 + 1, "\\jlatexmathcumsub{=}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8333:
                            StringBuffer stringBuffer31 = this.parseString;
                            int i36 = this.pos;
                            stringBuffer31.replace(i36, i36 + 1, "\\jlatexmathcumsub{(}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8334:
                            StringBuffer stringBuffer32 = this.parseString;
                            int i37 = this.pos;
                            stringBuffer32.replace(i37, i37 + 1, "\\jlatexmathcumsub{)}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        default:
                            this.pos++;
                            break;
                    }
                } else {
                    StringBuffer stringBuffer33 = this.parseString;
                    int i38 = this.pos;
                    stringBuffer33.replace(i38, i38 + 1, "\\jlatexmathcumsup{3}");
                    this.len = this.parseString.length();
                    this.pos++;
                }
            }
            this.pos = 0;
            this.len = this.parseString.length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getCommand() {
        int i;
        int i2 = this.pos + 1;
        this.pos = i2;
        char c = 0;
        while (true) {
            int i3 = this.pos;
            if (i3 >= this.len || (((c = this.parseString.charAt(i3)) < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && (this.atIsLetter == 0 || c != '@')))) {
                break;
            }
            this.pos++;
        }
        int i4 = this.pos;
        if (i4 == i2) {
            i4++;
            this.pos = i4;
        }
        String substring = this.parseString.substring(i2, i4);
        if ("cr".equals(substring) && (i = this.pos) < this.len && this.parseString.charAt(i) == ' ') {
            this.pos++;
        }
        return substring;
    }

    private String getCommandWithArgs(String str) {
        if (str.equals("left")) {
            return getGroup("\\left", "\\right");
        }
        MacroInfo macroInfo = MacroInfo.Commands.get(str);
        if (macroInfo == null) {
            return "\\".concat(str);
        }
        int i = 0;
        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? macroInfo.posOpts : 0);
        StringBuffer stringBuffer = new StringBuffer("\\");
        stringBuffer.append(str);
        for (int i2 = 0; i2 < macroInfo.posOpts; i2++) {
            String str2 = optsArgs[macroInfo.nbArgs + i2 + 1];
            if (str2 != null) {
                stringBuffer.append("[");
                stringBuffer.append(str2);
                stringBuffer.append("]");
            }
        }
        while (i < macroInfo.nbArgs) {
            i++;
            String str3 = optsArgs[i];
            if (str3 != null) {
                stringBuffer.append("{");
                stringBuffer.append(str3);
                stringBuffer.append("}");
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Atom getScripts(char c) {
        Atom atom;
        Atom atom2;
        this.pos++;
        Atom argument = getArgument();
        int i = this.pos;
        char charAt = i < this.len ? this.parseString.charAt(i) : (char) 0;
        if (c != '^' || charAt != '^') {
            if (c == '_' && charAt == '^') {
                this.pos++;
                atom = getArgument();
            } else if (c == '^' && charAt == '_') {
                this.pos++;
                argument = getArgument();
                atom = argument;
            } else if (c != '^' || charAt == '_') {
                atom = null;
            }
            TeXFormula teXFormula = this.formula;
            atom2 = teXFormula.root;
            if (!(atom2 instanceof RowAtom)) {
                atom2 = ((RowAtom) atom2).getLastAtom();
            } else if (atom2 == null) {
                atom2 = new PhantomAtom(new CharAtom('M', "mathnormal"), false, true, true);
            } else {
                teXFormula.root = null;
            }
            if (atom2.getRightType() != 1) {
                return new BigOperatorAtom(atom2, argument, atom);
            }
            if (atom2 instanceof OverUnderDelimiter) {
                OverUnderDelimiter overUnderDelimiter = (OverUnderDelimiter) atom2;
                if (overUnderDelimiter.isOver()) {
                    if (atom != null) {
                        overUnderDelimiter.addScript(atom);
                        return new ScriptsAtom(atom2, argument, null);
                    }
                } else if (argument != null) {
                    overUnderDelimiter.addScript(argument);
                    return new ScriptsAtom(atom2, null, atom);
                }
            }
            return new ScriptsAtom(atom2, argument, atom);
        }
        atom = argument;
        argument = null;
        TeXFormula teXFormula2 = this.formula;
        atom2 = teXFormula2.root;
        if (!(atom2 instanceof RowAtom)) {
        }
        if (atom2.getRightType() != 1) {
        }
    }

    private void insert(int i, int i2, String str) {
        this.parseString.replace(i, i2, str);
        this.len = this.parseString.length();
        this.pos = i;
        this.insertion = true;
    }

    private Atom processCommands(String str) {
        MacroInfo macroInfo = MacroInfo.Commands.get(str);
        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? macroInfo.posOpts : 0);
        optsArgs[0] = str;
        if (!NewCommandMacro.isMacro(str)) {
            return (Atom) macroInfo.invoke(this, optsArgs);
        }
        int i = lastpassExpansions + 1;
        lastpassExpansions = i;
        if (i <= 10000) {
            insert(this.spos, this.pos, (String) macroInfo.invoke(this, optsArgs));
            return null;
        }
        qn0.g("Macro expansion limit exceeded");
        return null;
    }

    private Atom processEscape() {
        this.spos = this.pos;
        String command = getCommand();
        if (command.length() == 0) {
            return new EmptyAtom();
        }
        if (MacroInfo.Commands.get(command) != null) {
            return processCommands(command);
        }
        try {
            try {
                return TeXFormula.get(command).root;
            } catch (SymbolNotFoundException unused) {
                if (this.isPartial) {
                    return new ColorAtom(new RomanAtom(new TeXFormula("\\backslash ".concat(command)).root), (Color) null, Color.RED);
                }
                qn0.g(kt6.o("Unknown symbol or command or predefined TeXFormula: '", command, "'"));
                return null;
            }
        } catch (FormulaNotFoundException unused2) {
            return SymbolAtom.get(command);
        }
    }

    private final void skipWhiteSpace() {
        while (true) {
            int i = this.pos;
            if (i >= this.len) {
                return;
            }
            char charAt = this.parseString.charAt(i);
            if (charAt != ' ' && charAt != '\t' && charAt != '\n' && charAt != '\r') {
                return;
            }
            if (charAt == '\n') {
                this.line++;
                this.col = this.pos;
            }
            this.pos++;
        }
    }

    public void addAtom(Atom atom) {
        this.formula.add(atom);
    }

    public void addRow() {
        if (this.arrayMode) {
            ((ArrayOfAtoms) this.formula).addRow();
        } else {
            qn0.g("You can add a row only in array mode !");
        }
    }

    public Atom convertCharacter(char c, boolean z) {
        String str;
        String[] strArr;
        if (this.ignoreWhiteSpace) {
            if (c >= 945 && c <= 969) {
                return SymbolAtom.get(TeXFormula.symbolMappings[c]);
            }
            if (c >= 913 && c <= 937) {
                return new TeXFormula(TeXFormula.symbolFormulaMappings[c]).root;
            }
        }
        char convertToRomanNumber = convertToRomanNumber(c);
        if ((convertToRomanNumber >= '0' && convertToRomanNumber <= '9') || ((convertToRomanNumber >= 'a' && convertToRomanNumber <= 'z') || (convertToRomanNumber >= 'A' && convertToRomanNumber <= 'Z'))) {
            TeXFormula.FontInfos fontInfos = TeXFormula.externalFontMap.get(Character.UnicodeBlock.BASIC_LATIN);
            if (fontInfos == null) {
                return new CharAtom(convertToRomanNumber, this.formula.textStyle, this.ignoreWhiteSpace);
            }
            if (z) {
                return new JavaFontRenderingAtom(Character.toString(convertToRomanNumber), fontInfos);
            }
            int i = this.pos;
            this.pos = i + 1;
            int i2 = this.len - 1;
            while (true) {
                int i3 = this.pos;
                if (i3 >= this.len) {
                    break;
                }
                char charAt = this.parseString.charAt(i3);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
                    break;
                }
                this.pos++;
            }
            i2 = this.pos - 1;
            this.pos = i2;
            return new JavaFontRenderingAtom(this.parseString.substring(i, i2 + 1), fontInfos);
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(convertToRomanNumber);
        if (!isLoading && !DefaultTeXFont.loadedAlphabets.contains(of)) {
            DefaultTeXFont.addAlphabet(DefaultTeXFont.registeredAlphabets.get(of));
        }
        String str2 = TeXFormula.symbolMappings[convertToRomanNumber];
        if (str2 != null || ((strArr = TeXFormula.symbolFormulaMappings) != null && strArr[convertToRomanNumber] != null)) {
            if (!this.ignoreWhiteSpace && (str = TeXFormula.symbolTextMappings[convertToRomanNumber]) != null) {
                return SymbolAtom.get(str).setUnicode(convertToRomanNumber);
            }
            String[] strArr2 = TeXFormula.symbolFormulaMappings;
            if (strArr2 != null && strArr2[convertToRomanNumber] != null) {
                return new TeXFormula(TeXFormula.symbolFormulaMappings[convertToRomanNumber]).root;
            }
            try {
                return SymbolAtom.get(str2);
            } catch (SymbolNotFoundException e) {
                throw new ParseException("The character '" + Character.toString(convertToRomanNumber) + "' was mapped to an unknown symbol with the name '" + str2 + "'!", e);
            }
        }
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.BASIC_LATIN;
        TeXFormula.FontInfos externalFont = (!unicodeBlock.equals(of) || TeXFormula.isRegisteredBlock(unicodeBlock)) ? TeXFormula.getExternalFont(of) : null;
        if (externalFont == null) {
            if (this.isPartial) {
                return new ColorAtom(new RomanAtom(new TeXFormula(td4.o(convertToRomanNumber, "\\text{(Unknown char ", ")}")).root), (Color) null, Color.RED);
            }
            throw new ParseException("Unknown character : '" + Character.toString(convertToRomanNumber) + "' (or " + ((int) convertToRomanNumber) + ")");
        }
        if (z) {
            return new JavaFontRenderingAtom(Character.toString(convertToRomanNumber), externalFont);
        }
        int i4 = this.pos;
        this.pos = i4 + 1;
        int i5 = this.len - 1;
        while (true) {
            int i6 = this.pos;
            if (i6 >= this.len) {
                break;
            }
            boolean equals = Character.UnicodeBlock.of(this.parseString.charAt(i6)).equals(of);
            int i7 = this.pos;
            if (!equals) {
                i5 = i7 - 1;
                this.pos = i5;
                break;
            }
            this.pos = i7 + 1;
        }
        return new JavaFontRenderingAtom(this.parseString.substring(i4, i5 + 1), externalFont);
    }

    public void finish() {
        this.pos = this.parseString.length();
    }

    public Atom getArgument() {
        skipWhiteSpace();
        int i = this.pos;
        if (i >= this.len) {
            return new EmptyAtom();
        }
        char charAt = this.parseString.charAt(i);
        if (charAt != '{') {
            if (charAt != '\\') {
                Atom convertCharacter = convertCharacter(charAt, true);
                this.pos++;
                return convertCharacter;
            }
            Atom processEscape = processEscape();
            if (!this.insertion) {
                return processEscape;
            }
            this.insertion = false;
            return getArgument();
        }
        TeXFormula teXFormula = new TeXFormula();
        TeXFormula teXFormula2 = this.formula;
        this.formula = teXFormula;
        this.pos++;
        this.group++;
        parse();
        this.formula = teXFormula2;
        if (teXFormula2.root != null) {
            return teXFormula.root;
        }
        RowAtom rowAtom = new RowAtom();
        rowAtom.add(teXFormula.root);
        return rowAtom;
    }

    public int getCol() {
        return (this.pos - this.col) - 1;
    }

    public String getDollarGroup(char c) {
        char charAt;
        int i;
        int i2 = this.pos;
        do {
            StringBuffer stringBuffer = this.parseString;
            int i3 = this.pos;
            this.pos = i3 + 1;
            charAt = stringBuffer.charAt(i3);
            if (charAt == '\\') {
                this.pos++;
            }
            i = this.pos;
            if (i >= this.len) {
                break;
            }
        } while (charAt != c);
        StringBuffer stringBuffer2 = this.parseString;
        return charAt == c ? stringBuffer2.substring(i2, i - 1) : stringBuffer2.substring(i2, i);
    }

    public Atom getFormulaAtom() {
        TeXFormula teXFormula = this.formula;
        Atom atom = teXFormula.root;
        teXFormula.root = null;
        return atom;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (isValidCharacterInCommand(r8) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getGroup(String str, String str2) {
        int i;
        int length = str.length();
        int length2 = str2.length();
        boolean isValidCharacterInCommand = isValidCharacterInCommand(str.charAt(length - 1));
        boolean isValidCharacterInCommand2 = isValidCharacterInCommand(str2.charAt(length2 - 1));
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 1;
        int i3 = 0;
        char c = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.pos;
            if (i6 >= this.len || i2 == 0) {
                break;
            }
            char charAt = this.parseString.charAt(i6);
            if (c != '\\' && charAt == ' ') {
                while (true) {
                    int i7 = this.pos;
                    if (i7 >= this.len) {
                        break;
                    }
                    StringBuffer stringBuffer2 = this.parseString;
                    this.pos = i7 + 1;
                    if (stringBuffer2.charAt(i7) != ' ') {
                        break;
                    }
                    stringBuffer.append(' ');
                }
                StringBuffer stringBuffer3 = this.parseString;
                int i8 = this.pos - 1;
                this.pos = i8;
                charAt = stringBuffer3.charAt(i8);
                if (isValidCharacterInCommand(c) && isValidCharacterInCommand(charAt)) {
                    c = charAt;
                    i4 = 0;
                    i5 = 0;
                    i4 = c != str.charAt(i4) ? i4 + 1 : 0;
                    if (c != str2.charAt(i5)) {
                        if (i5 == 0) {
                            i3 = this.pos;
                        }
                        i5++;
                    } else {
                        i5 = 0;
                    }
                    i = this.pos;
                    if (i + 1 >= this.len) {
                        char charAt2 = this.parseString.charAt(i + 1);
                        if (i4 == length) {
                            if (!isValidCharacterInCommand || !isValidCharacterInCommand(charAt2)) {
                                i2++;
                            }
                            i4 = 0;
                        }
                        if (i5 != length2) {
                            stringBuffer.append(c);
                            this.pos++;
                        } else {
                            if (isValidCharacterInCommand2) {
                            }
                            i2--;
                        }
                    } else {
                        if (i4 == length) {
                            i2++;
                            i4 = 0;
                        }
                        if (i5 != length2) {
                            stringBuffer.append(c);
                            this.pos++;
                        }
                        i2--;
                    }
                    i5 = 0;
                    stringBuffer.append(c);
                    this.pos++;
                }
            }
            c = charAt;
            if (c != str.charAt(i4)) {
            }
            if (c != str2.charAt(i5)) {
            }
            i = this.pos;
            if (i + 1 >= this.len) {
            }
            i5 = 0;
            stringBuffer.append(c);
            this.pos++;
        }
        if (i2 == 0) {
            return stringBuffer.substring(0, (stringBuffer.length() - this.pos) + i3);
        }
        if (this.isPartial) {
            return stringBuffer.toString();
        }
        qn0.g(td4.r("The token ", str, " must be closed by ", str2));
        return null;
    }

    public boolean getIsPartial() {
        return this.isPartial;
    }

    public Atom getLastAtom() {
        TeXFormula teXFormula = this.formula;
        Atom atom = teXFormula.root;
        if (atom instanceof RowAtom) {
            return ((RowAtom) atom).getLastAtom();
        }
        teXFormula.root = null;
        return atom;
    }

    public float[] getLength() {
        if (this.pos == this.len) {
            return null;
        }
        skipWhiteSpace();
        int i = this.pos;
        char c = 0;
        while (true) {
            int i2 = this.pos;
            if (i2 >= this.len || c == ' ') {
                break;
            }
            StringBuffer stringBuffer = this.parseString;
            this.pos = i2 + 1;
            c = stringBuffer.charAt(i2);
        }
        skipWhiteSpace();
        return SpaceAtom.getLength(this.parseString.substring(i, this.pos - 1));
    }

    public int getLine() {
        return this.line;
    }

    public String[] getOptsArgs(int i, int i2) {
        if (i < 0 || i > 256) {
            i = 256;
        }
        String[] strArr = new String[i + 11];
        if (i != 0) {
            if (i2 == 1) {
                for (int i3 = i + 1; i3 < i + 11; i3++) {
                    try {
                        skipWhiteSpace();
                        strArr[i3] = getGroup(L_BRACK, R_BRACK);
                    } catch (ParseException unused) {
                        strArr[i3] = null;
                    }
                }
            }
            skipWhiteSpace();
            try {
                strArr[1] = getGroup(L_GROUP, R_GROUP);
            } catch (ParseException unused2) {
                if (this.parseString.charAt(this.pos) != '\\') {
                    strArr[1] = String.valueOf(this.parseString.charAt(this.pos));
                    this.pos++;
                } else {
                    strArr[1] = getCommandWithArgs(getCommand());
                }
            }
            if (i2 == 2) {
                for (int i4 = i + 1; i4 < i + 11; i4++) {
                    try {
                        skipWhiteSpace();
                        strArr[i4] = getGroup(L_BRACK, R_BRACK);
                    } catch (ParseException unused3) {
                        strArr[i4] = null;
                    }
                }
            }
            for (int i5 = 2; i5 <= i; i5++) {
                skipWhiteSpace();
                try {
                    strArr[i5] = getGroup(L_GROUP, R_GROUP);
                } catch (ParseException unused4) {
                    if (this.parseString.charAt(this.pos) != '\\') {
                        strArr[i5] = String.valueOf(this.parseString.charAt(this.pos));
                        this.pos++;
                    } else {
                        strArr[i5] = getCommandWithArgs(getCommand());
                    }
                }
            }
            if (this.ignoreWhiteSpace) {
                skipWhiteSpace();
            }
        }
        return strArr;
    }

    public String getOverArgument() {
        int i;
        String substring;
        int i2 = this.pos;
        if (i2 == this.len) {
            return null;
        }
        char c = 0;
        char c2 = 0;
        int i3 = 1;
        while (true) {
            i = this.pos;
            if (i >= this.len || i3 == 0) {
                break;
            }
            c2 = this.parseString.charAt(i);
            if (c2 != '&') {
                if (c2 == '\\') {
                    int i4 = this.pos + 1;
                    this.pos = i4;
                    if (i4 < this.len && this.parseString.charAt(i4) == '\\' && i3 == 1) {
                        i3--;
                        this.pos--;
                    } else {
                        int i5 = this.pos;
                        if (i5 < this.len - 1 && this.parseString.charAt(i5) == 'c' && this.parseString.charAt(this.pos + 1) == 'r' && i3 == 1) {
                            i3--;
                            this.pos--;
                        }
                    }
                } else if (c2 != '{') {
                    if (c2 != '}') {
                    }
                    i3--;
                } else {
                    i3++;
                }
                this.pos++;
            } else {
                if (i3 != 1) {
                    this.pos++;
                }
                i3--;
                this.pos++;
            }
        }
        if (i3 >= 2) {
            qn0.g("Illegal end,  missing '}' !");
            return null;
        }
        StringBuffer stringBuffer = this.parseString;
        if (i3 == 0) {
            substring = stringBuffer.substring(i2, i - 1);
            c = c2;
        } else {
            substring = stringBuffer.substring(i2, i);
        }
        if (c != '&' && c != '\\' && c != '}') {
            return substring;
        }
        this.pos--;
        return substring;
    }

    public int getPos() {
        return this.pos;
    }

    public String getStringFromCurrentPos() {
        return this.parseString.substring(this.pos);
    }

    public boolean isArrayMode() {
        return this.arrayMode;
    }

    public boolean isAtLetter() {
        return this.atIsLetter != 0;
    }

    public boolean isIgnoreWhiteSpace() {
        return this.ignoreWhiteSpace;
    }

    public boolean isMathMode() {
        return this.ignoreWhiteSpace;
    }

    public final boolean isValidCharacterInCommand(char c) {
        if (Character.isLetter(c)) {
            return true;
        }
        return this.atIsLetter != 0 && c == '@';
    }

    public final boolean isValidName(String str) {
        char c = 0;
        if (str == null || "".equals(str) || str.charAt(0) != '\\') {
            return false;
        }
        int length = str.length();
        for (int i = 1; i < length; i++) {
            c = str.charAt(i);
            if (!Character.isLetter(c) && (this.atIsLetter == 0 || c != '@')) {
                break;
            }
        }
        return Character.isLetter(c);
    }

    public void makeAtLetter() {
        this.atIsLetter++;
    }

    public void makeAtOther() {
        this.atIsLetter--;
    }

    public void parse() {
        int i;
        boolean z;
        char charAt;
        int i2 = parseDepth;
        int i3 = i2 + 1;
        parseDepth = i3;
        if (i3 > 64) {
            parseDepth = i2;
            throw new DepthLimitExceededException();
        }
        try {
            if (this.len != 0) {
                while (true) {
                    int i4 = this.pos;
                    if (i4 >= this.len) {
                        break;
                    }
                    char charAt2 = this.parseString.charAt(i4);
                    if (charAt2 != '\t') {
                        if (charAt2 == '\n') {
                            this.line++;
                            this.col = this.pos;
                        } else if (charAt2 != '\r') {
                            if (charAt2 == ' ') {
                                this.pos++;
                                if (!this.ignoreWhiteSpace) {
                                    this.formula.add(new SpaceAtom());
                                    this.formula.add(new BreakMarkAtom());
                                    while (true) {
                                        int i5 = this.pos;
                                        if (i5 < this.len && (charAt = this.parseString.charAt(i5)) == ' ' && charAt == '\t' && charAt == '\r') {
                                            this.pos++;
                                        }
                                    }
                                }
                            } else if (charAt2 == '\"') {
                                boolean z2 = this.ignoreWhiteSpace;
                                TeXFormula teXFormula = this.formula;
                                if (z2) {
                                    teXFormula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                    this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                } else {
                                    teXFormula.add(convertCharacter(PRIME, true));
                                    this.formula.add(convertCharacter(PRIME, true));
                                }
                                this.pos++;
                            } else if (charAt2 == '$') {
                                int i6 = this.pos + 1;
                                this.pos = i6;
                                if (!this.ignoreWhiteSpace) {
                                    if (this.parseString.charAt(i6) == '$') {
                                        this.pos++;
                                        z = true;
                                        i = 0;
                                    } else {
                                        i = 2;
                                        z = false;
                                    }
                                    this.formula.add(new MathAtom(new TeXFormula(this, getDollarGroup(DOLLAR), false).root, i));
                                    if (z && this.parseString.charAt(this.pos) == '$') {
                                        this.pos++;
                                    }
                                }
                            } else if (charAt2 == '\\') {
                                Atom processEscape = processEscape();
                                this.formula.add(processEscape);
                                if (this.arrayMode && (processEscape instanceof HlineAtom)) {
                                    ((ArrayOfAtoms) this.formula).addRow();
                                }
                                if (this.insertion) {
                                    this.insertion = false;
                                }
                            } else if (charAt2 == '{') {
                                Atom argument = getArgument();
                                if (argument != null) {
                                    argument.type = 0;
                                }
                                this.formula.add(argument);
                            } else if (charAt2 == 8245) {
                                boolean z3 = this.ignoreWhiteSpace;
                                TeXFormula teXFormula2 = this.formula;
                                if (z3) {
                                    teXFormula2.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("backprime")));
                                } else {
                                    teXFormula2.add(convertCharacter(BACKPRIME, true));
                                }
                                this.pos++;
                            } else if (charAt2 != '&') {
                                if (charAt2 == '\'') {
                                    boolean z4 = this.ignoreWhiteSpace;
                                    TeXFormula teXFormula3 = this.formula;
                                    if (z4) {
                                        teXFormula3.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                    } else {
                                        teXFormula3.add(convertCharacter(PRIME, true));
                                    }
                                    this.pos++;
                                } else if (charAt2 == '^') {
                                    this.formula.add(getScripts(charAt2));
                                } else if (charAt2 == '_') {
                                    boolean z5 = this.ignoreWhiteSpace;
                                    TeXFormula teXFormula4 = this.formula;
                                    if (z5) {
                                        teXFormula4.add(getScripts(charAt2));
                                    } else {
                                        teXFormula4.add(new UnderscoreAtom());
                                        this.pos++;
                                    }
                                } else if (charAt2 != '}') {
                                    TeXFormula teXFormula5 = this.formula;
                                    if (charAt2 != '~') {
                                        teXFormula5.add(convertCharacter(charAt2, false));
                                        this.pos++;
                                    } else {
                                        teXFormula5.add(new SpaceAtom());
                                        this.pos++;
                                    }
                                } else {
                                    int i7 = this.group - 1;
                                    this.group = i7;
                                    this.pos++;
                                    if (i7 == -1) {
                                        throw new ParseException("Found a closing '}' without an opening '{'!");
                                    }
                                }
                            } else {
                                if (!this.arrayMode) {
                                    throw new ParseException("Character '&' is only available in array mode !");
                                }
                                ((ArrayOfAtoms) this.formula).addCol();
                                this.pos++;
                            }
                        }
                    }
                    this.pos++;
                }
            }
            TeXFormula teXFormula6 = this.formula;
            if (teXFormula6.root == null && !this.arrayMode) {
                teXFormula6.add(new EmptyAtom());
            }
        } finally {
            parseDepth--;
        }
    }

    public void reset(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        this.parseString = stringBuffer;
        this.len = stringBuffer.length();
        this.formula.root = null;
        this.pos = 0;
        this.spos = 0;
        this.line = 0;
        this.col = 0;
        this.group = 0;
        this.insertion = false;
        this.atIsLetter = 0;
        this.arrayMode = false;
        this.ignoreWhiteSpace = true;
        firstpass();
    }

    public int rewind(int i) {
        int i2 = this.pos - i;
        this.pos = i2;
        return i2;
    }

    public void setArrayMode(boolean z) {
        this.arrayMode = z;
    }

    public TeXParser(boolean z, String str, TeXFormula teXFormula) {
        this(str, teXFormula, false);
        this.isPartial = z;
        firstpass();
    }

    public TeXParser(String str, TeXFormula teXFormula) {
        this(str, teXFormula, true);
    }

    public TeXParser(String str, TeXFormula teXFormula, boolean z) {
        this(false, str, teXFormula, z);
    }

    public TeXParser(boolean z, String str, ArrayOfAtoms arrayOfAtoms, boolean z2) {
        this(z, str, (TeXFormula) arrayOfAtoms, z2);
        this.arrayMode = true;
    }

    public TeXParser(boolean z, String str, ArrayOfAtoms arrayOfAtoms, boolean z2, boolean z3) {
        this(z, str, (TeXFormula) arrayOfAtoms, z2, z3);
        this.arrayMode = true;
    }

    public TeXParser(String str, ArrayOfAtoms arrayOfAtoms, boolean z) {
        this(false, str, (TeXFormula) arrayOfAtoms, z);
    }

    public TeXParser(boolean z, String str, TeXFormula teXFormula, boolean z2, boolean z3) {
        this(z, str, teXFormula, z2);
        this.ignoreWhiteSpace = z3;
    }

    public TeXParser(String str, TeXFormula teXFormula, boolean z, boolean z2) {
        this(false, str, teXFormula, z);
        this.ignoreWhiteSpace = z2;
    }

    public String getGroup(char c, char c2) {
        int i;
        int i2;
        int i3 = this.pos;
        if (i3 == this.len) {
            return null;
        }
        char charAt = this.parseString.charAt(i3);
        int i4 = this.pos;
        if (i4 < this.len && charAt == c) {
            int i5 = 1;
            while (true) {
                i = this.pos;
                if (i >= this.len - 1 || i5 == 0) {
                    break;
                }
                int i6 = i + 1;
                this.pos = i6;
                char charAt2 = this.parseString.charAt(i6);
                if (charAt2 == c) {
                    i5++;
                } else if (charAt2 == c2) {
                    i5--;
                } else if (charAt2 == '\\' && (i2 = this.pos) != this.len - 1) {
                    this.pos = i2 + 1;
                }
            }
            int i7 = i + 1;
            this.pos = i7;
            StringBuffer stringBuffer = this.parseString;
            int i8 = i4 + 1;
            if (i5 != 0) {
                return stringBuffer.substring(i8, i7);
            }
            return stringBuffer.substring(i8, i);
        }
        throw new ParseException("missing '" + c + "'!");
    }
}
