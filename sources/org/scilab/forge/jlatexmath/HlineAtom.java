package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public void setShift(float f10) {
        this.shift = f10;
    }

    public void setWidth(float f10) {
        this.width = f10;
    }
}
