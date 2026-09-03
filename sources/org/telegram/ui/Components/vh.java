package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vh extends lg {
    public final /* synthetic */ li i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(i10, context, f6Var, false);
        this.i0 = liVar;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean e() {
        return !this.i0.R0;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lg
    public final int getFillColor() {
        return this.i0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
