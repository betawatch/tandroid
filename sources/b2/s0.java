package b2;

import java.io.IOException;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        return a4.a.n(this.b, "}", sb2);
    }
}
