package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b90 extends nc.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // nc.h
    public final je.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ic.d dVar = new ic.d();
        dVar.g = com.google.android.recaptcha.internal.a.n(a2, 1, 1);
        return dVar;
    }

    @Override // nc.h
    public final char d() {
        return '$';
    }
}
