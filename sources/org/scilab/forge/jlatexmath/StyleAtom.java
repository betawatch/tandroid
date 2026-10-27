package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
