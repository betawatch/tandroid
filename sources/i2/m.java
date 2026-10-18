package i2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class m extends b2.y0 {
    public final u2.f0 E;
    public final boolean F;
    public final int s;
    public final String v;
    public final int w;
    public final b2.w x;
    public final int y;

    public m(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final m a(u2.f0 f0Var) {
        String message = getMessage();
        String str = e2.m0.a;
        return new m(message, getCause(), this.a, this.s, this.v, this.w, this.x, this.y, f0Var, this.b, this.F);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.w wVar, int i13, u2.f0 f0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        Bundle bundle = Bundle.EMPTY;
        u6.g(!z10 || i11 == 1);
        u6.g(th2 != null || i11 == 3);
        this.s = i11;
        this.v = str2;
        this.w = i12;
        this.x = wVar;
        this.y = i13;
        this.E = f0Var;
        this.F = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(int i10, Throwable th2, int i11, String str, int i12, b2.w wVar, int i13, u2.f0 f0Var, boolean z10) {
        this(TextUtils.isEmpty(null) ? r0 : r4.c.u(r0, ": null"), th2, i11, i10, r5, r6, r7, i13, f0Var, SystemClock.elapsedRealtime(), z10);
        String str2;
        int i14;
        b2.w wVar2;
        String str3;
        String str4;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            wVar2 = wVar;
            str3 = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i14 = i12;
            wVar2 = wVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            wVar2 = wVar;
            sb2.append(wVar2);
            sb2.append(", format_supported=");
            String str5 = e2.m0.a;
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
