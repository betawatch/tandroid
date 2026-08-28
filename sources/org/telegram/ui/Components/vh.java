package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vh extends lg {
    public final /* synthetic */ ki h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(i9, context, b6Var, false);
        this.h0 = kiVar;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean e() {
        return !this.h0.Q0;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lg
    public final int getFillColor() {
        return this.h0.getThemedColor(org.telegram.ui.ActionBar.f6.S5);
    }
}
