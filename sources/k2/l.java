package k2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends d2.x0 {
    public final int E;
    public final w2.g0 F;
    public final boolean G;
    public final int s;
    public final String w;
    public final int x;
    public final d2.v y;

    public l(int i3, Exception exc, int i10) {
        this(i3, exc, i10, null, -1, null, 4, null, false);
    }

    public final l a(w2.g0 g0Var) {
        String message = getMessage();
        String str = g2.n0.a;
        return new l(message, getCause(), this.a, this.s, this.w, this.x, this.y, this.E, g0Var, this.b, this.G);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Throwable th2, int i3, int i10, String str2, int i11, d2.v vVar, int i12, w2.g0 g0Var, long j10, boolean z10) {
        super(str, th2, i3, j10);
        Bundle bundle = Bundle.EMPTY;
        zb.f(!z10 || i10 == 1);
        zb.f(th2 != null || i10 == 3);
        this.s = i10;
        this.w = str2;
        this.x = i11;
        this.y = vVar;
        this.E = i12;
        this.F = g0Var;
        this.G = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i3, Throwable th2, int i10, String str, int i11, d2.v vVar, int i12, w2.g0 g0Var, boolean z10) {
        this(TextUtils.isEmpty(null) ? r0 : t4.c.q(r0, ": null"), th2, i10, i3, r5, r6, r7, i12, g0Var, SystemClock.elapsedRealtime(), z10);
        String str2;
        int i13;
        d2.v vVar2;
        String str3;
        String str4;
        if (i3 == 0) {
            str2 = str;
            i13 = i11;
            vVar2 = vVar;
            str3 = "Source error";
        } else if (i3 != 1) {
            if (i3 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i13 = i11;
            vVar2 = vVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            vVar2 = vVar;
            sb2.append(vVar2);
            sb2.append(", format_supported=");
            String str5 = g2.n0.a;
            if (i12 == 0) {
                str4 = "NO";
            } else if (i12 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
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
