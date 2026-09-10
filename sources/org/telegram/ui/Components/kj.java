package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kj extends s4.d0 {
    public final /* synthetic */ ai.q r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(ai.q qVar, Context context) {
        super(context);
        this.r = qVar;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.a2.z(7.0f, ((mj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
