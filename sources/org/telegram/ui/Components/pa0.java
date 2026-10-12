package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pa0 extends gd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // gd.h
    public final df.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        bd.d dVar = new bd.d();
        dVar.g = com.google.android.gms.internal.play_billing.k3.j(1, 1, a2);
        return dVar;
    }

    @Override // gd.h
    public final char d() {
        return '$';
    }
}
