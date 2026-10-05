package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public class DdotsAtom extends Atom {
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        float width = TeXFormula.get("ldots").root.createBox(teXEnvironment).getWidth();
        Box createBox = SymbolAtom.get("ldotp").createBox(teXEnvironment);
        HorizontalBox horizontalBox = new HorizontalBox(createBox, width, 0);
        HorizontalBox horizontalBox2 = new HorizontalBox(createBox, width, 2);
        HorizontalBox horizontalBox3 = new HorizontalBox(createBox, width, 1);
        Box createBox2 = new SpaceAtom(5, 0.0f, 4.0f, 0.0f).createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(horizontalBox);
        verticalBox.add(createBox2);
        verticalBox.add(horizontalBox2);
        verticalBox.add(createBox2);
        verticalBox.add(horizontalBox3);
        verticalBox.setHeight(verticalBox.getDepth() + verticalBox.getHeight());
        verticalBox.setDepth(0.0f);
        return verticalBox;
    }
}
