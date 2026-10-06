package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
