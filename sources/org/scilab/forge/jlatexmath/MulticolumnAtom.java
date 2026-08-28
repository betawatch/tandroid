package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MulticolumnAtom extends Atom {
    protected int afterVlines;
    protected int align;
    protected int beforeVlines;
    protected int col;
    protected Atom cols;
    protected int n;
    protected int row;
    protected float w = 0.0f;

    public MulticolumnAtom(int i9, String str, Atom atom) {
        this.n = i9 < 1 ? 1 : i9;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 2;
        boolean z10 = true;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt == 'c') {
                i10 = 2;
            } else if (charAt == 'l') {
                i10 = 0;
            } else if (charAt != 'r') {
                if (charAt == '|') {
                    if (z10) {
                        this.beforeVlines = 1;
                    } else {
                        this.afterVlines = 1;
                    }
                    while (true) {
                        int i11 = i9 + 1;
                        if (i11 >= length) {
                            i9 = i11;
                            break;
                        }
                        if (str.charAt(i11) != '|') {
                            break;
                        }
                        if (z10) {
                            this.beforeVlines++;
                        } else {
                            this.afterVlines++;
                        }
                        i9 = i11;
                    }
                }
                i9++;
            } else {
                i10 = 1;
            }
            z10 = false;
            i9++;
        }
        return i10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.w == 0.0f ? this.cols.createBox(teXEnvironment) : new HorizontalBox(this.cols.createBox(teXEnvironment), this.w, this.align);
        createBox.type = 12;
        return createBox;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public int getSkipped() {
        return this.n;
    }

    public boolean hasRightVline() {
        return this.afterVlines != 0;
    }

    public void setRowColumn(int i9, int i10) {
        this.row = i9;
        this.col = i10;
    }

    public void setWidth(float f10) {
        this.w = f10;
    }
}
