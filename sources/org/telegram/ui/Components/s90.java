package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
