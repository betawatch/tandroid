package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ka0 extends gd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // gd.h
    public final df.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        bd.d dVar = new bd.d();
        dVar.g = com.google.android.gms.internal.play_billing.k3.i(1, 1, a2);
        return dVar;
    }

    @Override // gd.h
    public final char d() {
        return '$';
    }
}
