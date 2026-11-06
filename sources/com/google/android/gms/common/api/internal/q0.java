package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class q0 implements OnCompleteListener {
    public final g a;
    public final int b;
    public final a c;
    public final long d;
    public final long e;

    public q0(g gVar, int i7, a aVar, long j3, long j10) {
        this.a = gVar;
        this.b = i7;
        this.c = aVar;
        this.d = j3;
        this.e = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q6.f a(j0 j0Var, q6.d dVar, int i7) {
        q6.h0 h0Var = dVar.B;
        q6.f fVar = h0Var == null ? null : h0Var.d;
        if (fVar != null && fVar.b) {
            int[] iArr = fVar.d;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = fVar.f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i7) {
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
                    if (iArr[i10] != i7) {
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
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        long j3;
        long j10;
        g gVar = this.a;
        if (gVar.f()) {
            q6.o oVar = (q6.o) q6.n.a().a;
            if (oVar == null || oVar.b) {
                j0 j0Var = (j0) gVar.s.get(this.c);
                if (j0Var != null) {
                    Object obj = j0Var.b;
                    if (obj instanceof q6.d) {
                        q6.d dVar = (q6.d) obj;
                        long j11 = this.d;
                        int i14 = 0;
                        boolean z9 = j11 > 0;
                        int i15 = dVar.v;
                        if (oVar != null) {
                            z9 &= oVar.c;
                            i7 = oVar.d;
                            i11 = oVar.e;
                            i10 = oVar.a;
                            if (dVar.B != null && !dVar.t()) {
                                q6.f a10 = a(j0Var, dVar, this.b);
                                if (a10 == null) {
                                    return;
                                }
                                boolean z10 = a10.c && j11 > 0;
                                i11 = a10.e;
                                z9 = z10;
                            }
                        } else {
                            i7 = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i16 = i7;
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
                                n6.a aVar = status.d;
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
                        if (z9) {
                            long j12 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i17 = (int) (SystemClock.elapsedRealtime() - j12);
                            j10 = currentTimeMillis;
                            j3 = j11;
                        } else {
                            j3 = 0;
                            j10 = 0;
                        }
                        r0 r0Var = new r0(new q6.k(this.b, i13, i14, j3, j10, null, null, i15, i17), i10, i16, i11);
                        com.google.android.gms.internal.cast.y yVar = gVar.y;
                        yVar.sendMessage(yVar.obtainMessage(18, r0Var));
                    }
                }
            }
        }
    }
}
