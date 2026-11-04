package d2;

import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class v0 extends IOException {
    public final boolean a;
    public final int b;

    public v0(String str, Throwable th2, boolean z10, int i3) {
        super(str, th2);
        this.a = z10;
        this.b = i3;
    }

    public static v0 a(RuntimeException runtimeException, String str) {
        return new v0(str, runtimeException, true, 1);
    }

    public static v0 b(String str, Exception exc) {
        return new v0(str, exc, true, 4);
    }

    public static v0 c(String str) {
        return new v0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.a);
        sb2.append(", dataType=");
        return a1.g.o(this.b, "}", sb2);
    }
}
