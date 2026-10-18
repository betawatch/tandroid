package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class SsAtom extends Atom {
    private Atom base;

    public SsAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        copy.getTeXFont().setSs(true);
        Box createBox = this.base.createBox(copy);
        copy.getTeXFont().setSs(false);
        return createBox;
    }
}
