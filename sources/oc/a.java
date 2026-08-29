package oc;

import java.util.regex.Pattern;
import le.p;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // oc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String m10 = com.google.android.recaptcha.internal.a.m(a2, 1, 1);
            le.k kVar = new le.k(1, u3.c.e("mailto:", m10), null);
            kVar.b(new s(m10));
            return kVar;
        }
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        String m11 = com.google.android.recaptcha.internal.a.m(a10, 1, 1);
        le.k kVar2 = new le.k(1, m11, null);
        kVar2.b(new s(m11));
        return kVar2;
    }

    @Override // oc.h
    public final char d() {
        return '<';
    }
}
