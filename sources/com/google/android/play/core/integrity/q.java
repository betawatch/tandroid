package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class q implements x {
    private Context a;

    private q() {
        throw null;
    }

    /* synthetic */ q(p pVar) {
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.ba.a(this.a, Context.class);
        return new s(this.a, null);
    }

    public final q a(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }
}
