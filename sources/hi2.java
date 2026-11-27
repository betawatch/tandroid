// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
