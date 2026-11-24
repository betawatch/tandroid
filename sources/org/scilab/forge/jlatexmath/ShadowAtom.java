package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ShadowAtom extends FBoxAtom {
    public ShadowAtom(Atom atom) {
        super(atom);
    }

    @Override // org.scilab.forge.jlatexmath.FBoxAtom, org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new ShadowBox((FramedBox) super.createBox(teXEnvironment), teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle()) * 4.0f);
    }
}
