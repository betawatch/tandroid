package nf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public enum b {
    c(Charset.forName("ISO-8859-1"), 1),
    d(Charset.forName("UTF-16"), 2),
    e(Charset.forName("UTF-16BE"), 2),
    f(Charset.forName("UTF-8"), 1);

    public final Charset a;
    public final int b;

    b(Charset charset, int i10) {
        this.a = charset;
        this.b = i10;
    }
}
