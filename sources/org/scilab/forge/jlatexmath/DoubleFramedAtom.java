package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
