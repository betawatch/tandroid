package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zk extends v4.c0 {
    public final /* synthetic */ kg.c0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(kg.c0 c0Var, Context context) {
        super(context);
        this.r = c0Var;
    }

    @Override // v4.c0
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        dl dlVar = (dl) this.r.V;
        return k10 - (dlVar.M.getPaddingTop() - (dlVar.r0 - dlVar.q0));
    }

    @Override // v4.c0
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
