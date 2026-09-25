package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class z90 extends ed.h {
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
