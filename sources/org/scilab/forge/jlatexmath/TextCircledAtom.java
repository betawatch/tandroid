package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
