// default package

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lx7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ kx7(lx7 lx7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 0;
        this.b = lx7Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lx7 lx7Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                vx7 vx7Var = lx7Var.e;
                if (tLObject instanceof Vector) {
                    vx7Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i = 0; i < size; i++) {
                        vx7Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i));
                    }
                    lx7Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        ij.u0(vx7Var.getParentActivity(), k96.M0(2131743581, null), true);
                    } else {
                        vx7Var.O1(k96.M0(R.string.AppName, null), tL_error.text);
                    }
                    vx7Var.P1(true, false);
                    break;
                }
            case 1:
                lx7 lx7Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    lx7Var2.e.K = password;
                    TwoStepVerificationActivity.e0(password);
                    lx7Var2.b();
                    break;
                }
                break;
            default:
                lx7 lx7Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    lx7Var3.e.K = password2;
                    TwoStepVerificationActivity.e0(password2);
                    Utilities.e.c(new pc7((Object) lx7Var3, (Object) lx7Var3.b, (Object) lx7Var3.d, (byte) 11));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kx7(lx7 lx7Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = lx7Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
