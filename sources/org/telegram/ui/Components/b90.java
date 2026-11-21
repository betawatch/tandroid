package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b90 extends ed.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // ed.h
    public final kf.p b() {
        String a10 = a(e);
        if (a10 == null) {
            return null;
        }
        zc.d dVar = new zc.d();
        dVar.g = com.google.android.gms.internal.vision.e2.k(a10, 1, 1);
        return dVar;
    }

    @Override // ed.h
    public final char d() {
        return '$';
    }
}
