package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SpaceAtom extends Atom {
    private static UnitConversion[] unitConversions;
    private static Map<String, Integer> units;
    private boolean blankSpace;
    private int blankType;
    private int dUnit;
    private float depth;
    private int hUnit;
    private float height;
    private int wUnit;
    private float width;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface UnitConversion {
        float getPixelConversion(TeXEnvironment teXEnvironment);
    }

    static {
        HashMap hashMap = new HashMap();
        units = hashMap;
        hashMap.put("em", 0);
        units.put("ex", 1);
        units.put("px", 2);
        units.put("pix", 2);
        units.put("pixel", 2);
        units.put("pt", 10);
        units.put("bp", 3);
        units.put("pica", 4);
        units.put("pc", 4);
        units.put("mu", 5);
        units.put("cm", 6);
        units.put("mm", 7);
        units.put("in", 8);
        units.put("sp", 9);
        units.put("dd", 11);
        units.put("cc", 12);
        unitConversions = new UnitConversion[]{new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.1
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return teXEnvironment.getTeXFont().getEM(teXEnvironment.getStyle());
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.2
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return teXEnvironment.getTeXFont().getXHeight(teXEnvironment.getStyle(), teXEnvironment.getLastFontId());
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.3
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return 1.0f / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.4
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return TeXFormula.PIXELS_PER_POINT / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.5
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 12.0f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.6
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                TeXFont teXFont = teXEnvironment.getTeXFont();
                return teXFont.getQuad(teXEnvironment.getStyle(), teXFont.getMuFontId()) / 18.0f;
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.7
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 28.346457f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.8
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 2.8346457f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.9
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 72.0f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.10
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 65536.0f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.11
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 0.996264f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.12
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 1.0660349f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.13
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return (TeXFormula.PIXELS_PER_POINT * 12.792419f) / teXEnvironment.getSize();
            }
        }, new UnitConversion() { // from class: org.scilab.forge.jlatexmath.SpaceAtom.14
            @Override // org.scilab.forge.jlatexmath.SpaceAtom.UnitConversion
            public float getPixelConversion(TeXEnvironment teXEnvironment) {
                return teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
            }
        }};
    }

    public SpaceAtom() {
        this.blankSpace = true;
    }

    public static void checkUnit(int i9) {
        if (i9 < 0 || i9 >= unitConversions.length) {
            throw new InvalidUnitException();
        }
    }

    public static float getFactor(int i9, TeXEnvironment teXEnvironment) {
        return unitConversions[i9].getPixelConversion(teXEnvironment);
    }

    public static float[] getLength(String str) {
        if (str == null) {
            return new float[]{2.0f, 0.0f};
        }
        int i9 = 0;
        while (i9 < str.length() && !Character.isLetter(str.charAt(i9))) {
            i9++;
        }
        try {
            return new float[]{i9 != str.length() ? getUnit(str.substring(i9).toLowerCase()) : 2, Float.parseFloat(str.substring(0, i9))};
        } catch (NumberFormatException unused) {
            return new float[]{Float.NaN};
        }
    }

    public static int getUnit(String str) {
        Integer num = units.get(str);
        if (num == null) {
            return 2;
        }
        return num.intValue();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (!this.blankSpace) {
            return new StrutBox(getFactor(this.wUnit, teXEnvironment) * this.width, getFactor(this.hUnit, teXEnvironment) * this.height, getFactor(this.dUnit, teXEnvironment) * this.depth, 0.0f);
        }
        int i9 = this.blankType;
        if (i9 == 0) {
            return new StrutBox(teXEnvironment.getSpace(), 0.0f, 0.0f, 0.0f);
        }
        if (i9 < 0) {
            i9 = -i9;
        }
        Box box = i9 == 1 ? Glue.get(7, 1, teXEnvironment) : i9 == 2 ? Glue.get(2, 1, teXEnvironment) : Glue.get(3, 1, teXEnvironment);
        if (this.blankType < 0) {
            box.negWidth();
        }
        return box;
    }

    public SpaceAtom(int i9) {
        this.blankSpace = true;
        this.blankType = i9;
    }

    public SpaceAtom(int i9, float f10, float f11, float f12) {
        checkUnit(i9);
        this.wUnit = i9;
        this.hUnit = i9;
        this.dUnit = i9;
        this.width = f10;
        this.height = f11;
        this.depth = f12;
    }

    public SpaceAtom(int i9, float f10, int i10, float f11, int i11, float f12) {
        checkUnit(i9);
        checkUnit(i10);
        checkUnit(i11);
        this.wUnit = i9;
        this.hUnit = i10;
        this.dUnit = i11;
        this.width = f10;
        this.height = f11;
        this.depth = f12;
    }
}
