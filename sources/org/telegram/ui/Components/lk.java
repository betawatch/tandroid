package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lk extends f2.l0 {
    public final /* synthetic */ zi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(zi ziVar, Context context) {
        super(context);
        this.r = ziVar;
    }

    @Override // f2.l0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        tk tkVar = (tk) this.r.V;
        return k10 - (tkVar.L.getPaddingTop() - (tkVar.w0 - tkVar.v0));
    }

    @Override // f2.l0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
