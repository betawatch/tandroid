package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class VdotsAtom extends Atom {
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = SymbolAtom.get("ldotp").createBox(teXEnvironment);
        VerticalBox verticalBox = new VerticalBox(createBox, 0.0f, 4);
        Box createBox2 = new SpaceAtom(5, 0.0f, 4.0f, 0.0f).createBox(teXEnvironment);
        verticalBox.add(createBox2);
        verticalBox.add(createBox);
        verticalBox.add(createBox2);
        verticalBox.add(createBox);
        float depth = verticalBox.getDepth();
        float height = verticalBox.getHeight();
        verticalBox.setDepth(0.0f);
        verticalBox.setHeight(height + depth);
        return verticalBox;
    }
}
