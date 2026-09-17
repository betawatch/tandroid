package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
class UnderlinedAtom extends Atom {
    private final Atom base;

    public UnderlinedAtom(Atom atom) {
        this.base = atom;
        this.type = 0;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(strutBox);
        verticalBox.add(new StrutBox(0.0f, 3.0f * defaultRuleThickness, 0.0f, 0.0f));
        verticalBox.add(new HorizontalRule(defaultRuleThickness, strutBox.getWidth(), 0.0f));
        verticalBox.setDepth((defaultRuleThickness * 5.0f) + strutBox.getDepth());
        verticalBox.setHeight(strutBox.getHeight());
        return verticalBox;
    }
}
