// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class bx7 extends IOException {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public bx7(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static bx7 a(String str, Exception exc) {
        return new bx7(str, exc, true, 1);
    }

    public static bx7 b(String str, Exception exc) {
        return new bx7(str, exc, true, 4);
    }

    public static bx7 c(String str) {
        return new bx7(str, null, true, 8);
    }

    public static bx7 d(String str) {
        return new bx7(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return hg9.k(sb, this.b, "}");
    }
}
