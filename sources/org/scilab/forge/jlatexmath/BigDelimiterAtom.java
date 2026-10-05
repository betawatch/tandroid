package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
