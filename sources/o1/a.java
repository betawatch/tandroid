package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.u;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                b bVar = (b) ((u) ((lf.h) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
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
                                l lVar = kVar2.u;
                                double d = lVar.i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.b, kVar2.a, j12);
                                l lVar2 = kVar2.u;
                                lVar2.i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.a, c10.b, j12);
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
                            l lVar3 = kVar.u;
                            lVar3.getClass();
                            if (Math.abs(f7) >= lVar3.e || Math.abs(r8 - ((float) lVar3.i)) >= lVar3.d) {
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
                        bVar.d = new lf.h(bVar.c);
                    }
                    lf.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.c).postFrameCallback((a) hVar2.d);
                    break;
                }
                break;
            default:
                j11 j11Var = ((l11) this.b).a;
                if (j11Var != null) {
                    Handler handler = j11Var.getHandler();
                    if (handler != null && j11Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((l11) this.b).a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
