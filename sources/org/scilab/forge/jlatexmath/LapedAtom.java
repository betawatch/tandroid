package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class LapedAtom extends Atom {
    private Atom at;
    private char type;

    public LapedAtom(Atom atom, char c) {
        this.at = atom;
        this.type = c;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.at.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        verticalBox.setWidth(0.0f);
        char c = this.type;
        if (c == 'l') {
            createBox.setShift(-createBox.getWidth());
            return verticalBox;
        }
        if (c != 'r') {
            createBox.setShift((-createBox.getWidth()) / 2.0f);
            return verticalBox;
        }
        createBox.setShift(0.0f);
        return verticalBox;
    }
}
