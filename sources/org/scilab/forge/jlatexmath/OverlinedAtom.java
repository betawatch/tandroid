package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class OverlinedAtom extends Atom {
    private final Atom base;

    public OverlinedAtom(Atom atom) {
        this.base = atom;
        this.type = 0;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment.crampStyle());
        OverBar overBar = new OverBar(strutBox, 3.0f * defaultRuleThickness, defaultRuleThickness);
        overBar.setDepth(strutBox.getDepth());
        overBar.setHeight((defaultRuleThickness * 5.0f) + strutBox.getHeight());
        return overBar;
    }
}
