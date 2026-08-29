package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class VlineAtom extends Atom {
    private float height;
    private int n;
    private float shift;

    public VlineAtom(int i10) {
        this.n = i10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i10;
        if (this.n == 0) {
            return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        HorizontalRule horizontalRule = new HorizontalRule(this.height, defaultRuleThickness, this.shift);
        StrutBox strutBox = new StrutBox(defaultRuleThickness * 2.0f, 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox();
        int i11 = 0;
        while (true) {
            i10 = this.n;
            if (i11 >= i10 - 1) {
                break;
            }
            horizontalBox.add(horizontalRule);
            horizontalBox.add(strutBox);
            i11++;
        }
        if (i10 > 0) {
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

    public void setHeight(float f9) {
        this.height = f9;
    }

    public void setShift(float f9) {
        this.shift = f9;
    }
}
