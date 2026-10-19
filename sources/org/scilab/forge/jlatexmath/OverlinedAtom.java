package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
