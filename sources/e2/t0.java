package e2;

import java.io.IOException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class t0 extends IOException {
    public final boolean a;
    public final int b;

    public t0(String str, Throwable th2, boolean z9, int i7) {
        super(str, th2);
        this.a = z9;
        this.b = i7;
    }

    public static t0 a(RuntimeException runtimeException, String str) {
        return new t0(str, runtimeException, true, 1);
    }

    public static t0 b(String str, Exception exc) {
        return new t0(str, exc, true, 4);
    }

    public static t0 c(String str) {
        return new t0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.a);
        sb2.append(", dataType=");
        return a8.p0.n(this.b, "}", sb2);
    }
}
