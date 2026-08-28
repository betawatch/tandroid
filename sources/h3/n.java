package h3;

import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends v1 {
    public final int c;
    public final String d;
    public final int e;
    public final t0 f;
    public final int h;
    public final j4.b0 n;
    public final boolean r;

    static {
        int i9 = d5.f0.a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public n(int i9, Exception exc, int i10) {
        this(i9, exc, i10, null, -1, null, 4, false);
    }

    public final n a(j4.b0 b0Var) {
        String message = getMessage();
        int i9 = d5.f0.a;
        return new n(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.h, b0Var, this.b, this.r);
    }

    public n(String str, Throwable th, int i9, int i10, String str2, int i11, t0 t0Var, int i12, j4.b0 b0Var, long j10, boolean z10) {
        super(str, th, i9, j10);
        d5.a.f(!z10 || i10 == 1);
        d5.a.f(th != null || i10 == 3);
        this.c = i10;
        this.d = str2;
        this.e = i11;
        this.f = t0Var;
        this.h = i12;
        this.n = b0Var;
        this.r = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(int i9, Throwable th, int i10, String str, int i11, t0 t0Var, int i12, boolean z10) {
        this(TextUtils.isEmpty(null) ? r0 : ta.b.j(r0, ": null"), th, i10, i9, r5, r6, r7, i12, null, SystemClock.elapsedRealtime(), z10);
        String str2;
        int i13;
        t0 t0Var2;
        String str3;
        String str4;
        if (i9 == 0) {
            str2 = str;
            i13 = i11;
            t0Var2 = t0Var;
            str3 = "Source error";
        } else if (i9 != 1) {
            if (i9 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i13 = i11;
            t0Var2 = t0Var;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            t0Var2 = t0Var;
            sb2.append(t0Var2);
            sb2.append(", format_supported=");
            int i14 = d5.f0.a;
            if (i12 == 0) {
                str4 = "NO";
            } else if (i12 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i12 == 4) {
                str4 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str4);
            str3 = sb2.toString();
        }
    }
}
