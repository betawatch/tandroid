package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
