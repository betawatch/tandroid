package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wy0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        boolean z10;
        int i3;
        boolean z11;
        switch (this.a) {
            case 0:
                az0 az0Var = ((cz0) this.b).a;
                if (az0Var != null) {
                    Handler handler = az0Var.getHandler();
                    if (handler != null && az0Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((cz0) this.b).a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
            default:
                q1.a aVar = (q1.a) ((nh) ((p7.d) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    q1.g gVar = (q1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j11 = gVar.i;
                        if (j11 == 0) {
                            gVar.i = uptimeMillis;
                            gVar.g(gVar.b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            gVar.i = uptimeMillis;
                            if (gVar.n != Float.MAX_VALUE) {
                                q1.h hVar = gVar.m;
                                double d = hVar.i;
                                z10 = true;
                                long j13 = j12 / 2;
                                org.telegram.ui.Cells.i c2 = hVar.c(gVar.b, gVar.a, j13);
                                q1.h hVar2 = gVar.m;
                                hVar2.i = gVar.n;
                                gVar.n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c10 = hVar2.c(c2.a, c2.b, j13);
                                gVar.b = c10.a;
                                gVar.a = c10.b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c11 = gVar.m.c(gVar.b, gVar.a, j12);
                                gVar.b = c11.a;
                                gVar.a = c11.b;
                            }
                            float max = Math.max(gVar.b, gVar.h);
                            gVar.b = max;
                            gVar.b = Math.min(max, gVar.g);
                            float f10 = gVar.a;
                            q1.h hVar3 = gVar.m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i3 = i10;
                            if (abs >= hVar3.e || Math.abs(r10 - ((float) hVar3.i)) >= hVar3.d) {
                                z11 = false;
                            } else {
                                gVar.b = (float) gVar.m.i;
                                gVar.a = 0.0f;
                                z11 = z10;
                            }
                            float min = Math.min(gVar.b, gVar.g);
                            gVar.b = min;
                            float max2 = Math.max(min, gVar.h);
                            gVar.b = max2;
                            gVar.g(max2);
                            if (z11) {
                                gVar.e(false);
                            }
                            i10 = i3 + 1;
                        }
                    }
                    i3 = i10;
                    i10 = i3 + 1;
                }
                if (aVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.d == null) {
                        aVar.d = new p7.d(aVar.c);
                    }
                    p7.d dVar = aVar.d;
                    ((Choreographer) dVar.d).postFrameCallback((wy0) dVar.c);
                    break;
                }
                break;
        }
    }
}
