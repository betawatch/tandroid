package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class StyleAtom extends Atom {
    private Atom at;
    private int style;

    public StyleAtom(int i7, Atom atom) {
        this.style = i7;
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
