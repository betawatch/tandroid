package ed;

import bf.p;
import bf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
import v7.j0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // ed.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String i10 = e2.i(1, 1, a2);
            bf.k kVar = new bf.k(1, j0.g("mailto:", i10), null);
            kVar.b(new s(i10));
            return kVar;
        }
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        String i11 = e2.i(1, 1, a10);
        bf.k kVar2 = new bf.k(1, i11, null);
        kVar2.b(new s(i11));
        return kVar2;
    }

    @Override // ed.h
    public final char d() {
        return '<';
    }
}
