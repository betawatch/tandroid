package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public MulticolumnAtom(int i7, String str, Atom atom) {
        this.n = i7 < 1 ? 1 : i7;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i7 = 0;
        int i10 = 2;
        boolean z9 = true;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt == 'c') {
                z9 = false;
                i10 = 2;
            } else if (charAt == 'l') {
                i10 = 0;
                z9 = false;
            } else if (charAt == 'r') {
                z9 = false;
                i10 = 1;
            } else if (charAt == '|') {
                if (z9) {
                    this.beforeVlines = 1;
                } else {
                    this.afterVlines = 1;
                }
                while (true) {
                    int i11 = i7 + 1;
                    if (i11 >= length) {
                        i7 = i11;
                        break;
                    }
                    if (str.charAt(i11) != '|') {
                        break;
                    }
                    if (z9) {
                        this.beforeVlines++;
                    } else {
                        this.afterVlines++;
                    }
                    i7 = i11;
                }
            }
            i7++;
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

    public void setRowColumn(int i7, int i10) {
        this.row = i7;
        this.col = i10;
    }

    public void setWidth(float f10) {
        this.w = f10;
    }
}
