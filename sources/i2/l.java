package i2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l extends b2.y0 {
    public final int D;
    public final u2.g0 E;
    public final boolean F;
    public final int s;
    public final String w;
    public final int x;
    public final b2.x y;

    public l(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final l a(u2.g0 g0Var) {
        String message = getMessage();
        String str = e2.l0.a;
        return new l(message, getCause(), this.a, this.s, this.w, this.x, this.y, this.D, g0Var, this.b, this.F);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.x xVar, int i13, u2.g0 g0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        Bundle bundle = Bundle.EMPTY;
        t6.f(!z10 || i11 == 1);
        t6.f(th2 != null || i11 == 3);
        this.s = i11;
        this.w = str2;
        this.x = i12;
        this.y = xVar;
        this.D = i13;
        this.E = g0Var;
        this.F = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i10, Throwable th2, int i11, String str, int i12, b2.x xVar, int i13, u2.g0 g0Var, boolean z10) {
        this(TextUtils.isEmpty(null) ? r0 : sc.e.A(r0, ": null"), th2, i11, i10, r5, r6, r7, i13, g0Var, SystemClock.elapsedRealtime(), z10);
        String str2;
        int i14;
        b2.x xVar2;
        String str3;
        String str4;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            xVar2 = xVar;
            str3 = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i14 = i12;
            xVar2 = xVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            xVar2 = xVar;
            sb2.append(xVar2);
            sb2.append(", format_supported=");
            String str5 = e2.l0.a;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
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
