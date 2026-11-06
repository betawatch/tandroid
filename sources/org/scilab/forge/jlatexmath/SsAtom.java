package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
