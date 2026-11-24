package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class VCenteredAtom extends Atom {
    private final Atom atom;

    public VCenteredAtom(Atom atom) {
        this.atom = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.atom.createBox(teXEnvironment);
        float depth = createBox.getDepth() + createBox.getHeight();
        createBox.setShift((-(depth / 2.0f)) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
        return new HorizontalBox(createBox);
    }
}
