// default package

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nn implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        float f;
        boolean z2;
        switch (this.a) {
            case 0:
                on onVar = (on) ((wz4) ((rx6) this.b).b).a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = onVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                for (int i = 0; i < arrayList.size(); i++) {
                    vpa vpaVar = (vpa) arrayList.get(i);
                    if (vpaVar != null) {
                        vla vlaVar = onVar.a;
                        Long l = (Long) vlaVar.get(vpaVar);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                vlaVar.remove(vpaVar);
                            }
                        }
                        long j2 = vpaVar.i;
                        if (j2 == 0) {
                            vpaVar.i = uptimeMillis;
                            vpaVar.g(vpaVar.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            vpaVar.i = uptimeMillis;
                            float f2 = vpaVar.n;
                            wpa wpaVar = vpaVar.m;
                            if (f2 != Float.MAX_VALUE) {
                                double d = wpaVar.i;
                                z = true;
                                long j4 = j3 / 2;
                                s1 c = wpaVar.c(vpaVar.b, vpaVar.a, j4);
                                wpa wpaVar2 = vpaVar.m;
                                wpaVar2.i = vpaVar.n;
                                vpaVar.n = Float.MAX_VALUE;
                                s1 c2 = wpaVar2.c(c.a, c.b, j4);
                                f = c2.a;
                                vpaVar.b = f;
                                vpaVar.a = c2.b;
                            } else {
                                z = true;
                                s1 c3 = wpaVar.c(vpaVar.b, vpaVar.a, j3);
                                f = c3.a;
                                vpaVar.b = f;
                                vpaVar.a = c3.b;
                            }
                            float max = Math.max(f, vpaVar.h);
                            vpaVar.b = max;
                            vpaVar.b = Math.min(max, vpaVar.g);
                            float f3 = vpaVar.a;
                            wpa wpaVar3 = vpaVar.m;
                            if (Math.abs(f3) >= wpaVar3.e || Math.abs(r9 - ((float) wpaVar3.i)) >= wpaVar3.d) {
                                z2 = false;
                            } else {
                                vpaVar.b = (float) vpaVar.m.i;
                                vpaVar.a = 0.0f;
                                z2 = z;
                            }
                            float min = Math.min(vpaVar.b, vpaVar.g);
                            vpaVar.b = min;
                            float max2 = Math.max(min, vpaVar.h);
                            vpaVar.b = max2;
                            vpaVar.g(max2);
                            if (z2) {
                                vpaVar.e(false);
                            }
                        }
                    }
                }
                if (onVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    onVar.e = false;
                }
                if (arrayList.size() > 0) {
                    rx6 rx6Var = onVar.d;
                    if (rx6Var == null) {
                        rx6Var = new rx6(onVar.c);
                        onVar.d = rx6Var;
                    }
                    ((Choreographer) rx6Var.c).postFrameCallback((nn) rx6Var.d);
                    break;
                }
                break;
            default:
                fnb fnbVar = ((hnb) this.b).a;
                if (fnbVar != null) {
                    Handler handler = fnbVar.getHandler();
                    if (handler != null && fnbVar.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((hnb) this.b).a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
