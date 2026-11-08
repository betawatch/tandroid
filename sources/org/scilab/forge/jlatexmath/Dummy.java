package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class Dummy {
    private Atom el;
    private boolean textSymbol = false;
    private int type = -1;

    public Dummy(Atom atom) {
        this.el = atom;
    }

    public void changeAtom(FixedCharAtom fixedCharAtom) {
        this.textSymbol = false;
        this.type = -1;
        this.el = fixedCharAtom;
    }

    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.textSymbol) {
            ((CharSymbol) this.el).markAsTextSymbol();
        }
        Box createBox = this.el.createBox(teXEnvironment);
        if (this.textSymbol) {
            ((CharSymbol) this.el).removeMark();
        }
        return createBox;
    }

    public CharFont getCharFont(TeXFont teXFont) {
        return ((CharSymbol) this.el).getCharFont(teXFont);
    }

    public int getLeftType() {
        int i7 = this.type;
        return i7 >= 0 ? i7 : this.el.getLeftType();
    }

    public int getRightType() {
        int i7 = this.type;
        return i7 >= 0 ? i7 : this.el.getRightType();
    }

    public int getType() {
        return this.type;
    }

    public boolean isCharInMathMode() {
        Atom atom = this.el;
        return (atom instanceof CharAtom) && ((CharAtom) atom).isMathMode();
    }

    public boolean isCharSymbol() {
        return this.el instanceof CharSymbol;
    }

    public boolean isKern() {
        return this.el instanceof SpaceAtom;
    }

    public void markAsTextSymbol() {
        this.textSymbol = true;
    }

    public void setPreviousAtom(Dummy dummy) {
        Cloneable cloneable = this.el;
        if (cloneable instanceof Row) {
            ((Row) cloneable).setPreviousAtom(dummy);
        }
    }

    public void setType(int i7) {
        this.type = i7;
    }
}
