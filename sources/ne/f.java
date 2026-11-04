package ne;

import b8.id;
import b8.jd;
import e0.e0;
import v7.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class f {
    public static final g a = new g();

    public static final je.d a(je.d dVar, s module) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(module, "module");
        if (!kotlin.jvm.internal.j.a(dVar.e(), je.e.b)) {
            return dVar.isInline() ? a(dVar.i(0), module) : dVar;
        }
        id.a(dVar);
        return dVar;
    }

    public static final byte b(char c2) {
        if (c2 < '~') {
            return c.b[c2];
        }
        return (byte) 0;
    }

    public static final void c(e0 e0Var, String str) {
        e0Var.m(e0Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence d(int i3, CharSequence charSequence) {
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i3 != -1) {
                int i10 = i3 - 30;
                int i11 = i3 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                l10.append(charSequence.subSequence(i10, i11).toString());
                l10.append(str2);
                return l10.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void e(je.d dVar, me.b json) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(json, "json");
        if (kotlin.jvm.internal.j.a(dVar.e(), je.f.b)) {
            json.a.getClass();
        }
    }

    public static final j f(je.d desc, me.b bVar) {
        kotlin.jvm.internal.j.e(desc, "desc");
        jd e10 = desc.e();
        if (e10 instanceof je.a) {
            return j.f;
        }
        if (kotlin.jvm.internal.j.a(e10, je.f.c)) {
            return j.d;
        }
        if (!kotlin.jvm.internal.j.a(e10, je.f.d)) {
            return j.c;
        }
        je.d a10 = a(desc.i(0), bVar.b);
        jd e11 = a10.e();
        if ((e11 instanceof je.c) || kotlin.jvm.internal.j.a(e11, je.e.c)) {
            return j.e;
        }
        bVar.a.getClass();
        throw new d("Value of type '" + a10.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a10.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
