package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ca0 extends ed.h {
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
