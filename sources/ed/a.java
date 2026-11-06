package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // ed.h
    public final p b() {
        String a10 = a(e);
        if (a10 != null) {
            String k10 = com.google.android.recaptcha.internal.a.k(a10, 1, 1);
            kf.k kVar = new kf.k(1, rf.b.i("mailto:", k10), null);
            kVar.b(new s(k10));
            return kVar;
        }
        String a11 = a(f);
        if (a11 == null) {
            return null;
        }
        String k11 = com.google.android.recaptcha.internal.a.k(a11, 1, 1);
        kf.k kVar2 = new kf.k(1, k11, null);
        kVar2.b(new s(k11));
        return kVar2;
    }

    @Override // ed.h
    public final char d() {
        return '<';
    }
}
