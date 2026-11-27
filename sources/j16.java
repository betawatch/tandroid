// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j16 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ j16(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override // pcc
    public final void a(Object obj) {
        e lastFragment;
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                String str = LaunchActivity.C1;
                uc7.s1(launchActivity.P).G3(null, user, null, 0, null, false, false);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = LaunchActivity.C1;
                if (launchActivity.p0 != null && booleanValue && i86.c() < 100 && (lastFragment = launchActivity.p0.getLastFragment()) != null && !(lastFragment instanceof q86)) {
                    int b2 = i86.b();
                    d31 b0 = d31.b0(lastFragment);
                    dh0 dh0Var = new dh0(b2 / 100.0f, lastFragment.getThemedColor(aob.Y5));
                    String M0 = ob6.M0(2131748469, null);
                    String a0 = ob6.a0("LowPowerEnabledSubtitle", null, 2131748470, String.format("%d%%", Integer.valueOf(b2)));
                    String M02 = ob6.M0(2131751400, null);
                    sz5 sz5Var = new sz5(launchActivity, (byte) 9);
                    b0.getClass();
                    Context X = b0.X();
                    vnb vnbVar = b0.c;
                    s21 s21Var = new s21(X, vnbVar);
                    s21Var.a.setImageDrawable(dh0Var);
                    s21Var.b.setText(M0);
                    s21Var.c.setText(a0);
                    t21 t21Var = new t21(vnbVar, b0.X(), true);
                    t21Var.e(M02);
                    t21Var.b = sz5Var;
                    s21Var.setButton(t21Var);
                    v21 b3 = b0.b(s21Var, 2750);
                    b3.j = 5000;
                    b3.j();
                    break;
                }
                break;
        }
    }
}
