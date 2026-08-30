package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class LapedAtom extends Atom {
    private Atom at;
    private char type;

    public LapedAtom(Atom atom, char c3) {
        this.at = atom;
        this.type = c3;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.at.createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        verticalBox.setWidth(0.0f);
        char c3 = this.type;
        if (c3 == 'l') {
            createBox.setShift(-createBox.getWidth());
            return verticalBox;
        }
        if (c3 != 'r') {
            createBox.setShift((-createBox.getWidth()) / 2.0f);
            return verticalBox;
        }
        createBox.setShift(0.0f);
        return verticalBox;
    }
}
