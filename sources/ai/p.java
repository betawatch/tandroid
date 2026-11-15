package ai;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ p(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
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
                t tVar = this.b;
                DictationAsr.r().mkdirs();
                if (j1.d() && (e10 = j1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                ArrayList a10 = j1.a();
                Future submit = DictationAsr.f.submit(new aa.s(a10, 1));
                int u10 = DictationAsr.u(tVar.a(), j1.f(a10, tVar.b), tVar);
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
                tVar.h = false;
                if (z11) {
                    np.e1().edit().putLong("tinyasr_checked_" + tVar.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.w(tVar) && (z12 || tVar.d == 0)) {
                    tVar.g = true;
                    DictationAsr.d.execute(new p(tVar, 2));
                } else if (!DictationAsr.w(tVar)) {
                    org.telegram.messenger.g0.h3(new q(z10, tVar));
                }
                DictationAsr.o();
                break;
            default:
                DictationAsr.D(this.b);
                break;
        }
    }
}
