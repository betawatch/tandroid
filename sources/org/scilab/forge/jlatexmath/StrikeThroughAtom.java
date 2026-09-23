package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
