package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class k6 extends v7 {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(jv jvVar, Context context, a7 a7Var) {
        super(context, a7Var, null, null);
        this.G = jvVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        a7 a7Var = (a7) this.G;
        if (!z10) {
            kVar = ((org.telegram.ui.ActionBar.n2) a7Var).actionBar;
            kVar.r();
            return;
        }
        le.b bVar = a7Var.S;
        if (bVar != null) {
            bVar.a(true, true);
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) a7Var).actionBar;
        kVar2.M(null, null);
    }

    @Override // org.telegram.ui.v7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.F) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((jv) this.G).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(a7 a7Var, Context context, a7 a7Var2, li.m mVar, org.telegram.ui.Components.aw0 aw0Var) {
        super(context, a7Var2, mVar, aw0Var);
        this.G = a7Var;
    }
}
