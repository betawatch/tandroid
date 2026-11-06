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
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class z4 extends m61 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ a3[] f;

    public z4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.f6 f6Var, Rect rect, int i7, a3[] a3VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = f6Var;
        this.d = rect;
        this.e = i7;
        this.f = a3VarArr;
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(y5.t0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i7), null, null, null, null, this.c, this.f, true), c8.ha.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, 0, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.r6.k(frameLayout, insetDrawable, N, null, f6Var);
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        return this.a.size();
    }
}
