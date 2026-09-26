package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
