// default package

import java.nio.charset.Charset;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum bh5 {
    c(Charset.forName("ISO-8859-1"), 1),
    d(Charset.forName("UTF-16"), 2),
    e(Charset.forName("UTF-16BE"), 2),
    f(Charset.forName("UTF-8"), 1);

    public final Charset a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    bh5(Charset charset, int i) {
        this.a = charset;
        this.b = i;
    }
}
