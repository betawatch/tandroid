package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o80 extends ed.h {
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
