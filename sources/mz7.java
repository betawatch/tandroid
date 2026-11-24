// default package

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mz7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nz7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ mz7(nz7 nz7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = (byte) 0;
        this.b = nz7Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nz7 nz7Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                xz7 xz7Var = nz7Var.e;
                if (tLObject instanceof Vector) {
                    xz7Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i = 0; i < size; i++) {
                        xz7Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i));
                    }
                    nz7Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        ik.u0(xz7Var.getParentActivity(), jb6.M0(2131743507, null), true);
                    } else {
                        xz7Var.P1(jb6.M0(R.string.AppName, null), tL_error.text);
                    }
                    xz7Var.Q1(true, false);
                    break;
                }
            case 1:
                nz7 nz7Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    nz7Var2.e.K = password;
                    TwoStepVerificationActivity.f0(password);
                    nz7Var2.b();
                    break;
                }
                break;
            default:
                nz7 nz7Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    nz7Var3.e.K = password2;
                    TwoStepVerificationActivity.f0(password2);
                    Utilities.e.c(new ud7((byte) 14, (Object) nz7Var3, (Object) nz7Var3.b, nz7Var3.d));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mz7(nz7 nz7Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = nz7Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
