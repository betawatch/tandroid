// default package

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c4d implements OnCompleteListener {
    public final i05 a;
    public final char b;
    public final gp c;
    public final long d;
    public final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public c4d(i05 i05Var, int i, gp gpVar, long j, long j2) {
        this.a = i05Var;
        this.b = i;
        this.c = gpVar;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qt2 a(w3d w3dVar, hh0 hh0Var, int i) {
        ape apeVar = hh0Var.B;
        qt2 qt2Var = apeVar == null ? null : apeVar.d;
        if (qt2Var != null && qt2Var.b) {
            int[] iArr = qt2Var.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = qt2Var.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] == i) {
                            break;
                        }
                        i2++;
                    }
                }
                if (w3dVar.n >= qt2Var.e) {
                    return qt2Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (w3dVar.n >= qt2Var.e) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        i05 i05Var = this.a;
        if (i05Var.f()) {
            ol9 ol9Var = (ol9) nl9.C0().b;
            if (ol9Var == null || ol9Var.b) {
                w3d w3dVar = (w3d) i05Var.s.get(this.c);
                if (w3dVar != null) {
                    zz4 zz4Var = w3dVar.b;
                    if (zz4Var instanceof hh0) {
                        zz4 zz4Var2 = zz4Var;
                        long j3 = this.d;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        short s = zz4Var2.v;
                        if (ol9Var != null) {
                            z &= ol9Var.c;
                            i = ol9Var.d;
                            i3 = ol9Var.e;
                            i2 = ol9Var.a;
                            if (zz4Var2.B != null && !zz4Var2.r()) {
                                qt2 a = a(w3dVar, zz4Var2, this.b);
                                if (a == null) {
                                    return;
                                }
                                boolean z2 = a.c && j3 > 0;
                                i3 = a.e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        int i8 = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ap) {
                                Status status = ((ap) exception).getStatus();
                                i4 = status.a;
                                ot2 ot2Var = status.d;
                                if (ot2Var != null) {
                                    i5 = i4;
                                    i6 = ot2Var.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        d4d d4dVar = new d4d(new uf7(this.b, i5, i6, j, j2, null, null, s, i8), i2, i7, i3);
                        q79 q79Var = i05Var.y;
                        q79Var.sendMessage(q79Var.obtainMessage(18, d4dVar));
                    }
                }
            }
        }
    }
}
