package b2;

import java.io.IOException;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class x0 extends IOException {
    public final boolean a;
    public final int b;

    public x0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.a = z10;
        this.b = i10;
    }

    public static x0 a(RuntimeException runtimeException, String str) {
        return new x0(str, runtimeException, true, 1);
    }

    public static x0 b(String str, Exception exc) {
        return new x0(str, exc, true, 4);
    }

    public static x0 c(String str) {
        return new x0(str, null, false, 1);
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
