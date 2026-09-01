package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s90 extends qc.h {
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
