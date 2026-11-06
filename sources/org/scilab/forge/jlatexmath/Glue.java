package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class Glue {
    private static final int[][][] glueTable;
    private static Glue[] glueTypes;
    private final String name;
    private final float shrink;
    private final float space;
    private final float stretch;

    static {
        GlueSettingsParser glueSettingsParser = new GlueSettingsParser();
        glueTypes = glueSettingsParser.getGlueTypes();
        glueTable = glueSettingsParser.createGlueTable();
    }

    public Glue(float f10, float f11, float f12, String str) {
        this.space = f10;
        this.stretch = f11;
        this.shrink = f12;
        this.name = str;
    }

    private Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        float quad = teXFont.getQuad(teXEnvironment.getStyle(), teXFont.getMuFontId());
        return new GlueBox((this.space / 18.0f) * quad, (this.stretch / 18.0f) * quad, (this.shrink / 18.0f) * quad);
    }

    public static Box get(int i7, int i10, TeXEnvironment teXEnvironment) {
        if (i7 > 7) {
            i7 = 0;
        }
        if (i10 > 7) {
            i10 = 0;
        }
        return glueTypes[glueTable[i7][i10][teXEnvironment.getStyle() / 2]].createBox(teXEnvironment);
    }

    public String getName() {
        return this.name;
    }
}
