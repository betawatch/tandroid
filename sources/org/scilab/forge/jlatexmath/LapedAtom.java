package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class LapedAtom extends Atom {
    private Atom at;
    private char type;

    public LapedAtom(Atom atom, char c10) {
        this.at = atom;
        this.type = c10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.at.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        verticalBox.setWidth(0.0f);
        char c10 = this.type;
        if (c10 == 'l') {
            createBox.setShift(-createBox.getWidth());
            return verticalBox;
        }
        if (c10 != 'r') {
            createBox.setShift((-createBox.getWidth()) / 2.0f);
            return verticalBox;
        }
        createBox.setShift(0.0f);
        return verticalBox;
    }
}
