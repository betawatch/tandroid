package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class HdotsforAtom extends MulticolumnAtom {
    private static final Atom ldotp = SymbolAtom.get("ldotp");
    private static final Atom thin = new SpaceAtom(1);
    private float coeff;

    public HdotsforAtom(int i10, float f7) {
        super(i10, "c", ldotp);
        this.coeff = f7;
    }

    @Override // org.scilab.forge.jlatexmath.MulticolumnAtom, org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        StrutBox strutBox = new StrutBox(thin.createBox(teXEnvironment).getWidth() * this.coeff, 0.0f, 0.0f, 0.0f);
        HorizontalBox horizontalBox = new HorizontalBox(strutBox);
        horizontalBox.add(ldotp.createBox(teXEnvironment));
        horizontalBox.add(strutBox);
        if (this.w != 0.0f) {
            float width = horizontalBox.getWidth();
            float f7 = this.w;
            if (width <= 0.0f || Float.isInfinite(width) || Float.isNaN(width) || f7 > 65536.0f) {
                f7 = 0.0f;
            }
            HorizontalBox horizontalBox2 = new HorizontalBox(horizontalBox);
            int i10 = 0;
            while (horizontalBox2.getWidth() < f7) {
                int i11 = i10 + 1;
                if (i10 >= 65536) {
                    break;
                }
                horizontalBox2.add(horizontalBox);
                i10 = i11;
            }
            horizontalBox = f7 != 0.0f ? new HorizontalBox(horizontalBox2, f7, 2) : horizontalBox2;
        }
        horizontalBox.type = 12;
        return horizontalBox;
    }
}
