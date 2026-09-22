package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
