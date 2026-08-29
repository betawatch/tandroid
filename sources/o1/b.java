package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import l3.g0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.p01;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        int i10;
        k kVar;
        boolean z10;
        switch (this.a) {
            case 0:
                c cVar = (c) ((a) ((g0) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = cVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    i iVar = (i) arrayList.get(i11);
                    if (iVar != null) {
                        a0.k kVar2 = cVar.a;
                        Long l10 = (Long) kVar2.get(iVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                kVar2.remove(iVar);
                            }
                        }
                        long j11 = iVar.i;
                        if (j11 == 0) {
                            iVar.i = uptimeMillis;
                            iVar.e(iVar.b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            iVar.i = uptimeMillis;
                            k kVar3 = (k) iVar;
                            if (kVar3.v != Float.MAX_VALUE) {
                                l lVar = kVar3.u;
                                double d = lVar.i;
                                i10 = i11;
                                long j13 = j12 / 2;
                                f c3 = lVar.c(kVar3.b, kVar3.a, j13);
                                l lVar2 = kVar3.u;
                                lVar2.i = kVar3.v;
                                kVar3.v = Float.MAX_VALUE;
                                f c6 = lVar2.c(c3.a, c3.b, j13);
                                kVar3.b = c6.a;
                                kVar3.a = c6.b;
                                kVar = kVar3;
                            } else {
                                i10 = i11;
                                kVar = kVar3;
                                f c10 = kVar3.u.c(kVar3.b, kVar3.a, j12);
                                kVar.b = c10.a;
                                kVar.a = c10.b;
                            }
                            float max = Math.max(kVar.b, kVar.h);
                            kVar.b = max;
                            kVar.b = Math.min(max, kVar.g);
                            float f9 = kVar.a;
                            l lVar3 = kVar.u;
                            lVar3.getClass();
                            if (Math.abs(f9) >= lVar3.e || Math.abs(r8 - ((float) lVar3.i)) >= lVar3.d) {
                                z10 = false;
                            } else {
                                kVar.b = (float) kVar.u.i;
                                kVar.a = 0.0f;
                                z10 = true;
                            }
                            float min = Math.min(iVar.b, iVar.g);
                            iVar.b = min;
                            float max2 = Math.max(min, iVar.h);
                            iVar.b = max2;
                            iVar.e(max2);
                            if (z10) {
                                iVar.d(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (cVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    cVar.e = false;
                }
                if (arrayList.size() > 0) {
                    if (cVar.d == null) {
                        cVar.d = new g0(cVar.c);
                    }
                    g0 g0Var = cVar.d;
                    ((Choreographer) g0Var.c).postFrameCallback((b) g0Var.d);
                    break;
                }
                break;
            default:
                n01 n01Var = ((p01) this.b).a;
                if (n01Var != null) {
                    Handler handler = n01Var.getHandler();
                    if (handler != null && n01Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((p01) this.b).a.O) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
