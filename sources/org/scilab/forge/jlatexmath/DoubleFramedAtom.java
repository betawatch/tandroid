package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class DoubleFramedAtom extends FBoxAtom {
    public DoubleFramedAtom(Atom atom) {
        super(atom);
    }

    @Override // org.scilab.forge.jlatexmath.FBoxAtom, org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        float factor = SpaceAtom.getFactor(0, teXEnvironment) * this.INTERSPACE;
        float f10 = 1.5f * defaultRuleThickness;
        return new FramedBox(new FramedBox(createBox, defaultRuleThickness * 0.75f, factor), f10, (SpaceAtom.getFactor(3, teXEnvironment) * 0.5f) + f10);
    }
}
