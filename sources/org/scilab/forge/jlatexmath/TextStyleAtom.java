package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
