package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
