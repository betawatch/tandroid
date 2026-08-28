package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MultlineAtom extends Atom {
    public static final int GATHER = 1;
    public static final int GATHERED = 2;
    public static final int MULTLINE = 0;
    public static SpaceAtom vsep_in = new SpaceAtom(1, 0.0f, 1.0f, 0.0f);
    private ArrayOfAtoms column;
    private boolean isPartial;
    private int type;

    public MultlineAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i9) {
        this.isPartial = z10;
        this.column = arrayOfAtoms;
        this.type = i9;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        ArrayOfAtoms arrayOfAtoms;
        int i9;
        float textwidth = teXEnvironment.getTextwidth();
        if (textwidth != Float.POSITIVE_INFINITY) {
            if (this.type != 2) {
                VerticalBox verticalBox = new VerticalBox();
                Atom atom = this.column.array.get(0).get(0);
                int i10 = this.type == 1 ? 2 : 0;
                int i11 = atom.alignment;
                if (i11 != -1) {
                    i10 = i11;
                }
                verticalBox.add(new HorizontalBox(atom.createBox(teXEnvironment), textwidth, i10));
                Box createBox = vsep_in.createBox(teXEnvironment);
                int i12 = 1;
                while (true) {
                    arrayOfAtoms = this.column;
                    i9 = arrayOfAtoms.row;
                    if (i12 >= i9 - 1) {
                        break;
                    }
                    Atom atom2 = arrayOfAtoms.array.get(i12).get(0);
                    int i13 = atom2.alignment;
                    if (i13 == -1) {
                        i13 = 2;
                    }
                    verticalBox.add(createBox);
                    verticalBox.add(new HorizontalBox(atom2.createBox(teXEnvironment), textwidth, i13));
                    i12++;
                }
                if (i9 > 1) {
                    Atom atom3 = arrayOfAtoms.array.get(i9 - 1).get(0);
                    int i14 = this.type != 1 ? 1 : 2;
                    int i15 = atom3.alignment;
                    if (i15 != -1) {
                        i14 = i15;
                    }
                    verticalBox.add(createBox);
                    verticalBox.add(new HorizontalBox(atom3.createBox(teXEnvironment), textwidth, i14));
                }
                float depth = (verticalBox.getDepth() + verticalBox.getHeight()) / 2.0f;
                verticalBox.setHeight(depth);
                verticalBox.setDepth(depth);
                return verticalBox;
            }
        }
        return new MatrixAtom(this.isPartial, this.column, "").createBox(teXEnvironment);
    }

    public MultlineAtom(ArrayOfAtoms arrayOfAtoms, int i9) {
        this(false, arrayOfAtoms, i9);
    }
}
