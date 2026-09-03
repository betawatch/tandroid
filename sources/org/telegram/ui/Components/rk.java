package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rk extends f2.j0 {
    public final /* synthetic */ ej r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(ej ejVar, Context context) {
        super(context);
        this.r = ejVar;
    }

    @Override // f2.j0
    public final int k(int i10, View view) {
        int k10 = super.k(i10, view);
        al alVar = (al) this.r.V;
        return k10 - (alVar.M.getPaddingTop() - (alVar.x0 - alVar.w0));
    }

    @Override // f2.j0
    public final int m(int i10) {
        return super.m(i10) * 4;
    }
}
