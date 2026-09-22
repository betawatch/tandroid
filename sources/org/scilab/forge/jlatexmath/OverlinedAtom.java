package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
