package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public class HlineAtom extends Atom {
    private float shift;
    private float width;

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        HorizontalRule horizontalRule = new HorizontalRule(teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle()), this.width, this.shift, false);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalRule);
        verticalBox.type = 13;
        return verticalBox;
    }

    public void setShift(float f7) {
        this.shift = f7;
    }

    public void setWidth(float f7) {
        this.width = f7;
    }
}
