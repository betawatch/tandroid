package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
