package ai;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ p(s sVar, int i7) {
        this.a = i7;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        CountDownLatch e10;
        switch (this.a) {
            case 0:
                DictationAsr.D(this.b);
                break;
            case 1:
                s sVar = this.b;
                DictationAsr.r().mkdirs();
                if (i1.d() && (e10 = i1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                ArrayList a10 = i1.a();
                Future submit = DictationAsr.f.submit(new aa.s(a10, 1));
                int u10 = DictationAsr.u(sVar.a(), i1.f(a10, sVar.b), sVar);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, u10};
                boolean z10 = false;
                boolean z11 = true;
                boolean z12 = false;
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = iArr[i10];
                    if (i11 < 0) {
                        z11 = false;
                    }
                    if (i11 > 0) {
                        z12 = true;
                    }
                }
                sVar.h = false;
                if (z11) {
                    np.e1().edit().putLong("tinyasr_checked_" + sVar.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.w(sVar) && (z12 || sVar.d == 0)) {
                    sVar.g = true;
                    DictationAsr.d.execute(new p(sVar, 2));
                } else if (!DictationAsr.w(sVar)) {
                    org.telegram.messenger.g0.h3(new q(z10, sVar));
                }
                DictationAsr.o();
                break;
            default:
                DictationAsr.D(this.b);
                break;
        }
    }
}
