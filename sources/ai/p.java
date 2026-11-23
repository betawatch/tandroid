package ai;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t c;

    public /* synthetic */ p(boolean z10, t tVar, int i7) {
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
                DictationAsr.s().mkdirs();
                if (m1.d() && (e10 = m1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a10 = m1.a();
                Future submit = DictationAsr.f.submit(new Callable() { // from class: ai.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList = a10;
                        boolean z12 = z11;
                        t[] tVarArr = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.v("silero_vad.onnx", m1.f(arrayList, "silero-vad"), null, z12));
                    }
                });
                int v = DictationAsr.v(tVar.b(), m1.f(a10, tVar.c), tVar, z11);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, v};
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
                tVar.j = false;
                if (z13) {
                    np.g1().edit().putLong("tinyasr_checked_" + tVar.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.y(tVar) && (z12 || tVar.f == 0)) {
                    tVar.i = true;
                    DictationAsr.d.execute(new o(tVar, 1));
                } else if (!DictationAsr.y(tVar)) {
                    org.telegram.messenger.g0.g3(new p(z10 ? 1 : 0, tVar, r4));
                }
                DictationAsr.p();
                break;
            default:
                boolean z15 = this.b;
                t tVar2 = this.c;
                t[] tVarArr = DictationAsr.a;
                if (z15 == (tVar2.f == 0 ? 0 : 1)) {
                    ArrayList arrayList = new ArrayList(tVar2.l);
                    tVar2.l.clear();
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
