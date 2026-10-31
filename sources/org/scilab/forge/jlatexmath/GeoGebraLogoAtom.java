package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class GeoGebraLogoAtom extends Atom {
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getDefaultChar('o', teXEnvironment.getStyle()));
        return new GeoGebraLogoBox(charBox.width, charBox.height);
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return 0;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return 0;
    }
}
