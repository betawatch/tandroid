package org.scilab.forge.jlatexmath;

import a4.a;
import com.google.android.gms.internal.vision.e2;
import i2.g;
import java.lang.Character;
import java.util.HashSet;
import java.util.Set;
import org.scilab.forge.jlatexmath.TeXFormula;
import ru.noties.jlatexmath.awt.Color;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    public TeXParser(String str, TeXFormula teXFormula) {
        this(str, teXFormula, true);
    }

    private static char convertToRomanNumber(char c10) {
        int i10;
        if (c10 == 1643) {
            return '.';
        }
        if (1632 <= c10 && c10 <= 1641) {
            i10 = c10 - 1584;
        } else if (1776 <= c10 && c10 <= 1785) {
            i10 = c10 - 1728;
        } else if (2406 <= c10 && c10 <= 2415) {
            i10 = c10 - 2358;
        } else if (2534 <= c10 && c10 <= 2543) {
            i10 = c10 - 2486;
        } else if (2662 <= c10 && c10 <= 2671) {
            i10 = c10 - 2614;
        } else if (2790 <= c10 && c10 <= 2799) {
            i10 = c10 - 2742;
        } else if (2918 <= c10 && c10 <= 2927) {
            i10 = c10 - 2870;
        } else if (3174 <= c10 && c10 <= 3183) {
            i10 = c10 - 3126;
        } else if (3430 <= c10 && c10 <= 3439) {
            i10 = c10 - 3382;
        } else if (3664 <= c10 && c10 <= 3673) {
            i10 = c10 - 3616;
        } else if (3792 <= c10 && c10 <= 3801) {
            i10 = c10 - 3744;
        } else if (3872 <= c10 && c10 <= 3881) {
            i10 = c10 - 3728;
        } else if (4160 <= c10 && c10 <= 4169) {
            i10 = c10 - 4112;
        } else if (6112 <= c10 && c10 <= 6121) {
            i10 = c10 - 6064;
        } else if (6160 <= c10 && c10 <= 6169) {
            i10 = c10 - 6112;
        } else if (6992 <= c10 && c10 <= 7001) {
            i10 = c10 - 6944;
        } else if (7088 <= c10 && c10 <= 7097) {
            i10 = c10 - 7040;
        } else if (7232 <= c10 && c10 <= 7241) {
            i10 = c10 - 7184;
        } else if (7248 <= c10 && c10 <= 7257) {
            i10 = c10 - 7200;
        } else {
            if (43216 > c10 || c10 > 43225) {
                return c10;
            }
            i10 = c10 - 43168;
        }
        return (char) i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x05a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void firstpass() {
        int i10;
        char charAt;
        NewCommandMacro.reset();
        lastpassExpansions = 0;
        if (this.len != 0) {
            firstpassExpansionWork = 0L;
            int i11 = 0;
            while (this.pos < this.len) {
                if (this.parseString.length() > 65536) {
                    throw new ParseException("Formula too large after macro expansion");
                }
                char charAt2 = this.parseString.charAt(this.pos);
                if (charAt2 == '%') {
                    int i12 = this.pos;
                    this.pos = i12 + 1;
                    do {
                        int i13 = this.pos;
                        if (i13 < this.len) {
                            StringBuffer stringBuffer = this.parseString;
                            this.pos = i13 + 1;
                            charAt = stringBuffer.charAt(i13);
                            if (charAt != '\r') {
                            }
                        }
                        i10 = this.pos;
                        if (i10 < this.len) {
                            this.pos = i10 - 1;
                        }
                        this.parseString.replace(i12, this.pos, "");
                        this.len = this.parseString.length();
                        this.pos = i12;
                    } while (charAt != '\n');
                    i10 = this.pos;
                    if (i10 < this.len) {
                    }
                    this.parseString.replace(i12, this.pos, "");
                    this.len = this.parseString.length();
                    this.pos = i12;
                } else if (charAt2 == '\\') {
                    int i14 = this.pos;
                    String command = getCommand();
                    if ("newcommand".equals(command) || "renewcommand".equals(command)) {
                        try {
                            MacroInfo.Commands.get(command).invoke(this, getOptsArgs(2, 2));
                        } catch (ParseException e7) {
                            if (!this.isPartial) {
                                throw e7;
                            }
                        }
                        this.parseString.delete(i14, this.pos);
                        this.len = this.parseString.length();
                        this.pos = i14;
                    } else if (NewCommandMacro.isMacro(command)) {
                        i11++;
                        if (i11 > 10000) {
                            throw new ParseException("Macro expansion limit exceeded");
                        }
                        long j3 = firstpassExpansionWork + this.len;
                        firstpassExpansionWork = j3;
                        if (j3 > MAX_FIRSTPASS_WORK) {
                            throw new ParseException("Formula expands too much");
                        }
                        MacroInfo macroInfo = MacroInfo.Commands.get(command);
                        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? 1 : 0);
                        optsArgs[0] = command;
                        try {
                            this.parseString.replace(i14, this.pos, (String) macroInfo.invoke(this, optsArgs));
                        } catch (ParseException e10) {
                            if (!this.isPartial) {
                                throw e10;
                            }
                            i14 += command.length() + 1;
                        }
                        this.len = this.parseString.length();
                        this.pos = i14;
                    } else if ("begin".equals(command)) {
                        String[] optsArgs2 = getOptsArgs(1, 0);
                        MacroInfo macroInfo2 = MacroInfo.Commands.get(optsArgs2[1] + "@env");
                        if (macroInfo2 != null) {
                            i11++;
                            if (i11 > 10000) {
                                throw new ParseException("Macro expansion limit exceeded");
                            }
                            long j10 = firstpassExpansionWork + this.len;
                            firstpassExpansionWork = j10;
                            if (j10 > MAX_FIRSTPASS_WORK) {
                                throw new ParseException("Formula expands too much");
                            }
                            try {
                                String[] optsArgs3 = getOptsArgs(macroInfo2.nbArgs - 1, 0);
                                String group = getGroup("\\begin{" + optsArgs2[1] + "}", "\\end{" + optsArgs2[1] + "}");
                                String str = "{\\makeatletter \\" + optsArgs2[1] + "@env";
                                for (int i15 = 1; i15 <= macroInfo2.nbArgs - 1; i15++) {
                                    str = str + "{" + optsArgs3[i15] + "}";
                                }
                                this.parseString.replace(i14, this.pos, str + "{" + group + "}\\makeatother}");
                                this.len = this.parseString.length();
                                this.pos = i14;
                            } catch (ParseException e11) {
                                if (!this.isPartial) {
                                    throw e11;
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
                    int i16 = this.pos;
                    stringBuffer2.replace(i16, i16 + 1, "^{\\circ}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 == 185) {
                    StringBuffer stringBuffer3 = this.parseString;
                    int i17 = this.pos;
                    stringBuffer3.replace(i17, i17 + 1, "\\jlatexmathcumsup{1}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 == 8304) {
                    StringBuffer stringBuffer4 = this.parseString;
                    int i18 = this.pos;
                    stringBuffer4.replace(i18, i18 + 1, "\\jlatexmathcumsup{0}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 == 178) {
                    StringBuffer stringBuffer5 = this.parseString;
                    int i19 = this.pos;
                    stringBuffer5.replace(i19, i19 + 1, "\\jlatexmathcumsup{2}");
                    this.len = this.parseString.length();
                    this.pos++;
                } else if (charAt2 != 179) {
                    switch (charAt2) {
                        case 8308:
                            StringBuffer stringBuffer6 = this.parseString;
                            int i20 = this.pos;
                            stringBuffer6.replace(i20, i20 + 1, "\\jlatexmathcumsup{4}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8309:
                            StringBuffer stringBuffer7 = this.parseString;
                            int i21 = this.pos;
                            stringBuffer7.replace(i21, i21 + 1, "\\jlatexmathcumsup{5}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8310:
                            StringBuffer stringBuffer8 = this.parseString;
                            int i22 = this.pos;
                            stringBuffer8.replace(i22, i22 + 1, "\\jlatexmathcumsup{6}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8311:
                            StringBuffer stringBuffer9 = this.parseString;
                            int i23 = this.pos;
                            stringBuffer9.replace(i23, i23 + 1, "\\jlatexmathcumsup{7}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8312:
                            StringBuffer stringBuffer10 = this.parseString;
                            int i24 = this.pos;
                            stringBuffer10.replace(i24, i24 + 1, "\\jlatexmathcumsup{8}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8313:
                            StringBuffer stringBuffer11 = this.parseString;
                            int i25 = this.pos;
                            stringBuffer11.replace(i25, i25 + 1, "\\jlatexmathcumsup{9}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8314:
                            StringBuffer stringBuffer12 = this.parseString;
                            int i26 = this.pos;
                            stringBuffer12.replace(i26, i26 + 1, "\\jlatexmathcumsup{+}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8315:
                            StringBuffer stringBuffer13 = this.parseString;
                            int i27 = this.pos;
                            stringBuffer13.replace(i27, i27 + 1, "\\jlatexmathcumsup{-}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8316:
                            StringBuffer stringBuffer14 = this.parseString;
                            int i28 = this.pos;
                            stringBuffer14.replace(i28, i28 + 1, "\\jlatexmathcumsup{=}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8317:
                            StringBuffer stringBuffer15 = this.parseString;
                            int i29 = this.pos;
                            stringBuffer15.replace(i29, i29 + 1, "\\jlatexmathcumsup{(}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8318:
                            StringBuffer stringBuffer16 = this.parseString;
                            int i30 = this.pos;
                            stringBuffer16.replace(i30, i30 + 1, "\\jlatexmathcumsup{)}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8319:
                            StringBuffer stringBuffer17 = this.parseString;
                            int i31 = this.pos;
                            stringBuffer17.replace(i31, i31 + 1, "\\jlatexmathcumsup{n}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8320:
                            StringBuffer stringBuffer18 = this.parseString;
                            int i32 = this.pos;
                            stringBuffer18.replace(i32, i32 + 1, "\\jlatexmathcumsub{0}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8321:
                            StringBuffer stringBuffer19 = this.parseString;
                            int i33 = this.pos;
                            stringBuffer19.replace(i33, i33 + 1, "\\jlatexmathcumsub{1}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8322:
                            StringBuffer stringBuffer20 = this.parseString;
                            int i34 = this.pos;
                            stringBuffer20.replace(i34, i34 + 1, "\\jlatexmathcumsub{2}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8323:
                            StringBuffer stringBuffer21 = this.parseString;
                            int i35 = this.pos;
                            stringBuffer21.replace(i35, i35 + 1, "\\jlatexmathcumsub{3}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8324:
                            StringBuffer stringBuffer22 = this.parseString;
                            int i36 = this.pos;
                            stringBuffer22.replace(i36, i36 + 1, "\\jlatexmathcumsub{4}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8325:
                            StringBuffer stringBuffer23 = this.parseString;
                            int i37 = this.pos;
                            stringBuffer23.replace(i37, i37 + 1, "\\jlatexmathcumsub{5}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8326:
                            StringBuffer stringBuffer24 = this.parseString;
                            int i38 = this.pos;
                            stringBuffer24.replace(i38, i38 + 1, "\\jlatexmathcumsub{6}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8327:
                            StringBuffer stringBuffer25 = this.parseString;
                            int i39 = this.pos;
                            stringBuffer25.replace(i39, i39 + 1, "\\jlatexmathcumsub{7}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8328:
                            StringBuffer stringBuffer26 = this.parseString;
                            int i40 = this.pos;
                            stringBuffer26.replace(i40, i40 + 1, "\\jlatexmathcumsub{8}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8329:
                            StringBuffer stringBuffer27 = this.parseString;
                            int i41 = this.pos;
                            stringBuffer27.replace(i41, i41 + 1, "\\jlatexmathcumsub{9}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8330:
                            StringBuffer stringBuffer28 = this.parseString;
                            int i42 = this.pos;
                            stringBuffer28.replace(i42, i42 + 1, "\\jlatexmathcumsub{+}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8331:
                            StringBuffer stringBuffer29 = this.parseString;
                            int i43 = this.pos;
                            stringBuffer29.replace(i43, i43 + 1, "\\jlatexmathcumsub{-}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8332:
                            StringBuffer stringBuffer30 = this.parseString;
                            int i44 = this.pos;
                            stringBuffer30.replace(i44, i44 + 1, "\\jlatexmathcumsub{=}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8333:
                            StringBuffer stringBuffer31 = this.parseString;
                            int i45 = this.pos;
                            stringBuffer31.replace(i45, i45 + 1, "\\jlatexmathcumsub{(}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        case 8334:
                            StringBuffer stringBuffer32 = this.parseString;
                            int i46 = this.pos;
                            stringBuffer32.replace(i46, i46 + 1, "\\jlatexmathcumsub{)}");
                            this.len = this.parseString.length();
                            this.pos++;
                            break;
                        default:
                            this.pos++;
                            break;
                    }
                } else {
                    StringBuffer stringBuffer33 = this.parseString;
                    int i47 = this.pos;
                    stringBuffer33.replace(i47, i47 + 1, "\\jlatexmathcumsup{3}");
                    this.len = this.parseString.length();
                    this.pos++;
                }
            }
            this.pos = 0;
            this.len = this.parseString.length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getCommand() {
        int i10;
        int i11 = this.pos + 1;
        this.pos = i11;
        char c10 = 0;
        while (true) {
            int i12 = this.pos;
            if (i12 >= this.len || (((c10 = this.parseString.charAt(i12)) < 'a' || c10 > 'z') && ((c10 < 'A' || c10 > 'Z') && (this.atIsLetter == 0 || c10 != '@')))) {
                break;
            }
            this.pos++;
        }
        int i13 = this.pos;
        if (i13 == i11) {
            this.pos = i13 + 1;
        }
        String substring = this.parseString.substring(i11, this.pos);
        if ("cr".equals(substring) && (i10 = this.pos) < this.len && this.parseString.charAt(i10) == ' ') {
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
        int i10 = 0;
        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? macroInfo.posOpts : 0);
        StringBuffer stringBuffer = new StringBuffer("\\");
        stringBuffer.append(str);
        for (int i11 = 0; i11 < macroInfo.posOpts; i11++) {
            String str2 = optsArgs[macroInfo.nbArgs + i11 + 1];
            if (str2 != null) {
                stringBuffer.append("[");
                stringBuffer.append(str2);
                stringBuffer.append("]");
            }
        }
        while (i10 < macroInfo.nbArgs) {
            i10++;
            String str3 = optsArgs[i10];
            if (str3 != null) {
                stringBuffer.append("{");
                stringBuffer.append(str3);
                stringBuffer.append("}");
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Atom getScripts(char c10) {
        Atom atom;
        Atom atom2;
        this.pos++;
        Atom argument = getArgument();
        int i10 = this.pos;
        char charAt = i10 < this.len ? this.parseString.charAt(i10) : (char) 0;
        if (c10 != '^' || charAt != '^') {
            if (c10 == '_' && charAt == '^') {
                this.pos++;
                atom = getArgument();
            } else if (c10 == '^' && charAt == '_') {
                this.pos++;
                argument = getArgument();
                atom = argument;
            } else if (c10 != '^' || charAt == '_') {
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

    private void insert(int i10, int i11, String str) {
        this.parseString.replace(i10, i11, str);
        this.len = this.parseString.length();
        this.pos = i10;
        this.insertion = true;
    }

    private Atom processCommands(String str) {
        MacroInfo macroInfo = MacroInfo.Commands.get(str);
        String[] optsArgs = getOptsArgs(macroInfo.nbArgs, macroInfo.hasOptions ? macroInfo.posOpts : 0);
        optsArgs[0] = str;
        if (!NewCommandMacro.isMacro(str)) {
            return (Atom) macroInfo.invoke(this, optsArgs);
        }
        int i10 = lastpassExpansions + 1;
        lastpassExpansions = i10;
        if (i10 > 10000) {
            throw new ParseException("Macro expansion limit exceeded");
        }
        insert(this.spos, this.pos, (String) macroInfo.invoke(this, optsArgs));
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
                throw new ParseException(a.p("Unknown symbol or command or predefined TeXFormula: '", command, "'"));
            }
        } catch (FormulaNotFoundException unused2) {
            return SymbolAtom.get(command);
        }
    }

    private final void skipWhiteSpace() {
        while (true) {
            int i10 = this.pos;
            if (i10 >= this.len) {
                return;
            }
            char charAt = this.parseString.charAt(i10);
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
        if (!this.arrayMode) {
            throw new ParseException("You can add a row only in array mode !");
        }
        ((ArrayOfAtoms) this.formula).addRow();
    }

    public Atom convertCharacter(char c10, boolean z10) {
        String str;
        String[] strArr;
        if (this.ignoreWhiteSpace) {
            if (c10 >= 945 && c10 <= 969) {
                return SymbolAtom.get(TeXFormula.symbolMappings[c10]);
            }
            if (c10 >= 913 && c10 <= 937) {
                return new TeXFormula(TeXFormula.symbolFormulaMappings[c10]).root;
            }
        }
        char convertToRomanNumber = convertToRomanNumber(c10);
        if ((convertToRomanNumber >= '0' && convertToRomanNumber <= '9') || ((convertToRomanNumber >= 'a' && convertToRomanNumber <= 'z') || (convertToRomanNumber >= 'A' && convertToRomanNumber <= 'Z'))) {
            TeXFormula.FontInfos fontInfos = TeXFormula.externalFontMap.get(Character.UnicodeBlock.BASIC_LATIN);
            if (fontInfos == null) {
                return new CharAtom(convertToRomanNumber, this.formula.textStyle, this.ignoreWhiteSpace);
            }
            if (z10) {
                return new JavaFontRenderingAtom(Character.toString(convertToRomanNumber), fontInfos);
            }
            int i10 = this.pos;
            this.pos = i10 + 1;
            int i11 = this.len - 1;
            while (true) {
                int i12 = this.pos;
                if (i12 >= this.len) {
                    break;
                }
                char charAt = this.parseString.charAt(i12);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
                    break;
                }
                this.pos++;
            }
            i11 = this.pos - 1;
            this.pos = i11;
            return new JavaFontRenderingAtom(this.parseString.substring(i10, i11 + 1), fontInfos);
        }
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(convertToRomanNumber);
        if (!isLoading && !DefaultTeXFont.loadedAlphabets.contains(of2)) {
            DefaultTeXFont.addAlphabet(DefaultTeXFont.registeredAlphabets.get(of2));
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
            } catch (SymbolNotFoundException e7) {
                throw new ParseException("The character '" + Character.toString(convertToRomanNumber) + "' was mapped to an unknown symbol with the name '" + str2 + "'!", e7);
            }
        }
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.BASIC_LATIN;
        boolean equals = unicodeBlock.equals(of2);
        TeXFormula.FontInfos externalFont = (!(equals && TeXFormula.isRegisteredBlock(unicodeBlock)) && equals) ? null : TeXFormula.getExternalFont(of2);
        if (externalFont == null) {
            if (this.isPartial) {
                return new ColorAtom(new RomanAtom(new TeXFormula(g.j(convertToRomanNumber, "\\text{(Unknown char ", ")}")).root), (Color) null, Color.RED);
            }
            throw new ParseException("Unknown character : '" + Character.toString(convertToRomanNumber) + "' (or " + ((int) convertToRomanNumber) + ")");
        }
        if (z10) {
            return new JavaFontRenderingAtom(Character.toString(convertToRomanNumber), externalFont);
        }
        int i13 = this.pos;
        this.pos = i13 + 1;
        int i14 = this.len - 1;
        while (true) {
            int i15 = this.pos;
            if (i15 >= this.len) {
                break;
            }
            if (!Character.UnicodeBlock.of(this.parseString.charAt(i15)).equals(of2)) {
                i14 = this.pos - 1;
                this.pos = i14;
                break;
            }
            this.pos++;
        }
        return new JavaFontRenderingAtom(this.parseString.substring(i13, i14 + 1), externalFont);
    }

    public void finish() {
        this.pos = this.parseString.length();
    }

    public Atom getArgument() {
        skipWhiteSpace();
        int i10 = this.pos;
        if (i10 >= this.len) {
            return new EmptyAtom();
        }
        char charAt = this.parseString.charAt(i10);
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

    public String getDollarGroup(char c10) {
        char charAt;
        int i10;
        int i11 = this.pos;
        do {
            StringBuffer stringBuffer = this.parseString;
            int i12 = this.pos;
            this.pos = i12 + 1;
            charAt = stringBuffer.charAt(i12);
            if (charAt == '\\') {
                this.pos++;
            }
            i10 = this.pos;
            if (i10 >= this.len) {
                break;
            }
        } while (charAt != c10);
        return charAt == c10 ? this.parseString.substring(i11, i10 - 1) : this.parseString.substring(i11, i10);
    }

    public Atom getFormulaAtom() {
        TeXFormula teXFormula = this.formula;
        Atom atom = teXFormula.root;
        teXFormula.root = null;
        return atom;
    }

    public String getGroup(char c10, char c11) {
        int i10;
        int i11;
        int i12 = this.pos;
        if (i12 == this.len) {
            return null;
        }
        char charAt = this.parseString.charAt(i12);
        int i13 = this.pos;
        if (i13 >= this.len || charAt != c10) {
            throw new ParseException("missing '" + c10 + "'!");
        }
        int i14 = 1;
        while (true) {
            i10 = this.pos;
            if (i10 >= this.len - 1 || i14 == 0) {
                break;
            }
            int i15 = i10 + 1;
            this.pos = i15;
            char charAt2 = this.parseString.charAt(i15);
            if (charAt2 == c10) {
                i14++;
            } else if (charAt2 == c11) {
                i14--;
            } else if (charAt2 == '\\' && (i11 = this.pos) != this.len - 1) {
                this.pos = i11 + 1;
            }
        }
        int i16 = i10 + 1;
        this.pos = i16;
        return i14 != 0 ? this.parseString.substring(i13 + 1, i16) : this.parseString.substring(i13 + 1, i10);
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
        int i10 = this.pos;
        char c10 = 0;
        while (true) {
            int i11 = this.pos;
            if (i11 >= this.len || c10 == ' ') {
                break;
            }
            StringBuffer stringBuffer = this.parseString;
            this.pos = i11 + 1;
            c10 = stringBuffer.charAt(i11);
        }
        skipWhiteSpace();
        return SpaceAtom.getLength(this.parseString.substring(i10, this.pos - 1));
    }

    public int getLine() {
        return this.line;
    }

    public String[] getOptsArgs(int i10, int i11) {
        if (i10 < 0 || i10 > 256) {
            i10 = 256;
        }
        String[] strArr = new String[i10 + 11];
        if (i10 != 0) {
            if (i11 == 1) {
                for (int i12 = i10 + 1; i12 < i10 + 11; i12++) {
                    try {
                        skipWhiteSpace();
                        strArr[i12] = getGroup(L_BRACK, R_BRACK);
                    } catch (ParseException unused) {
                        strArr[i12] = null;
                    }
                }
            }
            skipWhiteSpace();
            try {
                strArr[1] = getGroup(L_GROUP, R_GROUP);
            } catch (ParseException unused2) {
                if (this.parseString.charAt(this.pos) != '\\') {
                    strArr[1] = "" + this.parseString.charAt(this.pos);
                    this.pos = this.pos + 1;
                } else {
                    strArr[1] = getCommandWithArgs(getCommand());
                }
            }
            if (i11 == 2) {
                for (int i13 = i10 + 1; i13 < i10 + 11; i13++) {
                    try {
                        skipWhiteSpace();
                        strArr[i13] = getGroup(L_BRACK, R_BRACK);
                    } catch (ParseException unused3) {
                        strArr[i13] = null;
                    }
                }
            }
            for (int i14 = 2; i14 <= i10; i14++) {
                skipWhiteSpace();
                try {
                    strArr[i14] = getGroup(L_GROUP, R_GROUP);
                } catch (ParseException unused4) {
                    if (this.parseString.charAt(this.pos) != '\\') {
                        strArr[i14] = "" + this.parseString.charAt(this.pos);
                        this.pos = this.pos + 1;
                    } else {
                        strArr[i14] = getCommandWithArgs(getCommand());
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
        int i10;
        String substring;
        int i11 = this.pos;
        if (i11 == this.len) {
            return null;
        }
        char c10 = 0;
        int i12 = 1;
        char c11 = 0;
        while (true) {
            i10 = this.pos;
            if (i10 >= this.len || i12 == 0) {
                break;
            }
            c11 = this.parseString.charAt(i10);
            if (c11 != '&') {
                if (c11 == '\\') {
                    int i13 = this.pos + 1;
                    this.pos = i13;
                    if (i13 < this.len && this.parseString.charAt(i13) == '\\' && i12 == 1) {
                        i12--;
                        this.pos--;
                    } else {
                        int i14 = this.pos;
                        if (i14 < this.len - 1 && this.parseString.charAt(i14) == 'c' && this.parseString.charAt(this.pos + 1) == 'r' && i12 == 1) {
                            i12--;
                            this.pos--;
                        }
                    }
                } else if (c11 != '{') {
                    if (c11 != '}') {
                    }
                    i12--;
                } else {
                    i12++;
                }
                this.pos++;
            } else {
                if (i12 != 1) {
                    this.pos++;
                }
                i12--;
                this.pos++;
            }
        }
        if (i12 >= 2) {
            throw new ParseException("Illegal end,  missing '}' !");
        }
        if (i12 == 0) {
            substring = this.parseString.substring(i11, i10 - 1);
            c10 = c11;
        } else {
            substring = this.parseString.substring(i11, i10);
        }
        if (c10 != '&' && c10 != '\\' && c10 != '}') {
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

    public final boolean isValidCharacterInCommand(char c10) {
        if (Character.isLetter(c10)) {
            return true;
        }
        return this.atIsLetter != 0 && c10 == '@';
    }

    public final boolean isValidName(String str) {
        char c10 = 0;
        if (str == null || "".equals(str) || str.charAt(0) != '\\') {
            return false;
        }
        int length = str.length();
        for (int i10 = 1; i10 < length; i10++) {
            c10 = str.charAt(i10);
            if (!Character.isLetter(c10) && (this.atIsLetter == 0 || c10 != '@')) {
                break;
            }
        }
        return Character.isLetter(c10);
    }

    public void makeAtLetter() {
        this.atIsLetter++;
    }

    public void makeAtOther() {
        this.atIsLetter--;
    }

    public void parse() {
        int i10;
        boolean z10;
        char charAt;
        int i11 = parseDepth;
        int i12 = i11 + 1;
        parseDepth = i12;
        if (i12 > 64) {
            parseDepth = i11;
            throw new DepthLimitExceededException();
        }
        try {
            if (this.len != 0) {
                while (true) {
                    int i13 = this.pos;
                    if (i13 >= this.len) {
                        break;
                    }
                    char charAt2 = this.parseString.charAt(i13);
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
                                        int i14 = this.pos;
                                        if (i14 < this.len && (charAt = this.parseString.charAt(i14)) == ' ' && charAt == '\t' && charAt == '\r') {
                                            this.pos++;
                                        }
                                    }
                                }
                            } else if (charAt2 == '\"') {
                                if (this.ignoreWhiteSpace) {
                                    this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                    this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                } else {
                                    this.formula.add(convertCharacter(PRIME, true));
                                    this.formula.add(convertCharacter(PRIME, true));
                                }
                                this.pos++;
                            } else if (charAt2 == '$') {
                                int i15 = this.pos + 1;
                                this.pos = i15;
                                if (!this.ignoreWhiteSpace) {
                                    if (this.parseString.charAt(i15) == '$') {
                                        this.pos++;
                                        i10 = 0;
                                        z10 = true;
                                    } else {
                                        i10 = 2;
                                        z10 = false;
                                    }
                                    this.formula.add(new MathAtom(new TeXFormula(this, getDollarGroup(DOLLAR), false).root, i10));
                                    if (z10 && this.parseString.charAt(this.pos) == '$') {
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
                                if (this.ignoreWhiteSpace) {
                                    this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("backprime")));
                                } else {
                                    this.formula.add(convertCharacter(BACKPRIME, true));
                                }
                                this.pos++;
                            } else if (charAt2 != '&') {
                                if (charAt2 == '\'') {
                                    if (this.ignoreWhiteSpace) {
                                        this.formula.add(new CumulativeScriptsAtom(getLastAtom(), null, SymbolAtom.get("prime")));
                                    } else {
                                        this.formula.add(convertCharacter(PRIME, true));
                                    }
                                    this.pos++;
                                } else if (charAt2 == '^') {
                                    this.formula.add(getScripts(charAt2));
                                } else if (charAt2 != '_') {
                                    if (charAt2 == '}') {
                                        int i16 = this.group - 1;
                                        this.group = i16;
                                        this.pos++;
                                        if (i16 == -1) {
                                            throw new ParseException("Found a closing '}' without an opening '{'!");
                                        }
                                    } else if (charAt2 != '~') {
                                        this.formula.add(convertCharacter(charAt2, false));
                                        this.pos++;
                                    } else {
                                        this.formula.add(new SpaceAtom());
                                        this.pos++;
                                    }
                                } else if (this.ignoreWhiteSpace) {
                                    this.formula.add(getScripts(charAt2));
                                } else {
                                    this.formula.add(new UnderscoreAtom());
                                    this.pos++;
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
            TeXFormula teXFormula = this.formula;
            if (teXFormula.root == null && !this.arrayMode) {
                teXFormula.add(new EmptyAtom());
            }
            parseDepth--;
        } catch (Throwable th2) {
            parseDepth--;
            throw th2;
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

    public int rewind(int i10) {
        int i11 = this.pos - i10;
        this.pos = i11;
        return i11;
    }

    public void setArrayMode(boolean z10) {
        this.arrayMode = z10;
    }

    public TeXParser(boolean z10, String str, TeXFormula teXFormula) {
        this(str, teXFormula, false);
        this.isPartial = z10;
        firstpass();
    }

    public TeXParser(boolean z10, String str, TeXFormula teXFormula, boolean z11) {
        this.ignoreWhiteSpace = true;
        this.formula = teXFormula;
        this.isPartial = z10;
        if (str != null) {
            this.parseString = new StringBuffer(str);
            this.len = str.length();
            this.pos = 0;
            if (z11) {
                firstpass();
                return;
            }
            return;
        }
        this.parseString = null;
        this.pos = 0;
        this.len = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (isValidCharacterInCommand(r8) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getGroup(String str, String str2) {
        int i10;
        int length = str.length();
        int length2 = str2.length();
        boolean isValidCharacterInCommand = isValidCharacterInCommand(str.charAt(length - 1));
        boolean isValidCharacterInCommand2 = isValidCharacterInCommand(str2.charAt(length2 - 1));
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 1;
        int i12 = 0;
        char c10 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.pos;
            if (i15 >= this.len || i11 == 0) {
                break;
            }
            char charAt = this.parseString.charAt(i15);
            if (c10 != '\\' && charAt == ' ') {
                while (true) {
                    int i16 = this.pos;
                    if (i16 >= this.len) {
                        break;
                    }
                    StringBuffer stringBuffer2 = this.parseString;
                    this.pos = i16 + 1;
                    if (stringBuffer2.charAt(i16) != ' ') {
                        break;
                    }
                    stringBuffer.append(' ');
                }
                StringBuffer stringBuffer3 = this.parseString;
                int i17 = this.pos - 1;
                this.pos = i17;
                charAt = stringBuffer3.charAt(i17);
                if (isValidCharacterInCommand(c10) && isValidCharacterInCommand(charAt)) {
                    c10 = charAt;
                    i13 = 0;
                    i14 = 0;
                    i13 = c10 != str.charAt(i13) ? i13 + 1 : 0;
                    if (c10 != str2.charAt(i14)) {
                        if (i14 == 0) {
                            i12 = this.pos;
                        }
                        i14++;
                    } else {
                        i14 = 0;
                    }
                    i10 = this.pos;
                    if (i10 + 1 >= this.len) {
                        char charAt2 = this.parseString.charAt(i10 + 1);
                        if (i13 == length) {
                            if (!isValidCharacterInCommand || !isValidCharacterInCommand(charAt2)) {
                                i11++;
                            }
                            i13 = 0;
                        }
                        if (i14 != length2) {
                            stringBuffer.append(c10);
                            this.pos++;
                        } else {
                            if (isValidCharacterInCommand2) {
                            }
                            i11--;
                        }
                    } else {
                        if (i13 == length) {
                            i11++;
                            i13 = 0;
                        }
                        if (i14 != length2) {
                            stringBuffer.append(c10);
                            this.pos++;
                        }
                        i11--;
                    }
                    i14 = 0;
                    stringBuffer.append(c10);
                    this.pos++;
                }
            }
            c10 = charAt;
            if (c10 != str.charAt(i13)) {
            }
            if (c10 != str2.charAt(i14)) {
            }
            i10 = this.pos;
            if (i10 + 1 >= this.len) {
            }
            i14 = 0;
            stringBuffer.append(c10);
            this.pos++;
        }
        if (i11 != 0) {
            if (this.isPartial) {
                return stringBuffer.toString();
            }
            throw new ParseException(e2.j("The token ", str, " must be closed by ", str2));
        }
        return stringBuffer.substring(0, (stringBuffer.length() - this.pos) + i12);
    }

    public TeXParser(String str, TeXFormula teXFormula, boolean z10) {
        this(false, str, teXFormula, z10);
    }

    public TeXParser(boolean z10, String str, ArrayOfAtoms arrayOfAtoms, boolean z11) {
        this(z10, str, (TeXFormula) arrayOfAtoms, z11);
        this.arrayMode = true;
    }

    public TeXParser(boolean z10, String str, ArrayOfAtoms arrayOfAtoms, boolean z11, boolean z12) {
        this(z10, str, (TeXFormula) arrayOfAtoms, z11, z12);
        this.arrayMode = true;
    }

    public TeXParser(String str, ArrayOfAtoms arrayOfAtoms, boolean z10) {
        this(false, str, (TeXFormula) arrayOfAtoms, z10);
    }

    public TeXParser(boolean z10, String str, TeXFormula teXFormula, boolean z11, boolean z12) {
        this(z10, str, teXFormula, z11);
        this.ignoreWhiteSpace = z12;
    }

    public TeXParser(String str, TeXFormula teXFormula, boolean z10, boolean z11) {
        this(false, str, teXFormula, z10);
        this.ignoreWhiteSpace = z11;
    }
}
