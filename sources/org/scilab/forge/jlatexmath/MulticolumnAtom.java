package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public MulticolumnAtom(int i10, String str, Atom atom) {
        this.n = i10 < 1 ? 1 : i10;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 2;
        boolean z4 = true;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == 'c') {
                i11 = 2;
            } else if (charAt == 'l') {
                i11 = 0;
            } else if (charAt != 'r') {
                if (charAt == '|') {
                    if (z4) {
                        this.beforeVlines = 1;
                    } else {
                        this.afterVlines = 1;
                    }
                    while (true) {
                        int i12 = i10 + 1;
                        if (i12 >= length) {
                            i10 = i12;
                            break;
                        }
                        if (str.charAt(i12) != '|') {
                            break;
                        }
                        if (z4) {
                            this.beforeVlines++;
                        } else {
                            this.afterVlines++;
                        }
                        i10 = i12;
                    }
                }
                i10++;
            } else {
                i11 = 1;
            }
            z4 = false;
            i10++;
        }
        return i11;
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

    public void setRowColumn(int i10, int i11) {
        this.row = i10;
        this.col = i11;
    }

    public void setWidth(float f10) {
        this.w = f10;
    }
}
