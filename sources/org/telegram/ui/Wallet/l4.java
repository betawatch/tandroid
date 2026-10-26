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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.m91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l4 extends m91 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ j2[] f;

    public l4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.u6 u6Var, Rect rect, int i10, j2[] j2VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = u6Var;
        this.d = rect;
        this.e = i10;
        this.f = j2VarArr;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(m5.p0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i10), null, null, null, null, this.c, this.f, true), gb1.g(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.y6.d0(dp, 0, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.f7.k(frameLayout, insetDrawable, N, null, u6Var);
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.a.size();
    }
}
