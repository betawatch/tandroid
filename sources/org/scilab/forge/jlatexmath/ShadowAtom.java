package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
