package lf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
