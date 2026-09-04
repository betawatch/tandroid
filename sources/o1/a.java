package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.g0;
import m2.t;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.w01;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        boolean z10;
        switch (this.a) {
            case 0:
                b bVar = (b) ((g0) ((t) this.b).b).b;
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
                        long j10 = hVar.i;
                        if (j10 == 0) {
                            hVar.i = uptimeMillis;
                            hVar.e(hVar.b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.u;
                                double d = lVar2.i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar2.c(kVar2.b, kVar2.a, j12);
                                l lVar3 = kVar2.u;
                                lVar3.i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.a, c10.b, j12);
                                kVar2.b = c11.a;
                                kVar2.a = c11.b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.u.c(kVar2.b, kVar2.a, j11);
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
                                z10 = false;
                            } else {
                                kVar.b = (float) kVar.u.i;
                                kVar.a = 0.0f;
                                z10 = true;
                            }
                            float min = Math.min(hVar.b, hVar.g);
                            hVar.b = min;
                            float max2 = Math.max(min, hVar.h);
                            hVar.b = max2;
                            hVar.e(max2);
                            if (z10) {
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
                        bVar.d = new t(bVar.c);
                    }
                    t tVar = bVar.d;
                    ((Choreographer) tVar.c).postFrameCallback((a) tVar.d);
                    break;
                }
                break;
            default:
                u01 u01Var = ((w01) this.b).a;
                if (u01Var != null) {
                    Handler handler = u01Var.getHandler();
                    if (handler != null && u01Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((w01) this.b).a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
