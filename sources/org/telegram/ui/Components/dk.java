package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dk extends s4.c0 {
    public final /* synthetic */ ig.d0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(ig.d0 d0Var, Context context) {
        super(context);
        this.r = d0Var;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        return org.telegram.messenger.v0.z(56.0f, ((nk) this.r.V).r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
