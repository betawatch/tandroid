package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class TextCircledAtom extends Atom {
    private Atom at;

    public TextCircledAtom(Atom atom) {
        this.at = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = SymbolAtom.get("bigcirc").createBox(teXEnvironment);
        createBox.setShift(SpaceAtom.getFactor(1, teXEnvironment) * (-0.07f));
        HorizontalBox horizontalBox = new HorizontalBox(this.at.createBox(teXEnvironment), createBox.getWidth(), 2);
        horizontalBox.add(new StrutBox(-horizontalBox.getWidth(), 0.0f, 0.0f, 0.0f));
        horizontalBox.add(createBox);
        return horizontalBox;
    }
}
