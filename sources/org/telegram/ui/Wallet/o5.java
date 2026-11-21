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
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class o5 extends b71 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ e3[] f;

    public o5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.h6 h6Var, Rect rect, int i7, e3[] e3VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = h6Var;
        this.d = rect;
        this.e = i7;
        this.f = e3VarArr;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(n6.u0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i7), null, null, null, null, this.c, this.f, true), c8.ma.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.m6.d6;
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.m6.e0(L, 0, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.t6.j(frameLayout, insetDrawable, M, null, h6Var);
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        return this.a.size();
    }
}
