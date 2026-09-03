package j3;

import java.io.IOException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
