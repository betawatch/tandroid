package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class u implements av {
    private Context a;

    private u() {
        throw null;
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
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ u(t tVar) {
    }
}
