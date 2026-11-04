package androidx.biometric;

import android.util.Log;
import java.util.concurrent.Executor;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i3) {
        this.a = i3;
        this.b = qVar;
    }

    @Override // androidx.lifecycle.a0
    public final void v(Object obj) {
        int i3 = this.a;
        q qVar = this.b;
        switch (i3) {
            case 0:
                u uVar = (u) obj;
                if (uVar != null) {
                    qVar.V(uVar);
                    z zVar = qVar.m0;
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
                    z zVar2 = qVar.m0;
                    if (zVar2.n) {
                        Executor executor = zVar2.d;
                        if (executor == null) {
                            executor = new o(1);
                        }
                        executor.execute(new g(qVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    z zVar3 = qVar.m0;
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
