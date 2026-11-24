// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ls0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ls0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                os0 os0Var = ((ss0) obj).W;
                f = z ? 1.0f : 0.0f;
                os0Var.b(f, f, true);
                break;
            case 1:
                os0 os0Var2 = ((zi1) obj).K0;
                f = z ? 1.0f : 0.0f;
                os0Var2.b(f, f, true);
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor = ((wl2) obj).c;
                if (!z && TextUtils.isEmpty(editTextBoldCursor.getText())) {
                    editTextBoldCursor.setText("0");
                    break;
                }
                break;
            case 3:
                EditTextBoldCursor editTextBoldCursor2 = ((xl2) obj).d;
                if (!z && TextUtils.isEmpty(editTextBoldCursor2.getText())) {
                    editTextBoldCursor2.setText("0");
                    break;
                }
                break;
            case 4:
                z72 z72Var = (z72) obj;
                if (!z) {
                    z72Var.J();
                    break;
                } else {
                    z72Var.K(true);
                    Runnable runnable = z72Var.g2;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 5:
                cj3 cj3Var = (cj3) obj;
                if (z) {
                    cj3Var.Z.b(true);
                    break;
                }
                break;
            case 6:
                mf6 mf6Var = ((ad6) obj).a0;
                if (z) {
                    mf6Var.c.setEditText((EditText) view);
                    mf6Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                er7 er7Var = (er7) obj;
                f = z ? 1.0f : 0.0f;
                er7Var.b(f, f, true);
                break;
            case 8:
                er7 er7Var2 = ((jd6) obj).y;
                f = z ? 1.0f : 0.0f;
                er7Var2.b(f, f, true);
                break;
            case 9:
                er7 er7Var3 = ((qd6) obj).b;
                f = z ? 1.0f : 0.0f;
                er7Var3.b(f, f, true);
                break;
            case 10:
                mf6 mf6Var2 = ((td6) obj).E;
                if (z) {
                    mf6Var2.c.setEditText((EditText) view);
                    mf6Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 11:
                er7 er7Var4 = ((de6) obj).a;
                f = z ? 1.0f : 0.0f;
                er7Var4.b(f, f, true);
                break;
            case 12:
                mf6 mf6Var3 = ((qe6) obj).v0;
                if (z) {
                    mf6Var3.c.setEditText((EditText) view);
                    mf6Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 13:
                er7 er7Var5 = ((lf6) obj).e;
                f = z ? 1.0f : 0.0f;
                er7Var5.b(f, f, true);
                break;
            case 14:
                ((t47) obj).o1.c(z, !TextUtils.isEmpty(r5.p1.getText()));
                break;
            case 15:
                er7 er7Var6 = ((PasscodeActivity) obj).f;
                f = z ? 1.0f : 0.0f;
                er7Var6.b(f, f, true);
                break;
            case 16:
                ((wi9) obj).o(z);
                break;
            case 17:
                ((o0a) obj).l1.c(z, !TextUtils.isEmpty(r5.m1.getText()));
                break;
            case 18:
                mhb mhbVar = ((ymb) obj).d;
                if (!z) {
                    mhbVar.setText(gl.T2(k96.M0(2131743944, null)));
                    break;
                } else {
                    mhbVar.setText(gl.T2(k96.M0(2131743943, null)));
                    break;
                }
            case 19:
                er7 er7Var7 = ((TwoStepVerificationActivity) obj).w;
                f = z ? 1.0f : 0.0f;
                er7Var7.b(f, f, true);
                break;
            default:
                lqc lqcVar = (lqc) obj;
                if (z) {
                    lqcVar.setError(false);
                    lqcVar.e();
                    String lowerCase = lqcVar.a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        lqcVar.a();
                    } else {
                        lqcVar.f(lowerCase);
                    }
                } else {
                    lqcVar.a();
                    if (!lqcVar.w && !lqcVar.b()) {
                        lqcVar.setError(true);
                    }
                }
                lqcVar.d();
                break;
        }
    }
}
