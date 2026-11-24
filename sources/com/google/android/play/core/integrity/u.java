package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
