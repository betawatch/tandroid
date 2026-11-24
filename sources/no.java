// default package

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class no implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ no(Object obj, byte b) {
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
                oo ooVar = (oo) ((sz4) ((mx6) this.b).b).a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = ooVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                for (int i = 0; i < arrayList.size(); i++) {
                    zna znaVar = (zna) arrayList.get(i);
                    if (znaVar != null) {
                        cka ckaVar = ooVar.a;
                        Long l = (Long) ckaVar.get(znaVar);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                ckaVar.remove(znaVar);
                            }
                        }
                        long j2 = znaVar.i;
                        if (j2 == 0) {
                            znaVar.i = uptimeMillis;
                            znaVar.g(znaVar.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            znaVar.i = uptimeMillis;
                            float f2 = znaVar.n;
                            aoa aoaVar = znaVar.m;
                            if (f2 != Float.MAX_VALUE) {
                                double d = aoaVar.i;
                                z = true;
                                long j4 = j3 / 2;
                                r1 c = aoaVar.c(znaVar.b, znaVar.a, j4);
                                aoa aoaVar2 = znaVar.m;
                                aoaVar2.i = znaVar.n;
                                znaVar.n = Float.MAX_VALUE;
                                r1 c2 = aoaVar2.c(c.a, c.b, j4);
                                f = c2.a;
                                znaVar.b = f;
                                znaVar.a = c2.b;
                            } else {
                                z = true;
                                r1 c3 = aoaVar.c(znaVar.b, znaVar.a, j3);
                                f = c3.a;
                                znaVar.b = f;
                                znaVar.a = c3.b;
                            }
                            float max = Math.max(f, znaVar.h);
                            znaVar.b = max;
                            znaVar.b = Math.min(max, znaVar.g);
                            float f3 = znaVar.a;
                            aoa aoaVar3 = znaVar.m;
                            if (Math.abs(f3) >= aoaVar3.e || Math.abs(r9 - ((float) aoaVar3.i)) >= aoaVar3.d) {
                                z2 = false;
                            } else {
                                znaVar.b = (float) znaVar.m.i;
                                znaVar.a = 0.0f;
                                z2 = z;
                            }
                            float min = Math.min(znaVar.b, znaVar.g);
                            znaVar.b = min;
                            float max2 = Math.max(min, znaVar.h);
                            znaVar.b = max2;
                            znaVar.g(max2);
                            if (z2) {
                                znaVar.e(false);
                            }
                        }
                    }
                }
                if (ooVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    ooVar.e = false;
                }
                if (arrayList.size() > 0) {
                    mx6 mx6Var = ooVar.d;
                    if (mx6Var == null) {
                        mx6Var = new mx6(ooVar.c);
                        ooVar.d = mx6Var;
                    }
                    ((Choreographer) mx6Var.c).postFrameCallback((no) mx6Var.d);
                    break;
                }
                break;
            default:
                hlb hlbVar = ((jlb) this.b).a;
                if (hlbVar != null) {
                    Handler handler = hlbVar.getHandler();
                    if (handler != null && hlbVar.b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((jlb) this.b).a.T) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
