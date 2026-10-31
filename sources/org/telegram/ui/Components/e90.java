package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e90 extends yc.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // yc.h
    public final df.c b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        tc.d dVar = new tc.d();
        dVar.g = c3.i0.m(1, 1, a2);
        return dVar;
    }

    @Override // yc.h
    public final char d() {
        return '$';
    }
}
