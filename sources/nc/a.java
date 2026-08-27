package nc;

import java.util.regex.Pattern;
import je.p;
import je.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // nc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String n10 = com.google.android.recaptcha.internal.a.n(a2, 1, 1);
            je.k kVar = new je.k(1, s3.c.e("mailto:", n10), null);
            kVar.b(new s(n10));
            return kVar;
        }
        String a3 = a(f);
        if (a3 == null) {
            return null;
        }
        String n11 = com.google.android.recaptcha.internal.a.n(a3, 1, 1);
        je.k kVar2 = new je.k(1, n11, null);
        kVar2.b(new s(n11));
        return kVar2;
    }

    @Override // nc.h
    public final char d() {
        return '<';
    }
}
