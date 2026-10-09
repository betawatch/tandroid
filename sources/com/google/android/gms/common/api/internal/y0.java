package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class y0 implements OnCompleteListener {
    public final h a;
    public final int b;
    public final b c;
    public final long d;
    public final long e;

    public y0(h hVar, int i10, b bVar, long j3, long j10) {
        this.a = hVar;
        this.b = i10;
        this.c = bVar;
        this.d = j3;
        this.e = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n6.e a(p0 p0Var, n6.g gVar, int i10) {
        n6.g0 g0Var = gVar.Q;
        n6.e eVar = g0Var == null ? null : g0Var.d;
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
        long j3;
        long j10;
        long j11 = this.d;
        h hVar = this.a;
        if (hVar.b()) {
            n6.n nVar = (n6.n) n6.m.a().a;
            if (nVar == null || nVar.b) {
                p0 p0Var = (p0) hVar.s.get(this.c);
                if (p0Var != null) {
                    com.google.android.gms.common.api.c cVar = p0Var.b;
                    if (cVar instanceof n6.g) {
                        n6.g gVar = (n6.g) cVar;
                        int i15 = 0;
                        boolean z10 = j11 > 0;
                        int i16 = gVar.L;
                        if (nVar != null) {
                            z10 &= nVar.c;
                            i10 = nVar.d;
                            int i17 = nVar.e;
                            int i18 = nVar.a;
                            if (gVar.Q == null || gVar.g()) {
                                i11 = i18;
                                i12 = i17;
                            } else {
                                n6.e a2 = a(p0Var, gVar, this.b);
                                if (a2 == null) {
                                    return;
                                }
                                boolean z11 = a2.c && j11 > 0;
                                i11 = i18;
                                i12 = a2.e;
                                z10 = z11;
                            }
                        } else {
                            i10 = 5000;
                            i11 = 0;
                            i12 = 100;
                        }
                        int i19 = i10;
                        int i20 = -1;
                        if (task.isSuccessful()) {
                            i14 = 0;
                        } else if (task.isCanceled()) {
                            i15 = -1;
                            i14 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof com.google.android.gms.common.api.f) {
                                Status status = ((com.google.android.gms.common.api.f) exception).getStatus();
                                i13 = status.a;
                                k6.a aVar = status.d;
                                if (aVar != null) {
                                    i14 = i13;
                                    i15 = aVar.b;
                                }
                            } else {
                                i13 = 101;
                            }
                            i14 = i13;
                            i15 = -1;
                        }
                        if (z10) {
                            long j12 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i20 = (int) (SystemClock.elapsedRealtime() - j12);
                            j10 = currentTimeMillis;
                            j3 = j11;
                        } else {
                            j3 = 0;
                            j10 = 0;
                        }
                        z0 z0Var = new z0(new n6.j(this.b, i14, i15, j3, j10, null, null, i16, i20), i11, i19, i12);
                        com.google.android.gms.internal.cast.a0 a0Var = hVar.x;
                        a0Var.sendMessage(a0Var.obtainMessage(18, z0Var));
                    }
                }
            }
        }
    }
}
