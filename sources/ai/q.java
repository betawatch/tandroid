package ai;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t c;

    public /* synthetic */ q(boolean z10, t tVar, int i7) {
        this.a = i7;
        this.b = z10;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        CountDownLatch e10;
        int i10 = 0;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                final boolean z11 = this.b;
                t tVar = this.c;
                DictationAsr.q().mkdirs();
                if (j1.d() && (e10 = j1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a10 = j1.a();
                Future submit = DictationAsr.f.submit(new Callable() { // from class: ai.r
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList = a10;
                        boolean z12 = z11;
                        t[] tVarArr = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.t("silero_vad.onnx", j1.f(arrayList, "silero-vad"), null, z12));
                    }
                });
                int t6 = DictationAsr.t(tVar.a(), j1.f(a10, tVar.b), tVar, z11);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, t6};
                int i11 = 0;
                boolean z12 = false;
                boolean z13 = true;
                while (i11 < 2) {
                    int i12 = iArr[i11];
                    boolean z14 = z13;
                    if (i12 < 0) {
                        z14 = false;
                    }
                    if (i12 > 0) {
                        z12 = true;
                    }
                    i11++;
                    z13 = z14;
                    z12 = z12;
                }
                tVar.h = false;
                if (z13) {
                    mp.g1().edit().putLong("tinyasr_checked_" + tVar.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.w(tVar) && (z12 || tVar.d == 0)) {
                    tVar.g = true;
                    DictationAsr.d.execute(new p(tVar, 1));
                } else if (!DictationAsr.w(tVar)) {
                    org.telegram.messenger.g0.g3(new q(z10 ? 1 : 0, tVar, r4));
                }
                DictationAsr.n();
                break;
            default:
                boolean z15 = this.b;
                t tVar2 = this.c;
                t[] tVarArr = DictationAsr.a;
                if (z15 == (tVar2.d == 0 ? 0 : 1)) {
                    ArrayList arrayList = new ArrayList(tVar2.j);
                    tVar2.j.clear();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((u) obj).a(z15);
                    }
                    break;
                }
                break;
        }
    }
}
