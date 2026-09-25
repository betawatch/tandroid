package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class BigDelimiterAtom extends Atom {
    public SymbolAtom delim;
    private int size;

    public BigDelimiterAtom(SymbolAtom symbolAtom, int i10) {
        this.delim = symbolAtom;
        this.size = i10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box create = DelimiterFactory.create(this.delim, teXEnvironment, this.size);
        HorizontalBox horizontalBox = new HorizontalBox();
        float height = create.getHeight();
        create.setShift((((-(create.getDepth() + height)) / 2.0f) + height) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
        horizontalBox.add(create);
        return horizontalBox;
    }
}
