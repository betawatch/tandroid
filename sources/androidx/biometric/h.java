package androidx.biometric;

import android.util.Log;
import java.util.concurrent.Executor;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void X(Object obj) {
        int i7 = this.a;
        q qVar = this.b;
        switch (i7) {
            case 0:
                u uVar = (u) obj;
                if (uVar != null) {
                    qVar.V(uVar);
                    z zVar = qVar.l0;
                    if (zVar.r == null) {
                        zVar.r = new androidx.lifecycle.z();
                    }
                    z.h(zVar.r, null);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(R.string.fingerprint_not_recognized));
                    }
                    z zVar2 = qVar.l0;
                    if (zVar2.n) {
                        Executor executor = zVar2.d;
                        if (executor == null) {
                            executor = new o(1);
                        }
                        executor.execute(new g(qVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    z zVar3 = qVar.l0;
                    if (zVar3.u == null) {
                        zVar3.u = new androidx.lifecycle.z();
                    }
                    z.h(zVar3.u, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
