package b2;

import java.io.IOException;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class w0 extends IOException {
    public final boolean a;
    public final int b;

    public w0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.a = z10;
        this.b = i10;
    }

    public static w0 a(RuntimeException runtimeException, String str) {
        return new w0(str, runtimeException, true, 1);
    }

    public static w0 b(String str, Exception exc) {
        return new w0(str, exc, true, 4);
    }

    public static w0 c(String str) {
        return new w0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.a);
        sb2.append(", dataType=");
        return a1.g.n(this.b, "}", sb2);
    }
}
