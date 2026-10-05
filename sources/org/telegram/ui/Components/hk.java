package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hk extends s4.d0 {
    public final /* synthetic */ hg.f0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(hg.f0 f0Var, Context context) {
        super(context);
        this.r = f0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(56.0f, ((rk) this.r.V).r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
