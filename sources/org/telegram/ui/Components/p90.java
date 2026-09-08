package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
