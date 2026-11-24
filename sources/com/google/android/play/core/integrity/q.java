package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
