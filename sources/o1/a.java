package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.biometric.e0;
import java.util.ArrayList;
import l7.w0;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.y01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        boolean z4;
        switch (this.a) {
            case 0:
                b bVar = (b) ((e0) ((w0) this.b).b).b;
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
                                e c3 = kVar2.c(jVar2.b, jVar2.a, j13);
                                k kVar3 = jVar2.u;
                                kVar3.i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c10 = kVar3.c(c3.a, c3.b, j13);
                                jVar2.b = c10.a;
                                jVar2.a = c10.b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                jVar = jVar2;
                                e c11 = jVar2.u.c(jVar2.b, jVar2.a, j12);
                                jVar.b = c11.a;
                                jVar.a = c11.b;
                            }
                            float max = Math.max(jVar.b, jVar.h);
                            jVar.b = max;
                            jVar.b = Math.min(max, jVar.g);
                            float f10 = jVar.a;
                            k kVar4 = jVar.u;
                            kVar4.getClass();
                            if (Math.abs(f10) >= kVar4.e || Math.abs(r8 - ((float) kVar4.i)) >= kVar4.d) {
                                z4 = false;
                            } else {
                                jVar.b = (float) jVar.u.i;
                                jVar.a = 0.0f;
                                z4 = true;
                            }
                            float min = Math.min(hVar.b, hVar.g);
                            hVar.b = min;
                            float max2 = Math.max(min, hVar.h);
                            hVar.b = max2;
                            hVar.e(max2);
                            if (z4) {
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
                        bVar.d = new w0(bVar.c);
                    }
                    w0 w0Var = bVar.d;
                    ((Choreographer) w0Var.c).postFrameCallback((a) w0Var.d);
                    break;
                }
                break;
            default:
                y01 y01Var = ((a11) this.b).a;
                if (y01Var != null) {
                    Handler handler = y01Var.getHandler();
                    if (handler != null && y01Var.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((a11) this.b).a.P) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
