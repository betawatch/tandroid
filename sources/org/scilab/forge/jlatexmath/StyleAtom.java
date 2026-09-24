package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
