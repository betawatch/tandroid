package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yv extends zk0 {
    public boolean T2;
    public boolean U2;
    public final /* synthetic */ yy V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(yy yyVar, Context context) {
        super(context, null);
        this.V2 = yyVar;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
        yy yyVar = this.V2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, yyVar.d0, yyVar.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yy yyVar = this.V2;
        if (yyVar.m0 && yyVar.j0.C > 1) {
            this.T2 = true;
            yyVar.e0.h1(0, 0);
            yyVar.k0.setVisibility(0);
            yyVar.l0.k(0, 0);
            yyVar.m0 = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yy.f(yyVar, true);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.U2) {
            return;
        }
        this.V2.j0.l();
        this.U2 = true;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
