package j3;

import java.io.IOException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class r1 extends IOException {
    public final boolean a;
    public final int b;

    public r1(String str, Throwable th2, boolean z4, int i10) {
        super(str, th2);
        this.a = z4;
        this.b = i10;
    }

    public static r1 a(String str, Exception exc) {
        return new r1(str, exc, true, 1);
    }

    public static r1 b(String str, Exception exc) {
        return new r1(str, exc, true, 4);
    }

    public static r1 c(String str) {
        return new r1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return android.support.v4.media.a.m(this.b, "}", sb);
    }
}
