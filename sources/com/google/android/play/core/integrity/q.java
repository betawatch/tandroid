package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class q implements x {
    private Context a;

    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        Context context = this.a;
        if (context != null) {
            return new s(context, null);
        }
        sc8.j(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private q() {
        throw null;
    }
}
