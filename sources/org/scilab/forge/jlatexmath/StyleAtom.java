package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class StyleAtom extends Atom {
    private Atom at;
    private int style;

    public StyleAtom(int i, Atom atom) {
        this.style = i;
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
