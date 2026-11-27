package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        grb.i(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private u() {
        throw null;
    }
}
