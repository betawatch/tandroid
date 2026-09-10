package i2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.ui.Cells.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n extends b2.u0 {
    public final u2.g0 E;
    public final boolean F;
    public final int s;
    public final String v;
    public final int w;
    public final b2.s x;
    public final int y;

    public n(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final n a(u2.g0 g0Var) {
        String message = getMessage();
        String str = e2.d0.a;
        return new n(message, getCause(), this.a, this.s, this.v, this.w, this.x, this.y, g0Var, this.b, this.F);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.s sVar, int i13, u2.g0 g0Var, long j3, boolean z10) {
        super(str, th2, i10, j3);
        Bundle bundle = Bundle.EMPTY;
        e2.d.b(!z10 || i11 == 1);
        e2.d.b(th2 != null || i11 == 3);
        this.s = i11;
        this.v = str2;
        this.w = i12;
        this.x = sVar;
        this.y = i13;
        this.E = g0Var;
        this.F = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(int i10, Throwable th2, int i11, String str, int i12, b2.s sVar, int i13, u2.g0 g0Var, boolean z10) {
        this(TextUtils.isEmpty(null) ? r0 : r6.t(r0, ": null"), th2, i11, i10, r5, r6, r7, i13, g0Var, SystemClock.elapsedRealtime(), z10);
        String str2;
        int i14;
        b2.s sVar2;
        String str3;
        String str4;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            sVar2 = sVar;
            str3 = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i14 = i12;
            sVar2 = sVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            sVar2 = sVar;
            sb2.append(sVar2);
            sb2.append(", format_supported=");
            String str5 = e2.d0.a;
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
