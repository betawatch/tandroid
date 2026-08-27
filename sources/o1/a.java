package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        j jVar;
        boolean z10;
        switch (this.a) {
            case 0:
                b bVar = (b) ((n1.d) ((j9.a) this.b).b).b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.k kVar = bVar.a;
                        Long l10 = (Long) kVar.get(hVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                kVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.i;
                        if (j11 == 0) {
                            hVar.i = uptimeMillis;
                            hVar.e(hVar.b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.i = uptimeMillis;
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar2 = jVar2.u;
                                double d = kVar2.i;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = kVar2.c(jVar2.b, jVar2.a, j13);
                                k kVar3 = jVar2.u;
                                kVar3.i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c11 = kVar3.c(c10.a, c10.b, j13);
                                jVar2.b = c11.a;
                                jVar2.a = c11.b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                jVar = jVar2;
                                e c12 = jVar2.u.c(jVar2.b, jVar2.a, j12);
                                jVar.b = c12.a;
                                jVar.a = c12.b;
                            }
                            float max = Math.max(jVar.b, jVar.h);
                            jVar.b = max;
                            jVar.b = Math.min(max, jVar.g);
                            float f10 = jVar.a;
                            k kVar4 = jVar.u;
                            kVar4.getClass();
                            if (Math.abs(f10) >= kVar4.e || Math.abs(r8 - ((float) kVar4.i)) >= kVar4.d) {
                                z10 = false;
                            } else {
                                jVar.b = (float) jVar.u.i;
                                jVar.a = 0.0f;
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
                        bVar.d = new j9.a(bVar.c);
                    }
                    j9.a aVar = bVar.d;
                    ((Choreographer) aVar.c).postFrameCallback((a) aVar.d);
                    break;
                }
                break;
            default:
                d01 d01Var = ((f01) this.b).a;
                if (d01Var != null) {
                    Handler handler = d01Var.getHandler();
                    if (handler != null && d01Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((f01) this.b).a.O) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
