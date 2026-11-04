package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
