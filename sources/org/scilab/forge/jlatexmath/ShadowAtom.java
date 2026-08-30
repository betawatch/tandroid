package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
