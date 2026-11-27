// default package

import java.nio.charset.Charset;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
