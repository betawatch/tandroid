package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q90 extends qc.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // qc.h
    public final ne.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        lc.d dVar = new lc.d();
        dVar.g = e2.c.j(a2, 1, 1);
        return dVar;
    }

    @Override // qc.h
    public final char d() {
        return '$';
    }
}
