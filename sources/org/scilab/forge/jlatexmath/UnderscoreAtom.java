package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class UnderscoreAtom extends Atom {
    public static SpaceAtom w = new SpaceAtom(0, 0.7f, 0.0f, 0.0f);
    public static SpaceAtom s = new SpaceAtom(0, 0.06f, 0.0f, 0.0f);

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        HorizontalBox horizontalBox = new HorizontalBox(s.createBox(teXEnvironment));
        horizontalBox.add(new HorizontalRule(defaultRuleThickness, w.createBox(teXEnvironment).getWidth(), 0.0f));
        return horizontalBox;
    }
}
