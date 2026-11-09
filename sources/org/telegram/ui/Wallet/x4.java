package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class x4 extends n61 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ y2[] f;

    public x4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.g6 g6Var, Rect rect, int i7, y2[] y2VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = g6Var;
        this.d = rect;
        this.e = i7;
        this.f = y2VarArr;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(w5.t0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i7), null, null, null, null, this.c, this.f, true), c8.ha.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.l6.d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.l6.e0(L, 0, org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.s6.j(frameLayout, insetDrawable, M, null, g6Var);
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.a.size();
    }
}
