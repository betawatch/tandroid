package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i6 extends s7 {
    public final /* synthetic */ int H = 1;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(au auVar, Context context, x6 x6Var) {
        super(context, x6Var, null, null);
        this.I = auVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.a5 a5Var2;
        x6 x6Var = (x6) this.I;
        if (!z10) {
            a5Var = ((org.telegram.ui.ActionBar.h2) x6Var).simpleActionBar;
            a5Var.w();
            return;
        }
        te.a aVar = x6Var.T;
        if (aVar != null) {
            aVar.a(true, true);
        }
        a5Var2 = ((org.telegram.ui.ActionBar.h2) x6Var).simpleActionBar;
        a5Var2.J();
    }

    @Override // org.telegram.ui.s7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((((au) this.I).r1 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(x6 x6Var, Context context, x6 x6Var2, ri.q qVar, org.telegram.ui.Components.qt0 qt0Var) {
        super(context, x6Var2, qVar, qt0Var);
        this.I = x6Var;
    }
}
