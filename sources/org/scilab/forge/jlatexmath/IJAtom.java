package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class IJAtom extends Atom {
    private boolean upper;

    public IJAtom(boolean z10) {
        this.upper = z10;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        CharBox charBox = new CharBox(teXEnvironment.getTeXFont().getChar(this.upper ? 'I' : 'i', "mathnormal", teXEnvironment.getStyle()));
        CharBox charBox2 = new CharBox(teXEnvironment.getTeXFont().getChar(this.upper ? 'J' : 'j', "mathnormal", teXEnvironment.getStyle()));
        HorizontalBox horizontalBox = new HorizontalBox(charBox);
        horizontalBox.add(new SpaceAtom(0, -0.065f, 0.0f, 0.0f).createBox(teXEnvironment));
        horizontalBox.add(charBox2);
        return horizontalBox;
    }
}
