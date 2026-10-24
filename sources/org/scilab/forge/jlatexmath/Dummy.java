package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        int i10 = this.type;
        return i10 >= 0 ? i10 : this.el.getLeftType();
    }

    public int getRightType() {
        int i10 = this.type;
        return i10 >= 0 ? i10 : this.el.getRightType();
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

    public void setType(int i10) {
        this.type = i10;
    }
}
