package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class TtAtom extends Atom {
    private Atom base;

    public TtAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        copy.getTeXFont().setTt(true);
        Box createBox = this.base.createBox(copy);
        copy.getTeXFont().setTt(false);
        return createBox;
    }
}
