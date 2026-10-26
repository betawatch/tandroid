package b2;

import java.io.IOException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
