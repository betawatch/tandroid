package l2;

import a8.ia;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class l extends e2.v0 {
    public final int D;
    public final x2.g0 E;
    public final boolean F;
    public final int s;
    public final String w;
    public final int x;
    public final e2.u y;

    public l(int i7, Exception exc, int i10) {
        this(i7, exc, i10, null, -1, null, 4, null, false);
    }

    public final l a(x2.g0 g0Var) {
        String message = getMessage();
        String str = h2.m0.a;
        return new l(message, getCause(), this.a, this.s, this.w, this.x, this.y, this.D, g0Var, this.b, this.F);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Throwable th2, int i7, int i10, String str2, int i11, e2.u uVar, int i12, x2.g0 g0Var, long j3, boolean z9) {
        super(str, th2, i7, j3);
        Bundle bundle = Bundle.EMPTY;
        ia.f(!z9 || i10 == 1);
        ia.f(th2 != null || i10 == 3);
        this.s = i10;
        this.w = str2;
        this.x = i11;
        this.y = uVar;
        this.D = i12;
        this.E = g0Var;
        this.F = z9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i7, Throwable th2, int i10, String str, int i11, e2.u uVar, int i12, x2.g0 g0Var, boolean z9) {
        this(TextUtils.isEmpty(null) ? r0 : rf.b.q(r0, ": null"), th2, i10, i7, r5, r6, r7, i12, g0Var, SystemClock.elapsedRealtime(), z9);
        String str2;
        int i13;
        e2.u uVar2;
        String str3;
        String str4;
        if (i7 == 0) {
            str2 = str;
            i13 = i11;
            uVar2 = uVar;
            str3 = "Source error";
        } else if (i7 != 1) {
            if (i7 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i13 = i11;
            uVar2 = uVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            uVar2 = uVar;
            sb2.append(uVar2);
            sb2.append(", format_supported=");
            String str5 = h2.m0.a;
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
