package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
