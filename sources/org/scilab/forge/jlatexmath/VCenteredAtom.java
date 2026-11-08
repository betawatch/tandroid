package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
