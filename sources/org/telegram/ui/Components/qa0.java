package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qa0 extends fd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // fd.h
    public final cf.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ad.e eVar = new ad.e();
        eVar.g = com.google.android.gms.internal.vision.e2.i(1, 1, a2);
        return eVar;
    }

    @Override // fd.h
    public final char d() {
        return '$';
    }
}
