package o1;

import a0.l;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m2.t;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h01;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        boolean z10;
        int i10;
        boolean z11;
        switch (this.a) {
            case 0:
                b bVar = (b) ((t) ((li.k) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    j jVar = (j) arrayList.get(i11);
                    if (jVar != null) {
                        l lVar = bVar.a;
                        Long l4 = (Long) lVar.get(jVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(jVar);
                            }
                        }
                        long j11 = jVar.i;
                        if (j11 == 0) {
                            jVar.i = uptimeMillis;
                            jVar.g(jVar.b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            jVar.i = uptimeMillis;
                            if (jVar.n != Float.MAX_VALUE) {
                                k kVar = jVar.m;
                                double d = kVar.i;
                                z10 = true;
                                long j13 = j12 / 2;
                                e c10 = kVar.c(jVar.b, jVar.a, j13);
                                k kVar2 = jVar.m;
                                kVar2.i = jVar.n;
                                jVar.n = Float.MAX_VALUE;
                                e c11 = kVar2.c(c10.a, c10.b, j13);
                                jVar.b = c11.a;
                                jVar.a = c11.b;
                            } else {
                                z10 = true;
                                e c12 = jVar.m.c(jVar.b, jVar.a, j12);
                                jVar.b = c12.a;
                                jVar.a = c12.b;
                            }
                            float max = Math.max(jVar.b, jVar.h);
                            jVar.b = max;
                            jVar.b = Math.min(max, jVar.g);
                            float f7 = jVar.a;
                            k kVar3 = jVar.m;
                            kVar3.getClass();
                            double abs = Math.abs(f7);
                            i10 = i11;
                            if (abs >= kVar3.e || Math.abs(r10 - ((float) kVar3.i)) >= kVar3.d) {
                                z11 = false;
                            } else {
                                jVar.b = (float) jVar.m.i;
                                jVar.a = 0.0f;
                                z11 = z10;
                            }
                            float min = Math.min(jVar.b, jVar.g);
                            jVar.b = min;
                            float max2 = Math.max(min, jVar.h);
                            jVar.b = max2;
                            jVar.g(max2);
                            if (z11) {
                                jVar.e(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (bVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new li.k(bVar.c);
                    }
                    li.k kVar4 = bVar.d;
                    ((Choreographer) kVar4.c).postFrameCallback((a) kVar4.d);
                    break;
                }
                break;
            default:
                f01 f01Var = ((h01) this.b).a;
                if (f01Var != null) {
                    Handler handler = f01Var.getHandler();
                    if (handler != null && f01Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((h01) this.b).a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
