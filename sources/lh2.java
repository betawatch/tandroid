// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class lh2 extends gec {
    public kh2 x0;

    public lh2(Context context) {
        super(context);
        b(new jh2((sp8) this, (byte) 0));
    }

    public void setAdapter(kh2 kh2Var) {
        this.x0 = kh2Var;
        super.setAdapter((pr7) kh2Var);
        if (kh2Var != null) {
            x(kh2Var.j(), false);
        }
    }

    @Override // gec
    @Deprecated
    public void setAdapter(pr7 pr7Var) {
        if (pr7Var instanceof kh2) {
            setAdapter((kh2) pr7Var);
        } else {
            sc8.e();
        }
    }
}
