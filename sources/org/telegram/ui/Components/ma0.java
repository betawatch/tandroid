package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ma0 extends hd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // hd.h
    public final ef.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        cd.d dVar = new cd.d();
        dVar.g = c3.h0.l(1, 1, a2);
        return dVar;
    }

    @Override // hd.h
    public final char d() {
        return '$';
    }
}
