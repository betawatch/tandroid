// default package

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class jl1 {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        a = forName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
