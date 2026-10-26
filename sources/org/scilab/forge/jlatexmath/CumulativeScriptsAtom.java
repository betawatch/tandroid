package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class CumulativeScriptsAtom extends Atom {
    private Atom base;
    private RowAtom sub;
    private RowAtom sup;

    public CumulativeScriptsAtom(Atom atom, Atom atom2, Atom atom3) {
        if (!(atom instanceof CumulativeScriptsAtom)) {
            if (atom == null) {
                this.base = new PhantomAtom(new CharAtom('M', "mathnormal"), false, true, true);
            } else {
                this.base = atom;
            }
            this.sup = new RowAtom(atom3);
            this.sub = new RowAtom(atom2);
            return;
        }
        CumulativeScriptsAtom cumulativeScriptsAtom = (CumulativeScriptsAtom) atom;
        this.base = cumulativeScriptsAtom.base;
        cumulativeScriptsAtom.sup.add(atom3);
        cumulativeScriptsAtom.sub.add(atom2);
        this.sup = cumulativeScriptsAtom.sup;
        this.sub = cumulativeScriptsAtom.sub;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new ScriptsAtom(this.base, this.sub, this.sup).createBox(teXEnvironment);
    }
}
