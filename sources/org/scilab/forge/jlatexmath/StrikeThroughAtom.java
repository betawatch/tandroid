package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class StrikeThroughAtom extends Atom {
    private Atom at;

    public StrikeThroughAtom(Atom atom) {
        this.at = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float axisHeight = teXFont.getAxisHeight(style);
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        Box createBox = this.at.createBox(teXEnvironment);
        HorizontalRule horizontalRule = new HorizontalRule(defaultRuleThickness, createBox.getWidth(), (-axisHeight) + defaultRuleThickness, false);
        HorizontalBox horizontalBox = new HorizontalBox();
        horizontalBox.add(createBox);
        horizontalBox.add(new StrutBox(-createBox.getWidth(), 0.0f, 0.0f, 0.0f));
        horizontalBox.add(horizontalRule);
        return horizontalBox;
    }
}
