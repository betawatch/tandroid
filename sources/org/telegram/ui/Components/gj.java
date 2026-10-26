package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gj extends s4.d0 {
    public final /* synthetic */ ei.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(ei.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.t.B(7.0f, ((ij) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
