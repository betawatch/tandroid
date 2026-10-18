package org.telegram.ui.Components;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ja0 extends gd.h {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // gd.h
    public final df.p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        bd.d dVar = new bd.d();
        dVar.g = com.google.android.gms.internal.play_billing.k3.j(1, 1, a2);
        return dVar;
    }

    @Override // gd.h
    public final char d() {
        return '$';
    }
}
