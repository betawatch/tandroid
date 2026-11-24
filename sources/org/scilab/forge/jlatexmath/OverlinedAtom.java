package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
