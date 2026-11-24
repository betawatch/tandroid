// default package

import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class av7 extends IOException {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public av7(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static av7 a(String str, Exception exc) {
        return new av7(str, exc, true, 1);
    }

    public static av7 b(String str, Exception exc) {
        return new av7(str, exc, true, 4);
    }

    public static av7 c(String str) {
        return new av7(str, null, true, 8);
    }

    public static av7 d(String str) {
        return new av7(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return de9.l(sb, this.b, "}");
    }
}
