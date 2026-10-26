package o1;

import a0.l;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import jg.s0;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.g21;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        j jVar;
        boolean z11;
        switch (this.a) {
            case 0:
                b bVar = (b) ((s0) ((k6.c) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        l lVar = bVar.a;
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
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar = jVar2.u;
                                double d = kVar.i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = kVar.c(jVar2.b, jVar2.a, j13);
                                k kVar2 = jVar2.u;
                                kVar2.i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c11 = kVar2.c(c10.a, c10.b, j13);
                                jVar2.b = c11.a;
                                jVar2.a = c11.b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                jVar = jVar2;
                                e c12 = jVar2.u.c(jVar2.b, jVar2.a, j12);
                                jVar.b = c12.a;
                                jVar.a = c12.b;
                            }
                            float max = Math.max(jVar.b, jVar.h);
                            jVar.b = max;
                            jVar.b = Math.min(max, jVar.g);
                            float f7 = jVar.a;
                            k kVar3 = jVar.u;
                            kVar3.getClass();
                            if (Math.abs(f7) >= kVar3.e || Math.abs(r8 - ((float) kVar3.i)) >= kVar3.d) {
                                z11 = false;
                            } else {
                                jVar.b = (float) jVar.u.i;
                                jVar.a = 0.0f;
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
                        bVar.d = new k6.c(bVar.c);
                    }
                    k6.c cVar = bVar.d;
                    ((Choreographer) cVar.c).postFrameCallback((a) cVar.d);
                    break;
                }
                break;
            default:
                e21 e21Var = ((g21) this.b).a;
                if (e21Var != null) {
                    Handler handler = e21Var.getHandler();
                    if (handler != null && e21Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((g21) this.b).a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
