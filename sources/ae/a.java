package ae;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class a {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.i.d(forName, "forName(...)");
        a = forName;
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
