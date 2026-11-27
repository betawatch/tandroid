// default package

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nm3 c;

    public /* synthetic */ hm3(boolean z, nm3 nm3Var, byte b) {
        this.a = b;
        this.b = z;
        this.c = nm3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        CountDownLatch e;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                boolean z3 = this.b;
                nm3 nm3Var = this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (z3 == (nm3Var.f != 0)) {
                    ArrayList arrayList = new ArrayList(nm3Var.l);
                    nm3Var.l.clear();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((om3) obj).a(z3);
                    }
                    break;
                }
                break;
            default:
                final boolean z4 = this.b;
                nm3 nm3Var2 = this.c;
                DictationAsr.s().mkdirs();
                if (qn3.d() && (e = qn3.e()) != null) {
                    try {
                        e.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a = qn3.a();
                Future submit = DictationAsr.f.submit(new Callable() { // from class: lm3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList2 = a;
                        boolean z5 = z4;
                        nm3[] nm3VarArr2 = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.v("silero_vad.onnx", qn3.f(arrayList2, "silero-vad"), null, z5));
                    }
                });
                int v = DictationAsr.v(nm3Var2.b(), qn3.f(a, nm3Var2.c), nm3Var2, z4);
                try {
                    i = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i = -1;
                }
                int[] iArr = {i, v};
                int i3 = 0;
                boolean z5 = false;
                boolean z6 = true;
                while (i3 < 2) {
                    int i4 = iArr[i3];
                    boolean z7 = z6;
                    if (i4 < 0) {
                        z7 = false;
                    }
                    if (i4 > 0) {
                        z5 = true;
                    }
                    i3++;
                    z6 = z7;
                    z5 = z5;
                }
                nm3Var2.j = false;
                if (z6) {
                    uc7.e1().edit().putLong("tinyasr_checked_" + nm3Var2.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.z(nm3Var2) && (z5 || nm3Var2.f == 0)) {
                    nm3Var2.i = true;
                    DictationAsr.d.execute(new km3(nm3Var2, (byte) 1));
                } else if (!DictationAsr.z(nm3Var2)) {
                    hl.c3(new hm3(z2 ? 1 : 0, nm3Var2, z ? 1 : 0));
                }
                DictationAsr.o();
                break;
        }
    }
}
