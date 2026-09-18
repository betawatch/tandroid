package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nj extends s4.d0 {
    public final /* synthetic */ hg.e0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(hg.e0 e0Var, Context context) {
        super(context);
        this.r = e0Var;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.w1.z(8.0f, ((yj) this.r.V).s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
