package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i80 extends bd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // bd.h
    public final gf.p b() {
        String a10 = a(e);
        if (a10 == null) {
            return null;
        }
        wc.d dVar = new wc.d();
        dVar.g = com.google.android.recaptcha.internal.a.j(a10, 1, 1);
        return dVar;
    }

    @Override // bd.h
    public final char d() {
        return '$';
    }
}
