package gd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import df.s;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // gd.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String j10 = k3.j(1, 1, a2);
            df.k kVar = new df.k(1, r4.c.h("mailto:", j10), null);
            kVar.b(new s(j10));
            return kVar;
        }
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        String j11 = k3.j(1, 1, a10);
        df.k kVar2 = new df.k(1, j11, null);
        kVar2.b(new s(j11));
        return kVar2;
    }

    @Override // gd.h
    public final char d() {
        return '<';
    }
}
