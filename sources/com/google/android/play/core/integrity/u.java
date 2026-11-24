package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class u implements av {
    private Context a;

    public /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        Context context = this.a;
        if (context != null) {
            return new w(context, null);
        }
        sc8.j(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private u() {
        throw null;
    }
}
