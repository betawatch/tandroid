package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class p90 extends ed.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // ed.h
    public final bf.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        zc.d dVar = new zc.d();
        dVar.g = com.google.android.gms.internal.vision.e2.i(1, 1, a2);
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '$';
    }
}
