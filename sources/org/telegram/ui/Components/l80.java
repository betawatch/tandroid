package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l80 extends ed.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // ed.h
    public final kf.p b() {
        String a10 = a(e);
        if (a10 == null) {
            return null;
        }
        zc.d dVar = new zc.d();
        dVar.g = com.google.android.recaptcha.internal.a.k(a10, 1, 1);
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '$';
    }
}
