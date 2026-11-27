// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class hi2 extends fic {
    public gi2 x0;

    public hi2(Context context) {
        super(context);
        b(new fi2((et8) this, (byte) 0));
    }

    public void setAdapter(gi2 gi2Var) {
        this.x0 = gi2Var;
        super.setAdapter((vu7) gi2Var);
        if (gi2Var != null) {
            x(gi2Var.j(), false);
        }
    }

    @Override // fic
    @Deprecated
    public void setAdapter(vu7 vu7Var) {
        if (vu7Var instanceof gi2) {
            setAdapter((gi2) vu7Var);
        } else {
            iy8.d();
        }
    }
}
