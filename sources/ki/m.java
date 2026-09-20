package ki;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ m(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
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
        x xVar;
        switch (this.a) {
            case 0:
                o oVar = this.b;
                if (oVar.U && oVar.F != 0) {
                    try {
                        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        long j10 = elapsedRealtimeNanos - oVar.G;
                        int i11 = oVar.F;
                        int i12 = 3;
                        if (i11 == 1) {
                            float f12 = o.f(j10 / 1.0E8f);
                            if (j10 >= 100000000) {
                                j3 = 140000000;
                                if (!oVar.D) {
                                    i12 = 2;
                                }
                                oVar.F = i12;
                                oVar.G = elapsedRealtimeNanos;
                            } else {
                                j3 = 140000000;
                            }
                            f10 = f12;
                        } else {
                            j3 = 140000000;
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    float f13 = o.f(j10 / 1.2E8f);
                                    if (j10 < 120000000) {
                                        f11 = f13;
                                        f10 = 1.0f;
                                        f7 = 1.0f;
                                        oVar.v.n(f10, f7, f11, oVar.r, oVar.s);
                                        oVar.N++;
                                        oVar.i(oVar.b());
                                        if (oVar.F == 4 && j10 >= j3) {
                                            xVar = oVar.v;
                                            if (!xVar.x) {
                                                xVar.r = xVar.u;
                                                xVar.s = xVar.t;
                                                xVar.w = true;
                                                xVar.v = elapsedRealtimeNanos;
                                                xVar.x = false;
                                            }
                                            oVar.F = 0;
                                            oVar.e.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - oVar.H) / 1000000.0f) + ", syntheticFrames=" + oVar.N);
                                        }
                                        i10 = oVar.F;
                                        if (i10 != 0 && i10 != 2 && (handler = oVar.k) != null) {
                                            handler.postDelayed(oVar.Z, 33L);
                                            break;
                                        }
                                    } else {
                                        oVar.F = 4;
                                        oVar.G = elapsedRealtimeNanos;
                                        f10 = 1.0f;
                                        f7 = 1.0f;
                                    }
                                } else if (i11 == 4) {
                                    float f14 = 1.0f - o.f(j10 / 1.4E8f);
                                    if (j10 >= 140000000) {
                                        f10 = 1.0f;
                                        f7 = 0.0f;
                                    } else {
                                        f7 = f14;
                                        f10 = 1.0f;
                                    }
                                }
                                f11 = 1.0f;
                                oVar.v.n(f10, f7, f11, oVar.r, oVar.s);
                                oVar.N++;
                                oVar.i(oVar.b());
                                if (oVar.F == 4) {
                                    xVar = oVar.v;
                                    if (!xVar.x) {
                                    }
                                    oVar.F = 0;
                                    oVar.e.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - oVar.H) / 1000000.0f) + ", syntheticFrames=" + oVar.N);
                                }
                                i10 = oVar.F;
                                if (i10 != 0) {
                                }
                            }
                            f10 = 1.0f;
                        }
                        f7 = 1.0f;
                        f11 = 0.0f;
                        oVar.v.n(f10, f7, f11, oVar.r, oVar.s);
                        oVar.N++;
                        oVar.i(oVar.b());
                        if (oVar.F == 4) {
                        }
                        i10 = oVar.F;
                        if (i10 != 0) {
                        }
                    } catch (RuntimeException e) {
                        oVar.F = 0;
                        oVar.e.a("GL error", e);
                        a aVar = oVar.i;
                        if (aVar != null) {
                            k2.u uVar = aVar.a;
                            ((o0) uVar.b).h.post(new l(2, uVar, e));
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                o oVar2 = this.b;
                if (oVar2.F != 0) {
                    oVar2.E = true;
                    break;
                }
                break;
        }
    }
}
