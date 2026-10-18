package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        float f7 = 1.5f * defaultRuleThickness;
        return new FramedBox(new FramedBox(createBox, defaultRuleThickness * 0.75f, factor), f7, (SpaceAtom.getFactor(3, teXEnvironment) * 0.5f) + f7);
    }
}
