package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
