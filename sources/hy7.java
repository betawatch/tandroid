// default package

import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class hy7 extends IOException {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public hy7(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static hy7 a(String str, Exception exc) {
        return new hy7(str, exc, true, 1);
    }

    public static hy7 b(String str, Exception exc) {
        return new hy7(str, exc, true, 4);
    }

    public static hy7 c(String str) {
        return new hy7(str, null, true, 8);
    }

    public static hy7 d(String str) {
        return new hy7(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return uh9.l(sb, this.b, "}");
    }
}
