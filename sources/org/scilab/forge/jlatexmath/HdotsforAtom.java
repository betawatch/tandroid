package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class HdotsforAtom extends MulticolumnAtom {
    private static final Atom ldotp = SymbolAtom.get("ldotp");
    private static final Atom thin = new SpaceAtom(1);
    private float coeff;

    public HdotsforAtom(int i7, float f10) {
        super(i7, "c", ldotp);
        this.coeff = f10;
    }

    @Override // org.scilab.forge.jlatexmath.MulticolumnAtom, org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        StrutBox strutBox = new StrutBox(thin.createBox(teXEnvironment).getWidth() * this.coeff, 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox(strutBox);
        horizontalBox.add(ldotp.createBox(teXEnvironment));
        horizontalBox.add(strutBox);
        if (this.w != 0.0f) {
            float width = horizontalBox.getWidth();
            float f10 = this.w;
            if (width <= 0.0f || Float.isInfinite(width) || Float.isNaN(width) || f10 > 65536.0f) {
                f10 = 0.0f;
            }
            HorizontalBox horizontalBox2 = new HorizontalBox(horizontalBox);
            int i7 = 0;
            while (horizontalBox2.getWidth() < f10) {
                int i10 = i7 + 1;
                if (i7 >= 65536) {
                    break;
                }
                horizontalBox2.add(horizontalBox);
                i7 = i10;
            }
            horizontalBox = f10 != 0.0f ? new HorizontalBox(horizontalBox2, f10, 2) : horizontalBox2;
        }
        horizontalBox.type = 12;
        return horizontalBox;
    }
}
