// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mz1 implements m8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ mz1(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // m8c
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                x02 x02Var = (x02) callback;
                CharSequence charSequence = (CharSequence) obj;
                zz1 zz1Var = x02Var.B2;
                zz1Var.setText(charSequence);
                zz1Var.w(charSequence.length(), charSequence.length());
                x02Var.i1();
                break;
            case 1:
                x02 x02Var2 = (x02) callback;
                CharSequence charSequence2 = (CharSequence) obj;
                b02 b02Var = x02Var2.M2;
                b02Var.setText(charSequence2);
                b02Var.w(charSequence2.length(), charSequence2.length());
                x02Var2.i1();
                break;
            default:
                mb1 mb1Var = (mb1) callback;
                cb1 cb1Var = mb1Var.f;
                cb1Var.setText((CharSequence) obj);
                cb1Var.d();
                cb1Var.k(true);
                za1 za1Var = mb1Var.d0;
                gl.r(za1Var);
                za1Var.run();
                break;
        }
    }
}
