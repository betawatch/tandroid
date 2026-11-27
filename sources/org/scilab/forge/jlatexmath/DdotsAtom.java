package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
