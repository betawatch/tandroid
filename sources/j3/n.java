package j3;

import android.os.SystemClock;
import android.text.TextUtils;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n extends t1 {
    public final int c;
    public final String d;
    public final int e;
    public final n0 f;
    public final int h;
    public final o4.u n;
    public final boolean r;

    static {
        int i10 = h5.d0.a;
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

    public final n a(o4.u uVar) {
        String message = getMessage();
        int i10 = h5.d0.a;
        return new n(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.h, uVar, this.b, this.r);
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, n0 n0Var, int i13, o4.u uVar, long j10, boolean z4) {
        super(str, th2, i10, j10);
        h5.a.f(!z4 || i11 == 1);
        h5.a.f(th2 != null || i11 == 3);
        this.c = i11;
        this.d = str2;
        this.e = i12;
        this.f = n0Var;
        this.h = i13;
        this.n = uVar;
        this.r = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(int i10, Throwable th2, int i11, String str, int i12, n0 n0Var, int i13, boolean z4) {
        this(TextUtils.isEmpty(null) ? r0 : w2.k(r0, ": null"), th2, i11, i10, r5, r6, r7, i13, null, SystemClock.elapsedRealtime(), z4);
        String str2;
        int i14;
        n0 n0Var2;
        String str3;
        String str4;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            n0Var2 = n0Var;
            str3 = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i14 = i12;
            n0Var2 = n0Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i14 = i12;
            sb.append(i14);
            sb.append(", format=");
            n0Var2 = n0Var;
            sb.append(n0Var2);
            sb.append(", format_supported=");
            int i15 = h5.d0.a;
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
            sb.append(str4);
            str3 = sb.toString();
        }
    }
}
