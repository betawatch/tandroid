package jc;

import java.util.regex.Pattern;
import le.p;
import oc.h;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // oc.h
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        d dVar = new d();
        dVar.g = com.google.android.recaptcha.internal.a.m(a2, 2, 2);
        return dVar;
    }

    @Override // oc.h
    public final char d() {
        return '$';
    }
}
