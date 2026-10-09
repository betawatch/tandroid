package fd;

import cf.p;
import cf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
import sc.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // fd.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String i10 = e2.i(1, 1, a2);
            cf.k kVar = new cf.k(1, v.i("mailto:", i10), null);
            kVar.b(new s(i10));
            return kVar;
        }
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        String i11 = e2.i(1, 1, a10);
        cf.k kVar2 = new cf.k(1, i11, null);
        kVar2.b(new s(i11));
        return kVar2;
    }

    @Override // fd.h
    public final char d() {
        return '<';
    }
}
