package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yi extends f2.k0 {
    public final /* synthetic */ zi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(zi ziVar, Context context) {
        super(context);
        this.r = ziVar;
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        return org.telegram.messenger.y3.z(7.0f, ((bj) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
