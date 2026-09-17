package mf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
