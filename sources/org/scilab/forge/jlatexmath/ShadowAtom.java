package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
