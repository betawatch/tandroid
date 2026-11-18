package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
