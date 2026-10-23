package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n4 extends d91 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ j2[] f;

    public n4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.g6 g6Var, Rect rect, int i10, j2[] j2VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = g6Var;
        this.d = rect;
        this.e = i10;
        this.f = j2VarArr;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(o5.o0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i10), null, null, null, null, this.c, this.f, true), w7.z5.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(dp, 0, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.r6.k(frameLayout, insetDrawable, O, null, g6Var);
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.a.size();
    }
}
