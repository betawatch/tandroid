package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class SmallCapAtom extends Atom {
    protected Atom base;

    public SmallCapAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        boolean smallCap = teXEnvironment.getSmallCap();
        teXEnvironment.setSmallCap(true);
        Box createBox = this.base.createBox(teXEnvironment);
        teXEnvironment.setSmallCap(smallCap);
        return createBox;
    }
}
