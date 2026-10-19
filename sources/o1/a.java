package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.w0;
import m.g3;
import org.telegram.ui.Components.s11;
import org.telegram.ui.Components.u11;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        int i10;
        boolean z10;
        k kVar;
        boolean z11;
        switch (this.a) {
            case 0:
                b bVar = (b) ((w0) ((g3) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.i;
                        if (j11 == 0) {
                            hVar.i = uptimeMillis;
                            hVar.f(hVar.b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.u;
                                double d = lVar2.i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.b, kVar2.a, j13);
                                l lVar3 = kVar2.u;
                                lVar3.i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.a, c10.b, j13);
                                kVar2.b = c11.a;
                                kVar2.a = c11.b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.u.c(kVar2.b, kVar2.a, j12);
                                kVar.b = c12.a;
                                kVar.a = c12.b;
                            }
                            float max = Math.max(kVar.b, kVar.h);
                            kVar.b = max;
                            kVar.b = Math.min(max, kVar.g);
                            float f7 = kVar.a;
                            l lVar4 = kVar.u;
                            lVar4.getClass();
                            if (Math.abs(f7) >= lVar4.e || Math.abs(r8 - ((float) lVar4.i)) >= lVar4.d) {
                                z11 = false;
                            } else {
                                kVar.b = (float) kVar.u.i;
                                kVar.a = 0.0f;
                                z11 = z10;
                            }
                            float min = Math.min(hVar.b, hVar.g);
                            hVar.b = min;
                            float max2 = Math.max(min, hVar.h);
                            hVar.b = max2;
                            hVar.f(max2);
                            if (z11) {
                                hVar.d(false);
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
                        bVar.d = new g3(bVar.c);
                    }
                    g3 g3Var = bVar.d;
                    ((Choreographer) g3Var.c).postFrameCallback((a) g3Var.d);
                    break;
                }
                break;
            default:
                s11 s11Var = ((u11) this.b).a;
                if (s11Var != null) {
                    Handler handler = s11Var.getHandler();
                    if (handler != null && s11Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((u11) this.b).a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
