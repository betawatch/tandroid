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
import org.telegram.ui.Components.o71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a5 extends o71 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ z2[] f;

    public a5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.p6 p6Var, Rect rect, int i10, z2[] z2VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = p6Var;
        this.d = rect;
        this.e = i10;
        this.f = z2VarArr;
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(b6.s0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i10), null, null, null, null, this.c, this.f, true), w7.b6.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.o71
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = org.telegram.messenger.i0.L(20.0f);
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.t6.e0(L, 0, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.a7.k(frameLayout, insetDrawable, N, null, p6Var);
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.o71
    public final int e() {
        return this.a.size();
    }
}
