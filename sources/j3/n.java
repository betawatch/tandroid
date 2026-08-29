package j3;

import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends v1 {
    public final int c;
    public final String d;
    public final int e;
    public final t0 f;
    public final int h;
    public final l4.a0 n;
    public final boolean r;

    static {
        int i10 = f5.d0.a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public n(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    public final n a(l4.a0 a0Var) {
        String message = getMessage();
        int i10 = f5.d0.a;
        return new n(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.h, a0Var, this.b, this.r);
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, t0 t0Var, int i13, l4.a0 a0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        f5.a.f(!z10 || i11 == 1);
        f5.a.f(th2 != null || i11 == 3);
        this.c = i11;
        this.d = str2;
        this.e = i12;
        this.f = t0Var;
        this.h = i13;
        this.n = a0Var;
        this.r = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(int i10, Throwable th2, int i11, String str, int i12, t0 t0Var, int i13, boolean z10) {
        this(TextUtils.isEmpty(null) ? r0 : u3.c.k(r0, ": null"), th2, i11, i10, r5, r6, r7, i13, null, SystemClock.elapsedRealtime(), z10);
        String str2;
        int i14;
        t0 t0Var2;
        String str3;
        String str4;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            t0Var2 = t0Var;
            str3 = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i14 = i12;
            t0Var2 = t0Var;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            t0Var2 = t0Var;
            sb2.append(t0Var2);
            sb2.append(", format_supported=");
            int i15 = f5.d0.a;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i13 == 4) {
                str4 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str4);
            str3 = sb2.toString();
        }
    }
}
