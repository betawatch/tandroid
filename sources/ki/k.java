package ki;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ k(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
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
        v vVar;
        switch (this.a) {
            case 0:
                m mVar = this.b;
                if (mVar.T && mVar.E != 0) {
                    try {
                        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        long j10 = elapsedRealtimeNanos - mVar.F;
                        int i11 = mVar.E;
                        int i12 = 3;
                        if (i11 == 1) {
                            float f12 = m.f(j10 / 1.0E8f);
                            if (j10 >= 100000000) {
                                j3 = 140000000;
                                if (!mVar.C) {
                                    i12 = 2;
                                }
                                mVar.E = i12;
                                mVar.F = elapsedRealtimeNanos;
                            } else {
                                j3 = 140000000;
                            }
                            f10 = f12;
                        } else {
                            j3 = 140000000;
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    float f13 = m.f(j10 / 1.2E8f);
                                    if (j10 < 120000000) {
                                        f11 = f13;
                                        f10 = 1.0f;
                                        f7 = 1.0f;
                                        mVar.u.l(f10, f7, f11, mVar.q, mVar.r);
                                        mVar.M++;
                                        mVar.i(mVar.b());
                                        if (mVar.E == 4 && j10 >= j3) {
                                            vVar = mVar.u;
                                            if (!vVar.w) {
                                                vVar.q = vVar.t;
                                                vVar.r = vVar.s;
                                                vVar.v = true;
                                                vVar.u = elapsedRealtimeNanos;
                                                vVar.w = false;
                                            }
                                            mVar.E = 0;
                                            mVar.d.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - mVar.G) / 1000000.0f) + ", syntheticFrames=" + mVar.M);
                                        }
                                        i10 = mVar.E;
                                        if (i10 != 0 && i10 != 2 && (handler = mVar.j) != null) {
                                            handler.postDelayed(mVar.Y, 33L);
                                            break;
                                        }
                                    } else {
                                        mVar.E = 4;
                                        mVar.F = elapsedRealtimeNanos;
                                        f10 = 1.0f;
                                        f7 = 1.0f;
                                    }
                                } else if (i11 == 4) {
                                    float f14 = 1.0f - m.f(j10 / 1.4E8f);
                                    if (j10 >= 140000000) {
                                        f10 = 1.0f;
                                        f7 = 0.0f;
                                    } else {
                                        f7 = f14;
                                        f10 = 1.0f;
                                    }
                                }
                                f11 = 1.0f;
                                mVar.u.l(f10, f7, f11, mVar.q, mVar.r);
                                mVar.M++;
                                mVar.i(mVar.b());
                                if (mVar.E == 4) {
                                    vVar = mVar.u;
                                    if (!vVar.w) {
                                    }
                                    mVar.E = 0;
                                    mVar.d.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - mVar.G) / 1000000.0f) + ", syntheticFrames=" + mVar.M);
                                }
                                i10 = mVar.E;
                                if (i10 != 0) {
                                }
                            }
                            f10 = 1.0f;
                        }
                        f7 = 1.0f;
                        f11 = 0.0f;
                        mVar.u.l(f10, f7, f11, mVar.q, mVar.r);
                        mVar.M++;
                        mVar.i(mVar.b());
                        if (mVar.E == 4) {
                        }
                        i10 = mVar.E;
                        if (i10 != 0) {
                        }
                    } catch (RuntimeException e) {
                        mVar.E = 0;
                        mVar.d.a("GL error", e);
                        b bVar = mVar.h;
                        if (bVar != null) {
                            k2.u uVar = bVar.a;
                            ((h0) uVar.b).h.post(new c0(0, uVar, e));
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                m mVar2 = this.b;
                if (mVar2.E != 0) {
                    mVar2.D = true;
                    break;
                }
                break;
        }
    }
}
