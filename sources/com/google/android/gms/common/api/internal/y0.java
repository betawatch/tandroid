package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y0 implements OnCompleteListener {
    public final h a;
    public final int b;
    public final b c;
    public final long d;
    public final long e;

    public y0(h hVar, int i10, b bVar, long j10, long j11) {
        this.a = hVar;
        this.b = i10;
        this.c = bVar;
        this.d = j10;
        this.e = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y5.e a(p0 p0Var, y5.g gVar, int i10) {
        y5.f0 f0Var = gVar.M;
        y5.e eVar = f0Var == null ? null : f0Var.d;
        if (eVar != null && eVar.b) {
            int[] iArr = eVar.d;
            int i11 = 0;
            if (iArr == null) {
                int[] iArr2 = eVar.f;
                if (iArr2 != null) {
                    while (i11 < iArr2.length) {
                        if (iArr2[i11] == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                if (p0Var.n >= eVar.e) {
                    return eVar;
                }
            } else {
                while (i11 < iArr.length) {
                    if (iArr[i11] != i10) {
                        i11++;
                    } else if (p0Var.n >= eVar.e) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        int i15;
        long j12 = this.d;
        h hVar = this.a;
        if (hVar.b()) {
            y5.n nVar = (y5.n) y5.m.a().a;
            if (nVar == null || nVar.b) {
                p0 p0Var = (p0) hVar.s.get(this.c);
                if (p0Var != null) {
                    com.google.android.gms.common.api.c cVar = p0Var.b;
                    if (cVar instanceof y5.g) {
                        y5.g gVar = (y5.g) cVar;
                        boolean z10 = j12 > 0;
                        int i16 = gVar.H;
                        if (nVar != null) {
                            z10 &= nVar.c;
                            int i17 = nVar.d;
                            int i18 = nVar.e;
                            int i19 = nVar.a;
                            if (gVar.M == null || gVar.d()) {
                                i11 = i19;
                                i12 = i18;
                            } else {
                                y5.e a2 = a(p0Var, gVar, this.b);
                                if (a2 == null) {
                                    return;
                                }
                                boolean z11 = a2.c && j12 > 0;
                                i11 = i19;
                                i12 = a2.e;
                                z10 = z11;
                            }
                            i10 = i17;
                        } else {
                            i10 = 5000;
                            i11 = 0;
                            i12 = 100;
                        }
                        if (task.isSuccessful()) {
                            i13 = 0;
                            i14 = 0;
                        } else {
                            if (task.isCanceled()) {
                                i13 = 100;
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof com.google.android.gms.common.api.f) {
                                    Status status = ((com.google.android.gms.common.api.f) exception).getStatus();
                                    int i20 = status.a;
                                    v5.a aVar = status.d;
                                    if (aVar == null) {
                                        i13 = i20;
                                    } else {
                                        i14 = aVar.b;
                                        i13 = i20;
                                    }
                                } else {
                                    i13 = 101;
                                }
                            }
                            i14 = -1;
                        }
                        if (z10) {
                            long j13 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            j10 = j12;
                            i15 = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = currentTimeMillis;
                        } else {
                            j10 = 0;
                            j11 = 0;
                            i15 = -1;
                        }
                        z0 z0Var = new z0(new y5.j(this.b, i13, i14, j10, j11, null, null, i16, i15), i11, i10, i12);
                        c2.t0 t0Var = hVar.x;
                        t0Var.sendMessage(t0Var.obtainMessage(18, z0Var));
                    }
                }
            }
        }
    }
}
