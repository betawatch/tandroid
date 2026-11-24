package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class BigDelimiterAtom extends Atom {
    public SymbolAtom delim;
    private int size;

    public BigDelimiterAtom(SymbolAtom symbolAtom, int i) {
        this.delim = symbolAtom;
        this.size = i;
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
