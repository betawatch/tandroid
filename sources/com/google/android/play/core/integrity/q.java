package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        grb.i(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private q() {
        throw null;
    }
}
