package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r0 implements OnCompleteListener {
    public final g a;
    public final int b;
    public final a c;
    public final long d;
    public final long e;

    public r0(g gVar, int i3, a aVar, long j10, long j11) {
        this.a = gVar;
        this.b = i3;
        this.c = aVar;
        this.d = j10;
        this.e = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p6.f a(j0 j0Var, p6.d dVar, int i3) {
        p6.h0 h0Var = dVar.B;
        p6.f fVar = h0Var == null ? null : h0Var.d;
        if (fVar != null && fVar.b) {
            int[] iArr = fVar.d;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = fVar.f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i3) {
                            break;
                        }
                        i10++;
                    }
                }
                if (j0Var.n >= fVar.e) {
                    return fVar;
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i3) {
                        i10++;
                    } else if (j0Var.n >= fVar.e) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        g gVar = this.a;
        if (gVar.f()) {
            p6.o oVar = (p6.o) p6.n.a().a;
            if (oVar == null || oVar.b) {
                j0 j0Var = (j0) gVar.s.get(this.c);
                if (j0Var != null) {
                    Object obj = j0Var.b;
                    if (obj instanceof p6.d) {
                        p6.d dVar = (p6.d) obj;
                        long j12 = this.d;
                        int i14 = 0;
                        boolean z10 = j12 > 0;
                        int i15 = dVar.v;
                        if (oVar != null) {
                            z10 &= oVar.c;
                            i3 = oVar.d;
                            i11 = oVar.e;
                            i10 = oVar.a;
                            if (dVar.B != null && !dVar.s()) {
                                p6.f a10 = a(j0Var, dVar, this.b);
                                if (a10 == null) {
                                    return;
                                }
                                boolean z11 = a10.c && j12 > 0;
                                i11 = a10.e;
                                z10 = z11;
                            }
                        } else {
                            i3 = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i16 = i3;
                        int i17 = -1;
                        if (task.isSuccessful()) {
                            i13 = 0;
                        } else if (task.isCanceled()) {
                            i14 = -1;
                            i13 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof com.google.android.gms.common.api.f) {
                                Status status = ((com.google.android.gms.common.api.f) exception).getStatus();
                                i12 = status.a;
                                m6.a aVar = status.d;
                                if (aVar != null) {
                                    i13 = i12;
                                    i14 = aVar.b;
                                }
                            } else {
                                i12 = 101;
                            }
                            i13 = i12;
                            i14 = -1;
                        }
                        if (z10) {
                            long j13 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i17 = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = currentTimeMillis;
                            j10 = j12;
                        } else {
                            j10 = 0;
                            j11 = 0;
                        }
                        s0 s0Var = new s0(new p6.k(this.b, i13, i14, j10, j11, null, null, i15, i17), i10, i16, i11);
                        com.google.android.gms.internal.cast.z zVar = gVar.y;
                        zVar.sendMessage(zVar.obtainMessage(18, s0Var));
                    }
                }
            }
        }
    }
}
