package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ka0 extends gd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // gd.h
    public final df.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        bd.d dVar = new bd.d();
        dVar.g = com.google.android.gms.internal.play_billing.k3.i(1, 1, a2);
        return dVar;
    }

    @Override // gd.h
    public final char d() {
        return '$';
    }
}
