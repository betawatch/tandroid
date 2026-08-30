package jd;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class a {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.j.d(forName, "forName(...)");
        a = forName;
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
