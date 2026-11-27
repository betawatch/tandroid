// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e02 implements mcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ e02(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // mcc
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                n12 n12Var = (n12) callback;
                CharSequence charSequence = (CharSequence) obj;
                p02 p02Var = n12Var.B2;
                p02Var.setText(charSequence);
                p02Var.w(charSequence.length(), charSequence.length());
                n12Var.j1();
                break;
            case 1:
                n12 n12Var2 = (n12) callback;
                CharSequence charSequence2 = (CharSequence) obj;
                r02 r02Var = n12Var2.M2;
                r02Var.setText(charSequence2);
                r02Var.w(charSequence2.length(), charSequence2.length());
                n12Var2.j1();
                break;
            default:
                ub1 ub1Var = (ub1) callback;
                kb1 kb1Var = ub1Var.f;
                kb1Var.setText((CharSequence) obj);
                kb1Var.d();
                kb1Var.k(true);
                hb1 hb1Var = ub1Var.d0;
                hl.r(hb1Var);
                hb1Var.run();
                break;
        }
    }
}
