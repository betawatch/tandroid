package org.scilab.forge.jlatexmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Cells.f1;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.awt.Font;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class DefaultTeXFont implements TeXFont {
    protected static final int BOT = 3;
    protected static final int CAPITALS = 1;
    protected static final int DEPTH = 2;
    protected static final int HEIGHT = 1;
    protected static final int IT = 3;
    protected static final int MID = 1;
    protected static final int NONE = -1;
    protected static final int NUMBERS = 0;
    protected static final int REP = 2;
    protected static final int SMALL = 2;
    protected static final int TOP = 0;
    protected static final int UNICODE = 3;
    protected static final int WIDTH = 0;
    private static String[] defaultTextStyleMappings = null;
    private static FontInfo[] fontInfo = null;
    private static Map<String, Number> generalSettings = null;
    private static boolean magnificationEnable = true;
    private static Map<String, Float> parameters;
    private static Map<String, CharFont> symbolMappings;
    private static Map<String, CharFont[]> textStyleMappings;
    protected float factor;
    public boolean isBold;
    public boolean isIt;
    public boolean isRoman;
    public boolean isSs;
    public boolean isTt;
    private final float size;
    public static List<Character.UnicodeBlock> loadedAlphabets = new ArrayList();
    public static Map<Character.UnicodeBlock, AlphabetRegistration> registeredAlphabets = new HashMap();

    static {
        fontInfo = new FontInfo[0];
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser();
        loadedAlphabets.add(Character.UnicodeBlock.of('a'));
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        parameters = defaultTeXFontParser.parseParameters();
        textStyleMappings = defaultTeXFontParser.parseTextStyleMappings();
        defaultTextStyleMappings = defaultTeXFontParser.parseDefaultTextStyleMappings();
        symbolMappings = defaultTeXFontParser.parseSymbolMappings();
        Map<String, Number> parseGeneralSettings = defaultTeXFontParser.parseGeneralSettings();
        generalSettings = parseGeneralSettings;
        parseGeneralSettings.put("textfactor", 1);
        int intValue = generalSettings.get(DefaultTeXFontParser.MUFONTID_ATTR).intValue();
        if (intValue >= 0) {
            FontInfo[] fontInfoArr = fontInfo;
            if (intValue < fontInfoArr.length && fontInfoArr[intValue] != null) {
                return;
            }
        }
        throw new XMLResourceParseException(DefaultTeXFontParser.RESOURCE_NAME, DefaultTeXFontParser.GEN_SET_EL, DefaultTeXFontParser.MUFONTID_ATTR, "contains an unknown font id!");
    }

    public DefaultTeXFont(float f10) {
        this.factor = 1.0f;
        this.isBold = false;
        this.isRoman = false;
        this.isSs = false;
        this.isTt = false;
        this.isIt = false;
        this.size = f10;
    }

    public static void addAlphabet(Character.UnicodeBlock unicodeBlock, String str) {
        String q10 = f1.q("fonts/", str, "/language_", str, ".xml");
        String q11 = f1.q("fonts/", str, "/symbols_", str, ".xml");
        String q12 = f1.q("fonts/", str, "/mappings_", str, ".xml");
        try {
            addAlphabet(unicodeBlock, JLatexMathAndroid.getResourceAsStream(q10), q10, JLatexMathAndroid.getResourceAsStream(q11), q11, JLatexMathAndroid.getResourceAsStream(q12), q12);
        } catch (FontAlreadyLoadedException unused) {
        }
    }

    public static void addTeXFontDescription(String str) {
        try {
            addTeXFontDescription(new FileInputStream(str), str);
        } catch (FileNotFoundException e10) {
            throw new ResourceParseException(str, e10);
        }
    }

    public static void enableMagnification(boolean z10) {
        magnificationEnable = z10;
    }

    private Char getChar(char c2, CharFont[] charFontArr, int i3) {
        char c10;
        int i10;
        if (c2 >= '0' && c2 <= '9') {
            i10 = c2 - '0';
            c10 = 0;
        } else if (c2 >= 'a' && c2 <= 'z') {
            i10 = c2 - 'a';
            c10 = 2;
        } else if (c2 < 'A' || c2 > 'Z') {
            c10 = 3;
            i10 = c2;
        } else {
            i10 = c2 - 'A';
            c10 = 1;
        }
        CharFont charFont = charFontArr[c10];
        return charFont == null ? getDefaultChar(c2, i3) : getChar(new CharFont((char) (charFont.c + i10), charFont.fontId), i3);
    }

    private Metrics getMetrics(CharFont charFont, float f10) {
        float[] metrics = fontInfo[charFont.fontId].getMetrics(charFont.c);
        return new Metrics(metrics[0], metrics[1], metrics[2], metrics[3], f10 * TeXFormula.PIXELS_PER_POINT, f10);
    }

    private static float getParameter(String str) {
        Float f10 = parameters.get(str);
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public static float getSizeFactor(int i3) {
        if (i3 < 2) {
            return 1.0f;
        }
        return i3 < 4 ? generalSettings.get("textfactor").floatValue() : i3 < 6 ? generalSettings.get("scriptfactor").floatValue() : generalSettings.get("scriptscriptfactor").floatValue();
    }

    public static void registerAlphabet(AlphabetRegistration alphabetRegistration) {
        for (Character.UnicodeBlock unicodeBlock : alphabetRegistration.getUnicodeBlock()) {
            registeredAlphabets.put(unicodeBlock, alphabetRegistration);
        }
    }

    public static void setMagnification(float f10) {
        if (magnificationEnable) {
            TeXIcon.magFactor = f10 / 1000.0f;
        }
    }

    public static void setMathSizes(float f10, float f11, float f12, float f13) {
        if (magnificationEnable) {
            generalSettings.put("scriptfactor", Float.valueOf(Math.abs(f12 / f10)));
            generalSettings.put("scriptscriptfactor", Float.valueOf(Math.abs(f13 / f10)));
            generalSettings.put("textfactor", Float.valueOf(Math.abs(f11 / f10)));
            TeXIcon.defaultSize = Math.abs(f10);
        }
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public TeXFont copy() {
        return new DefaultTeXFont(this.size, this.factor, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public TeXFont deriveFont(float f10) {
        return new DefaultTeXFont(f10, this.factor, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getAxisHeight(int i3) {
        return getSizeFactor(i3) * getParameter("axisheight") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing1(int i3) {
        return getSizeFactor(i3) * getParameter("bigopspacing1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing2(int i3) {
        return getSizeFactor(i3) * getParameter("bigopspacing2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing3(int i3) {
        return getSizeFactor(i3) * getParameter("bigopspacing3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing4(int i3) {
        return getSizeFactor(i3) * getParameter("bigopspacing4") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing5(int i3) {
        return getSizeFactor(i3) * getParameter("bigopspacing5") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getBold() {
        return this.isBold;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getDefaultChar(char c2, int i3) {
        return (c2 < '0' || c2 > '9') ? (c2 < 'a' || c2 > 'z') ? getChar(c2, defaultTextStyleMappings[1], i3) : getChar(c2, defaultTextStyleMappings[2], i3) : getChar(c2, defaultTextStyleMappings[0], i3);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getDefaultRuleThickness(int i3) {
        return getSizeFactor(i3) * getParameter("defaultrulethickness") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getDenom1(int i3) {
        return getSizeFactor(i3) * getParameter("denom1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getDenom2(int i3) {
        return getSizeFactor(i3) * getParameter("denom2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getEM(int i3) {
        return getSizeFactor(i3) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Extension getExtension(Char r10, int i3) {
        Font font = r10.getFont();
        int fontCode = r10.getFontCode();
        float sizeFactor = getSizeFactor(i3);
        int[] extension = fontInfo[fontCode].getExtension(r10.getChar());
        Char[] charArr = new Char[extension.length];
        for (int i10 = 0; i10 < extension.length; i10++) {
            int i11 = extension[i10];
            if (i11 == -1) {
                charArr[i10] = null;
            } else {
                charArr[i10] = new Char((char) i11, font, fontCode, getMetrics(new CharFont((char) i11, fontCode), sizeFactor));
            }
        }
        return new Extension(charArr[0], charArr[1], charArr[2], charArr[3]);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getIt() {
        return this.isIt;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getKern(CharFont charFont, CharFont charFont2, int i3) {
        int i10 = charFont.fontId;
        if (i10 == charFont2.fontId) {
            return fontInfo[i10].getKern(charFont.c, charFont2.c, getSizeFactor(i3) * TeXFormula.PIXELS_PER_POINT);
        }
        return 0.0f;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public CharFont getLigature(CharFont charFont, CharFont charFont2) {
        int i3 = charFont.fontId;
        if (i3 == charFont2.fontId) {
            return fontInfo[i3].getLigature(charFont.c, charFont2.c);
        }
        return null;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public int getMuFontId() {
        return generalSettings.get(DefaultTeXFontParser.MUFONTID_ATTR).intValue();
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getNextLarger(Char r5, int i3) {
        CharFont nextLarger = fontInfo[r5.getFontCode()].getNextLarger(r5.getChar());
        return new Char(nextLarger.c, fontInfo[nextLarger.fontId].getFont(), nextLarger.fontId, getMetrics(nextLarger, getSizeFactor(i3)));
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getNum1(int i3) {
        return getSizeFactor(i3) * getParameter("num1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getNum2(int i3) {
        return getSizeFactor(i3) * getParameter("num2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getNum3(int i3) {
        return getSizeFactor(i3) * getParameter("num3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getQuad(int i3, int i10) {
        return fontInfo[i10].getQuad(getSizeFactor(i3) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getRoman() {
        return this.isRoman;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getScaleFactor() {
        return this.factor;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSize() {
        return this.size;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSkew(CharFont charFont, int i3) {
        char skewChar = fontInfo[charFont.fontId].getSkewChar();
        if (skewChar == 65535) {
            return 0.0f;
        }
        return getKern(charFont, new CharFont(skewChar, charFont.fontId), i3);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSpace(int i3) {
        return fontInfo[generalSettings.get(DefaultTeXFontParser.SPACEFONTID_ATTR).intValue()].getSpace(getSizeFactor(i3) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getSs() {
        return this.isSs;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSub1(int i3) {
        return getSizeFactor(i3) * getParameter("sub1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSub2(int i3) {
        return getSizeFactor(i3) * getParameter("sub2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSubDrop(int i3) {
        return getSizeFactor(i3) * getParameter("subdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSup1(int i3) {
        return getSizeFactor(i3) * getParameter("sup1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSup2(int i3) {
        return getSizeFactor(i3) * getParameter("sup2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSup3(int i3) {
        return getSizeFactor(i3) * getParameter("sup3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSupDrop(int i3) {
        return getSizeFactor(i3) * getParameter("supdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getTt() {
        return this.isTt;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getXHeight(int i3, int i10) {
        return fontInfo[i10].getXHeight(getSizeFactor(i3) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean hasNextLarger(Char r32) {
        return fontInfo[r32.getFontCode()].getNextLarger(r32.getChar()) != null;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean hasSpace(int i3) {
        return fontInfo[i3].hasSpace();
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean isExtensionChar(Char r32) {
        return fontInfo[r32.getFontCode()].getExtension(r32.getChar()) != null;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public TeXFont scaleFont(float f10) {
        return new DefaultTeXFont(this.size, f10, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setBold(boolean z10) {
        this.isBold = z10;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setIt(boolean z10) {
        this.isIt = z10;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setRoman(boolean z10) {
        this.isRoman = z10;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setSs(boolean z10) {
        this.isSs = z10;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setTt(boolean z10) {
        this.isTt = z10;
    }

    public static void addTeXFontDescription(InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getChar(char c2, String str, int i3) {
        CharFont[] charFontArr = textStyleMappings.get(str);
        if (charFontArr != null) {
            return getChar(c2, charFontArr, i3);
        }
        throw new TextStyleMappingNotFoundException(str);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getChar(CharFont charFont, int i3) {
        float sizeFactor = getSizeFactor(i3);
        boolean z10 = this.isBold;
        int i10 = z10 ? charFont.boldFontId : charFont.fontId;
        FontInfo fontInfo2 = fontInfo[i10];
        if (z10 && charFont.fontId == charFont.boldFontId) {
            i10 = fontInfo2.getBoldId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.c, i10, i3);
        }
        if (this.isRoman) {
            i10 = fontInfo2.getRomanId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.c, i10, i3);
        }
        if (this.isSs) {
            i10 = fontInfo2.getSsId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.c, i10, i3);
        }
        if (this.isTt) {
            i10 = fontInfo2.getTtId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.c, i10, i3);
        }
        if (this.isIt) {
            i10 = fontInfo2.getItId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.c, i10, i3);
        }
        return new Char(charFont.c, fontInfo2.getFont(), i10, getMetrics(charFont, this.factor * sizeFactor));
    }

    public static void addTeXFontDescription(Object obj, InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(obj, inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        defaultTeXFontParser.parseExtraPath();
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    public DefaultTeXFont(float f10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(f10, 1.0f, z10, z11, z12, z13, z14);
    }

    public DefaultTeXFont(float f10, float f11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.size = f10;
        this.factor = f11;
        this.isBold = z10;
        this.isRoman = z11;
        this.isSs = z12;
        this.isTt = z13;
        this.isIt = z14;
    }

    public static void addAlphabet(Character.UnicodeBlock unicodeBlock, InputStream inputStream, String str, InputStream inputStream2, String str2, InputStream inputStream3, String str3) {
        if (loadedAlphabets.contains(unicodeBlock)) {
            return;
        }
        addTeXFontDescription(inputStream, str);
        SymbolAtom.addSymbolAtom(inputStream2, str2);
        TeXFormula.addSymbolMappings(inputStream3, str3);
        loadedAlphabets.add(unicodeBlock);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getChar(String str, int i3) {
        CharFont charFont = symbolMappings.get(str);
        if (charFont != null) {
            return getChar(charFont, i3);
        }
        throw new SymbolMappingNotFoundException(str);
    }

    public static void addAlphabet(Object obj, Character.UnicodeBlock[] unicodeBlockArr, String str) {
        boolean z10 = false;
        for (int i3 = 0; !z10 && i3 < unicodeBlockArr.length; i3++) {
            z10 = loadedAlphabets.contains(unicodeBlockArr[i3]) || z10;
        }
        if (z10) {
            return;
        }
        TeXParser.isLoading = true;
        addTeXFontDescription(obj, JLatexMathAndroid.getResourceAsStream(str), str);
        for (Character.UnicodeBlock unicodeBlock : unicodeBlockArr) {
            loadedAlphabets.add(unicodeBlock);
        }
        TeXParser.isLoading = false;
    }

    public static void addAlphabet(AlphabetRegistration alphabetRegistration) {
        if (alphabetRegistration != null) {
            try {
                addAlphabet(alphabetRegistration.getPackage(), alphabetRegistration.getUnicodeBlock(), alphabetRegistration.getTeXFontFileName());
            } catch (AlphabetRegistrationException e10) {
                System.err.println(e10.toString());
            } catch (FontAlreadyLoadedException unused) {
            }
        }
    }
}
