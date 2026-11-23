package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y80 extends ed.h {
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
