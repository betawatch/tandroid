package ai;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q c;

    public /* synthetic */ m(boolean z10, q qVar, int i7) {
        this.a = i7;
        this.b = z10;
        this.c = qVar;
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
                q qVar = this.c;
                DictationAsr.u().mkdirs();
                if (h1.d() && (e10 = h1.e()) != null) {
                    try {
                        e10.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a10 = h1.a();
                Future submit = DictationAsr.f.submit(new Callable() { // from class: ai.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList = a10;
                        boolean z12 = z11;
                        q[] qVarArr = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.x("silero_vad.onnx", h1.f(arrayList, "silero-vad"), null, z12));
                    }
                });
                int x10 = DictationAsr.x(qVar.b(), h1.f(a10, qVar.c), qVar, z11);
                try {
                    i7 = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i7 = -1;
                }
                int[] iArr = {i7, x10};
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
                qVar.j = false;
                if (z13) {
                    mp.g1().edit().putLong("tinyasr_checked_" + qVar.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.A(qVar) && (z12 || qVar.f == 0)) {
                    qVar.i = true;
                    DictationAsr.d.execute(new l(qVar, 1));
                } else if (!DictationAsr.A(qVar)) {
                    org.telegram.messenger.g0.g3(new m(z10 ? 1 : 0, qVar, r4));
                }
                DictationAsr.q();
                break;
            default:
                boolean z15 = this.b;
                q qVar2 = this.c;
                q[] qVarArr = DictationAsr.a;
                if (z15 == (qVar2.f == 0 ? 0 : 1)) {
                    ArrayList arrayList = new ArrayList(qVar2.l);
                    qVar2.l.clear();
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((r) obj).a(z15);
                    }
                    break;
                }
                break;
        }
    }
}
