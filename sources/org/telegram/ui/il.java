package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class il extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ ll f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(ll llVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.f = llVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        cn cnVar = this.f.Q;
        int i7 = cn.kd;
        return cnVar.m9();
    }
}
