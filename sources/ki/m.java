package ki;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ m(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0 A[Catch: RuntimeException -> 0x0052, TryCatch #0 {RuntimeException -> 0x0052, blocks: (B:15:0x0020, B:17:0x0033, B:19:0x0044, B:22:0x004d, B:25:0x00a6, B:29:0x00c9, B:32:0x00de, B:33:0x00d0, B:34:0x0103, B:37:0x0109, B:39:0x010d, B:51:0x0069, B:53:0x0079, B:57:0x008d), top: B:14:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[ADDED_TO_REGION] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        float f7;
        float f10;
        float f11;
        int i10;
        Handler handler;
        a0 a0Var;
        switch (this.a) {
            case 0:
                q qVar = this.b;
                if (qVar.V && qVar.G != 0) {
                    try {
                        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        long j10 = elapsedRealtimeNanos - qVar.H;
                        int i11 = qVar.G;
                        int i12 = 3;
                        if (i11 == 1) {
                            float f12 = q.f(j10 / 1.0E8f);
                            if (j10 >= 100000000) {
                                j3 = 140000000;
                                if (!qVar.E) {
                                    i12 = 2;
                                }
                                qVar.G = i12;
                                qVar.H = elapsedRealtimeNanos;
                            } else {
                                j3 = 140000000;
                            }
                            f10 = f12;
                        } else {
                            j3 = 140000000;
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    float f13 = q.f(j10 / 1.2E8f);
                                    if (j10 < 120000000) {
                                        f11 = f13;
                                        f10 = 1.0f;
                                        f7 = 1.0f;
                                        qVar.w.n(f10, f7, f11, qVar.s, qVar.t);
                                        qVar.O++;
                                        qVar.h(qVar.b());
                                        if (qVar.G == 4 && j10 >= j3) {
                                            a0Var = qVar.w;
                                            if (!a0Var.x) {
                                                a0Var.r = a0Var.u;
                                                a0Var.s = a0Var.t;
                                                a0Var.w = true;
                                                a0Var.v = elapsedRealtimeNanos;
                                                a0Var.x = false;
                                            }
                                            qVar.G = 0;
                                            qVar.e.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - qVar.I) / 1000000.0f) + ", syntheticFrames=" + qVar.O);
                                        }
                                        i10 = qVar.G;
                                        if (i10 != 0 && i10 != 2 && (handler = qVar.l) != null) {
                                            handler.postDelayed(qVar.a0, 33L);
                                            break;
                                        }
                                    } else {
                                        qVar.G = 4;
                                        qVar.H = elapsedRealtimeNanos;
                                        f10 = 1.0f;
                                        f7 = 1.0f;
                                    }
                                } else if (i11 == 4) {
                                    float f14 = 1.0f - q.f(j10 / 1.4E8f);
                                    if (j10 >= 140000000) {
                                        f10 = 1.0f;
                                        f7 = 0.0f;
                                    } else {
                                        f7 = f14;
                                        f10 = 1.0f;
                                    }
                                }
                                f11 = 1.0f;
                                qVar.w.n(f10, f7, f11, qVar.s, qVar.t);
                                qVar.O++;
                                qVar.h(qVar.b());
                                if (qVar.G == 4) {
                                    a0Var = qVar.w;
                                    if (!a0Var.x) {
                                    }
                                    qVar.G = 0;
                                    qVar.e.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - qVar.I) / 1000000.0f) + ", syntheticFrames=" + qVar.O);
                                }
                                i10 = qVar.G;
                                if (i10 != 0) {
                                }
                            }
                            f10 = 1.0f;
                        }
                        f7 = 1.0f;
                        f11 = 0.0f;
                        qVar.w.n(f10, f7, f11, qVar.s, qVar.t);
                        qVar.O++;
                        qVar.h(qVar.b());
                        if (qVar.G == 4) {
                        }
                        i10 = qVar.G;
                        if (i10 != 0) {
                        }
                    } catch (RuntimeException e) {
                        qVar.G = 0;
                        qVar.e.a("GL error", e);
                        a aVar = qVar.j;
                        if (aVar != null) {
                            k2.u uVar = aVar.a;
                            ((r0) uVar.b).h.post(new n(2, uVar, e));
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                q qVar2 = this.b;
                if (qVar2.G != 0) {
                    qVar2.F = true;
                    break;
                }
                break;
        }
    }
}
