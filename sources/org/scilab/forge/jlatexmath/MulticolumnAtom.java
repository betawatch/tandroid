package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public MulticolumnAtom(int i3, String str, Atom atom) {
        this.n = i3 < 1 ? 1 : i3;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i3 = 0;
        int i10 = 2;
        boolean z10 = true;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt == 'c') {
                z10 = false;
                i10 = 2;
            } else if (charAt == 'l') {
                i10 = 0;
                z10 = false;
            } else if (charAt == 'r') {
                z10 = false;
                i10 = 1;
            } else if (charAt == '|') {
                if (z10) {
                    this.beforeVlines = 1;
                } else {
                    this.afterVlines = 1;
                }
                while (true) {
                    int i11 = i3 + 1;
                    if (i11 >= length) {
                        i3 = i11;
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
                    i3 = i11;
                }
            }
            i3++;
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

    public void setRowColumn(int i3, int i10) {
        this.row = i3;
        this.col = i10;
    }

    public void setWidth(float f10) {
        this.w = f10;
    }
}
