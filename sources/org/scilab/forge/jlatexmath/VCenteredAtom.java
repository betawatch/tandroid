package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
