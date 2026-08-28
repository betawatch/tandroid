package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class q implements x {
    private Context a;

    private q() {
        throw null;
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
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ q(p pVar) {
    }
}
