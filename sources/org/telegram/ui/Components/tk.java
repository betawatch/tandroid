package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tk extends f2.k0 {
    public final /* synthetic */ gj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(gj gjVar, Context context) {
        super(context);
        this.r = gjVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        int k9 = super.k(i10, view);
        bl blVar = (bl) this.r.V;
        return k9 - (blVar.L.getPaddingTop() - (blVar.w0 - blVar.v0));
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
