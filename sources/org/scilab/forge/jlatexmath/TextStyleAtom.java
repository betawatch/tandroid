package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class TextStyleAtom extends Atom {
    private Atom at;
    private String style;

    public TextStyleAtom(Atom atom, String str) {
        this.style = str;
        this.at = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle = teXEnvironment.getTextStyle();
        teXEnvironment.setTextStyle(this.style);
        Box createBox = this.at.createBox(teXEnvironment);
        teXEnvironment.setTextStyle(textStyle);
        return createBox;
    }
}
