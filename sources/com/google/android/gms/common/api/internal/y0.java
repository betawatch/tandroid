package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y0 implements OnCompleteListener {
    public final h a;
    public final int b;
    public final b c;
    public final long d;
    public final long e;

    public y0(h hVar, int i9, b bVar, long j10, long j11) {
        this.a = hVar;
        this.b = i9;
        this.c = bVar;
        this.d = j10;
        this.e = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x5.e a(p0 p0Var, x5.g gVar, int i9) {
        x5.f0 f0Var = gVar.M;
        x5.e eVar = f0Var == null ? null : f0Var.d;
        if (eVar != null && eVar.b) {
            int[] iArr = eVar.d;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = eVar.f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i9) {
                            break;
                        }
                        i10++;
                    }
                }
                if (p0Var.n >= eVar.e) {
                    return eVar;
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i9) {
                        i10++;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        int i14;
        long j12 = this.d;
        h hVar = this.a;
        if (hVar.b()) {
            x5.n nVar = (x5.n) x5.m.a().a;
            if (nVar == null || nVar.b) {
                p0 p0Var = (p0) hVar.s.get(this.c);
                if (p0Var != null) {
                    com.google.android.gms.common.api.c cVar = p0Var.b;
                    if (cVar instanceof x5.g) {
                        x5.g gVar = (x5.g) cVar;
                        boolean z10 = j12 > 0;
                        int i15 = gVar.H;
                        if (nVar != null) {
                            z10 &= nVar.c;
                            int i16 = nVar.d;
                            int i17 = nVar.e;
                            int i18 = nVar.a;
                            if (gVar.M == null || gVar.f()) {
                                i10 = i18;
                                i11 = i17;
                            } else {
                                x5.e a2 = a(p0Var, gVar, this.b);
                                if (a2 == null) {
                                    return;
                                }
                                boolean z11 = a2.c && j12 > 0;
                                i10 = i18;
                                i11 = a2.e;
                                z10 = z11;
                            }
                            i9 = i16;
                        } else {
                            i9 = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        if (task.isSuccessful()) {
                            i12 = 0;
                            i13 = 0;
                        } else {
                            if (task.isCanceled()) {
                                i12 = 100;
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof com.google.android.gms.common.api.f) {
                                    Status status = ((com.google.android.gms.common.api.f) exception).getStatus();
                                    int i19 = status.a;
                                    u5.a aVar = status.d;
                                    if (aVar == null) {
                                        i12 = i19;
                                    } else {
                                        i13 = aVar.b;
                                        i12 = i19;
                                    }
                                } else {
                                    i12 = 101;
                                }
                            }
                            i13 = -1;
                        }
                        if (z10) {
                            long j13 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            j10 = j12;
                            i14 = (int) (SystemClock.elapsedRealtime() - j13);
                            j11 = currentTimeMillis;
                        } else {
                            j10 = 0;
                            j11 = 0;
                            i14 = -1;
                        }
                        z0 z0Var = new z0(new x5.j(this.b, i12, i13, j10, j11, null, null, i15, i14), i10, i9, i11);
                        c2.u0 u0Var = hVar.x;
                        u0Var.sendMessage(u0Var.obtainMessage(18, z0Var));
                    }
                }
            }
        }
    }
}
