package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class la0 extends hd.h {
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
