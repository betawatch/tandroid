package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class VlineAtom extends Atom {
    private float height;
    private int n;
    private float shift;

    public VlineAtom(int i7) {
        this.n = i7;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i7;
        if (this.n == 0) {
            return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        HorizontalRule horizontalRule = new HorizontalRule(this.height, defaultRuleThickness, this.shift);
        StrutBox strutBox = new StrutBox(defaultRuleThickness * 2.0f, 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox();
        int i10 = 0;
        while (true) {
            i7 = this.n;
            if (i10 >= i7 - 1) {
                break;
            }
            horizontalBox.add(horizontalRule);
            horizontalBox.add(strutBox);
            i10++;
        }
        if (i7 > 0) {
            horizontalBox.add(horizontalRule);
        }
        return horizontalBox;
    }

    public float getWidth(TeXEnvironment teXEnvironment) {
        if (this.n != 0) {
            return teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle()) * ((this.n * 3) - 2);
        }
        return 0.0f;
    }

    public void setHeight(float f10) {
        this.height = f10;
    }

    public void setShift(float f10) {
        this.shift = f10;
    }
}
