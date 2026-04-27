package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
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
        } else if (c == 'r') {
            createBox.setShift(0.0f);
        } else {
            createBox.setShift((-createBox.getWidth()) / 2.0f);
        }
        return verticalBox;
    }
}
