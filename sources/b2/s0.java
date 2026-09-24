package b2;

import java.io.IOException;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public class s0 extends IOException {
    public final boolean a;
    public final int b;

    public s0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.a = z10;
        this.b = i10;
    }

    public static s0 a(RuntimeException runtimeException, String str) {
        return new s0(str, runtimeException, true, 1);
    }

    public static s0 b(String str, Exception exc) {
        return new s0(str, exc, true, 4);
    }

    public static s0 c(String str) {
        return new s0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.a);
        sb2.append(", dataType=");
        return a4.a.o(this.b, "}", sb2);
    }
}
