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
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class o5 extends y61 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ e3[] f;

    public o5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.i6 i6Var, Rect rect, int i7, e3[] e3VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = i6Var;
        this.d = rect;
        this.e = i7;
        this.f = e3VarArr;
    }

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(n6.u0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i7), null, null, null, null, this.c, this.f, true), c8.ma.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.n6.e0(L, 0, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.u6.j(frameLayout, insetDrawable, M, null, i6Var);
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        return this.a.size();
    }
}
