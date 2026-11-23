package org.telegram.ui.Components;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class iz0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iz0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        boolean z10;
        int i7;
        boolean z11;
        switch (this.a) {
            case 0:
                mz0 mz0Var = ((oz0) this.b).a;
                if (mz0Var != null) {
                    Handler handler = mz0Var.getHandler();
                    if (handler != null && mz0Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((oz0) this.b).a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
            default:
                r1.a aVar = (r1.a) ((qf) ((org.telegram.ui.md0) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = aVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    r1.g gVar = (r1.g) arrayList.get(i10);
                    if (gVar != null) {
                        a0.l lVar = aVar.a;
                        Long l10 = (Long) lVar.get(gVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                lVar.remove(gVar);
                            }
                        }
                        long j10 = gVar.i;
                        if (j10 == 0) {
                            gVar.i = uptimeMillis;
                            gVar.g(gVar.b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            gVar.i = uptimeMillis;
                            if (gVar.n != Float.MAX_VALUE) {
                                r1.h hVar = gVar.m;
                                double d = hVar.i;
                                z10 = true;
                                long j12 = j11 / 2;
                                org.telegram.ui.Cells.i c10 = hVar.c(gVar.b, gVar.a, j12);
                                r1.h hVar2 = gVar.m;
                                hVar2.i = gVar.n;
                                gVar.n = Float.MAX_VALUE;
                                org.telegram.ui.Cells.i c11 = hVar2.c(c10.a, c10.b, j12);
                                gVar.b = c11.a;
                                gVar.a = c11.b;
                            } else {
                                z10 = true;
                                org.telegram.ui.Cells.i c12 = gVar.m.c(gVar.b, gVar.a, j11);
                                gVar.b = c12.a;
                                gVar.a = c12.b;
                            }
                            float max = Math.max(gVar.b, gVar.h);
                            gVar.b = max;
                            gVar.b = Math.min(max, gVar.g);
                            float f10 = gVar.a;
                            r1.h hVar3 = gVar.m;
                            hVar3.getClass();
                            double abs = Math.abs(f10);
                            i7 = i10;
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
                            i10 = i7 + 1;
                        }
                    }
                    i7 = i10;
                    i10 = i7 + 1;
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
                        aVar.d = new org.telegram.ui.md0(aVar.c);
                    }
                    org.telegram.ui.md0 md0Var = aVar.d;
                    ((Choreographer) md0Var.c).postFrameCallback((iz0) md0Var.d);
                    break;
                }
                break;
        }
    }
}
