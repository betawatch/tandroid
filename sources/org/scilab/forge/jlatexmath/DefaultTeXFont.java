package org.scilab.forge.jlatexmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.ui.yh;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.awt.Font;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        String l10 = yh.l("fonts/", str, "/language_", str, ".xml");
        String l11 = yh.l("fonts/", str, "/symbols_", str, ".xml");
        String l12 = yh.l("fonts/", str, "/mappings_", str, ".xml");
        try {
            addAlphabet(unicodeBlock, JLatexMathAndroid.getResourceAsStream(l10), l10, JLatexMathAndroid.getResourceAsStream(l11), l11, JLatexMathAndroid.getResourceAsStream(l12), l12);
        } catch (FontAlreadyLoadedException unused) {
        }
    }

    public static void addTeXFontDescription(String str) {
        try {
            addTeXFontDescription(new FileInputStream(str), str);
        } catch (FileNotFoundException e6) {
            throw new ResourceParseException(str, e6);
        }
    }

    public static void enableMagnification(boolean z4) {
        magnificationEnable = z4;
    }

    private Char getChar(char c3, CharFont[] charFontArr, int i10) {
        char c10;
        int i11;
        if (c3 >= '0' && c3 <= '9') {
            i11 = c3 - '0';
            c10 = 0;
        } else if (c3 >= 'a' && c3 <= 'z') {
            i11 = c3 - 'a';
            c10 = 2;
        } else if (c3 < 'A' || c3 > 'Z') {
            c10 = 3;
            i11 = c3;
        } else {
            i11 = c3 - 'A';
            c10 = 1;
        }
        CharFont charFont = charFontArr[c10];
        return charFont == null ? getDefaultChar(c3, i10) : getChar(new CharFont((char) (charFont.c + i11), charFont.fontId), i10);
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

    public static float getSizeFactor(int i10) {
        if (i10 < 2) {
            return 1.0f;
        }
        return i10 < 4 ? generalSettings.get("textfactor").floatValue() : i10 < 6 ? generalSettings.get("scriptfactor").floatValue() : generalSettings.get("scriptscriptfactor").floatValue();
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
    public float getAxisHeight(int i10) {
        return getSizeFactor(i10) * getParameter("axisheight") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing1(int i10) {
        return getSizeFactor(i10) * getParameter("bigopspacing1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing2(int i10) {
        return getSizeFactor(i10) * getParameter("bigopspacing2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing3(int i10) {
        return getSizeFactor(i10) * getParameter("bigopspacing3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing4(int i10) {
        return getSizeFactor(i10) * getParameter("bigopspacing4") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getBigOpSpacing5(int i10) {
        return getSizeFactor(i10) * getParameter("bigopspacing5") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getBold() {
        return this.isBold;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getDefaultChar(char c3, int i10) {
        return (c3 < '0' || c3 > '9') ? (c3 < 'a' || c3 > 'z') ? getChar(c3, defaultTextStyleMappings[1], i10) : getChar(c3, defaultTextStyleMappings[2], i10) : getChar(c3, defaultTextStyleMappings[0], i10);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getDefaultRuleThickness(int i10) {
        return getSizeFactor(i10) * getParameter("defaultrulethickness") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getDenom1(int i10) {
        return getSizeFactor(i10) * getParameter("denom1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getDenom2(int i10) {
        return getSizeFactor(i10) * getParameter("denom2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getEM(int i10) {
        return getSizeFactor(i10) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Extension getExtension(Char r10, int i10) {
        Font font = r10.getFont();
        int fontCode = r10.getFontCode();
        float sizeFactor = getSizeFactor(i10);
        int[] extension = fontInfo[fontCode].getExtension(r10.getChar());
        Char[] charArr = new Char[extension.length];
        for (int i11 = 0; i11 < extension.length; i11++) {
            int i12 = extension[i11];
            if (i12 == -1) {
                charArr[i11] = null;
            } else {
                charArr[i11] = new Char((char) i12, font, fontCode, getMetrics(new CharFont((char) i12, fontCode), sizeFactor));
            }
        }
        return new Extension(charArr[0], charArr[1], charArr[2], charArr[3]);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getIt() {
        return this.isIt;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getKern(CharFont charFont, CharFont charFont2, int i10) {
        int i11 = charFont.fontId;
        if (i11 == charFont2.fontId) {
            return fontInfo[i11].getKern(charFont.c, charFont2.c, getSizeFactor(i10) * TeXFormula.PIXELS_PER_POINT);
        }
        return 0.0f;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public CharFont getLigature(CharFont charFont, CharFont charFont2) {
        int i10 = charFont.fontId;
        if (i10 == charFont2.fontId) {
            return fontInfo[i10].getLigature(charFont.c, charFont2.c);
        }
        return null;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public int getMuFontId() {
        return generalSettings.get(DefaultTeXFontParser.MUFONTID_ATTR).intValue();
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getNextLarger(Char r52, int i10) {
        CharFont nextLarger = fontInfo[r52.getFontCode()].getNextLarger(r52.getChar());
        return new Char(nextLarger.c, fontInfo[nextLarger.fontId].getFont(), nextLarger.fontId, getMetrics(nextLarger, getSizeFactor(i10)));
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getNum1(int i10) {
        return getSizeFactor(i10) * getParameter("num1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getNum2(int i10) {
        return getSizeFactor(i10) * getParameter("num2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getNum3(int i10) {
        return getSizeFactor(i10) * getParameter("num3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getQuad(int i10, int i11) {
        return fontInfo[i11].getQuad(getSizeFactor(i10) * TeXFormula.PIXELS_PER_POINT);
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
    public float getSkew(CharFont charFont, int i10) {
        char skewChar = fontInfo[charFont.fontId].getSkewChar();
        if (skewChar == 65535) {
            return 0.0f;
        }
        return getKern(charFont, new CharFont(skewChar, charFont.fontId), i10);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSpace(int i10) {
        return fontInfo[generalSettings.get(DefaultTeXFontParser.SPACEFONTID_ATTR).intValue()].getSpace(getSizeFactor(i10) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getSs() {
        return this.isSs;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSub1(int i10) {
        return getSizeFactor(i10) * getParameter("sub1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSub2(int i10) {
        return getSizeFactor(i10) * getParameter("sub2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSubDrop(int i10) {
        return getSizeFactor(i10) * getParameter("subdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSup1(int i10) {
        return getSizeFactor(i10) * getParameter("sup1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSup2(int i10) {
        return getSizeFactor(i10) * getParameter("sup2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSup3(int i10) {
        return getSizeFactor(i10) * getParameter("sup3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getSupDrop(int i10) {
        return getSizeFactor(i10) * getParameter("supdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean getTt() {
        return this.isTt;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public float getXHeight(int i10, int i11) {
        return fontInfo[i11].getXHeight(getSizeFactor(i10) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean hasNextLarger(Char r32) {
        return fontInfo[r32.getFontCode()].getNextLarger(r32.getChar()) != null;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public boolean hasSpace(int i10) {
        return fontInfo[i10].hasSpace();
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
    public void setBold(boolean z4) {
        this.isBold = z4;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setIt(boolean z4) {
        this.isIt = z4;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setRoman(boolean z4) {
        this.isRoman = z4;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setSs(boolean z4) {
        this.isSs = z4;
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public void setTt(boolean z4) {
        this.isTt = z4;
    }

    public static void addTeXFontDescription(InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getChar(char c3, String str, int i10) {
        CharFont[] charFontArr = textStyleMappings.get(str);
        if (charFontArr != null) {
            return getChar(c3, charFontArr, i10);
        }
        throw new TextStyleMappingNotFoundException(str);
    }

    @Override // org.scilab.forge.jlatexmath.TeXFont
    public Char getChar(CharFont charFont, int i10) {
        float sizeFactor = getSizeFactor(i10);
        boolean z4 = this.isBold;
        int i11 = z4 ? charFont.boldFontId : charFont.fontId;
        FontInfo fontInfo2 = fontInfo[i11];
        if (z4 && charFont.fontId == charFont.boldFontId) {
            i11 = fontInfo2.getBoldId();
            fontInfo2 = fontInfo[i11];
            charFont = new CharFont(charFont.c, i11, i10);
        }
        if (this.isRoman) {
            i11 = fontInfo2.getRomanId();
            fontInfo2 = fontInfo[i11];
            charFont = new CharFont(charFont.c, i11, i10);
        }
        if (this.isSs) {
            i11 = fontInfo2.getSsId();
            fontInfo2 = fontInfo[i11];
            charFont = new CharFont(charFont.c, i11, i10);
        }
        if (this.isTt) {
            i11 = fontInfo2.getTtId();
            fontInfo2 = fontInfo[i11];
            charFont = new CharFont(charFont.c, i11, i10);
        }
        if (this.isIt) {
            i11 = fontInfo2.getItId();
            fontInfo2 = fontInfo[i11];
            charFont = new CharFont(charFont.c, i11, i10);
        }
        return new Char(charFont.c, fontInfo2.getFont(), i11, getMetrics(charFont, this.factor * sizeFactor));
    }

    public static void addTeXFontDescription(Object obj, InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(obj, inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        defaultTeXFontParser.parseExtraPath();
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    public DefaultTeXFont(float f10, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(f10, 1.0f, z4, z10, z11, z12, z13);
    }

    public DefaultTeXFont(float f10, float f11, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.size = f10;
        this.factor = f11;
        this.isBold = z4;
        this.isRoman = z10;
        this.isSs = z11;
        this.isTt = z12;
        this.isIt = z13;
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
    public Char getChar(String str, int i10) {
        CharFont charFont = symbolMappings.get(str);
        if (charFont != null) {
            return getChar(charFont, i10);
        }
        throw new SymbolMappingNotFoundException(str);
    }

    public static void addAlphabet(Object obj, Character.UnicodeBlock[] unicodeBlockArr, String str) {
        boolean z4 = false;
        for (int i10 = 0; !z4 && i10 < unicodeBlockArr.length; i10++) {
            z4 = loadedAlphabets.contains(unicodeBlockArr[i10]) || z4;
        }
        if (z4) {
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
            } catch (AlphabetRegistrationException e6) {
                System.err.println(e6.toString());
            } catch (FontAlreadyLoadedException unused) {
            }
        }
    }
}
