// default package

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a2d implements OnCompleteListener {
    public final hy4 a;
    public final char b;
    public final go c;
    public final long d;
    public final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public a2d(hy4 hy4Var, int i, go goVar, long j, long j2) {
        this.a = hy4Var;
        this.b = i;
        this.c = goVar;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fs2 a(u1d u1dVar, gg0 gg0Var, int i) {
        xme xmeVar = gg0Var.B;
        fs2 fs2Var = xmeVar == null ? null : xmeVar.d;
        if (fs2Var != null && fs2Var.b) {
            int[] iArr = fs2Var.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = fs2Var.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] == i) {
                            break;
                        }
                        i2++;
                    }
                }
                if (u1dVar.n >= fs2Var.e) {
                    return fs2Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (u1dVar.n >= fs2Var.e) {
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
        hy4 hy4Var = this.a;
        if (hy4Var.f()) {
            mj9 mj9Var = (mj9) lj9.z().b;
            if (mj9Var == null || mj9Var.b) {
                u1d u1dVar = (u1d) hy4Var.s.get(this.c);
                if (u1dVar != null) {
                    xx4 xx4Var = u1dVar.b;
                    if (xx4Var instanceof gg0) {
                        xx4 xx4Var2 = xx4Var;
                        long j3 = this.d;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        short s = xx4Var2.v;
                        if (mj9Var != null) {
                            z &= mj9Var.c;
                            i = mj9Var.d;
                            i3 = mj9Var.e;
                            i2 = mj9Var.a;
                            if (xx4Var2.B != null && !xx4Var2.r()) {
                                fs2 a = a(u1dVar, xx4Var2, this.b);
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
                            if (exception instanceof zn) {
                                Status status = ((zn) exception).getStatus();
                                i4 = status.a;
                                ds2 ds2Var = status.d;
                                if (ds2Var != null) {
                                    i5 = i4;
                                    i6 = ds2Var.b;
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
                        b2d b2dVar = new b2d(new sd7(this.b, i5, i6, j, j2, null, null, s, i8), i2, i7, i3);
                        o59 o59Var = hy4Var.y;
                        o59Var.sendMessage(o59Var.obtainMessage(18, b2dVar));
                    }
                }
            }
        }
    }
}
