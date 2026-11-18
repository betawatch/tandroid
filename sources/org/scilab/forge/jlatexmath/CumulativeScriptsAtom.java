package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
