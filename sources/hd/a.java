package hd;

import c3.h0;
import ef.p;
import ef.s;
import java.util.regex.Pattern;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override // hd.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String l4 = h0.l(1, 1, a2);
            ef.k kVar = new ef.k(1, b10.j("mailto:", l4), null);
            kVar.b(new s(l4));
            return kVar;
        }
        String a10 = a(f);
        if (a10 == null) {
            return null;
        }
        String l10 = h0.l(1, 1, a10);
        ef.k kVar2 = new ef.k(1, l10, null);
        kVar2.b(new s(l10));
        return kVar2;
    }

    @Override // hd.h
    public final char d() {
        return '<';
    }
}
