package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class StyleAtom extends Atom {
    private Atom at;
    private int style;

    public StyleAtom(int i10, Atom atom) {
        this.style = i10;
        this.at = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        int style = teXEnvironment.getStyle();
        teXEnvironment.setStyle(this.style);
        Box createBox = this.at.createBox(teXEnvironment);
        teXEnvironment.setStyle(style);
        return createBox;
    }
}
