package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r90 extends qc.h {
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
