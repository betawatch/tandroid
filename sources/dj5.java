// default package

import java.nio.charset.Charset;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum dj5 {
    c(Charset.forName("ISO-8859-1"), 1),
    d(Charset.forName("UTF-16"), 2),
    e(Charset.forName("UTF-16BE"), 2),
    f(Charset.forName("UTF-8"), 1);

    public final Charset a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    dj5(Charset charset, int i) {
        this.a = charset;
        this.b = i;
    }
}
