package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x80 extends mc.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // mc.h
    public final ie.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        hc.d dVar = new hc.d();
        dVar.g = e2.c.m(a2, 1, 1);
        return dVar;
    }

    @Override // mc.h
    public final char d() {
        return '$';
    }
}
