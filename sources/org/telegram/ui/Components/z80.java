package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z80 extends ed.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // ed.h
    public final kf.p b() {
        String a10 = a(e);
        if (a10 == null) {
            return null;
        }
        zc.d dVar = new zc.d();
        dVar.g = com.google.android.gms.internal.vision.e2.k(a10, 1, 1);
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '$';
    }
}
