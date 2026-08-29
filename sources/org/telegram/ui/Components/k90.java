package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k90 extends oc.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // oc.h
    public final le.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        jc.d dVar = new jc.d();
        dVar.g = com.google.android.recaptcha.internal.a.m(a2, 1, 1);
        return dVar;
    }

    @Override // oc.h
    public final char d() {
        return '$';
    }
}
