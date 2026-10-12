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
import org.telegram.ui.Components.c91;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class b4 extends c91 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ i2[] f;

    public b4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.c6 c6Var, Rect rect, int i10, i2[] i2VarArr) {
        this.a = arrayList;
        this.b = context;
        this.c = c6Var;
        this.d = rect;
        this.e = i10;
        this.f = i2VarArr;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(z4.i0(this.b, this.e, (TL_wallet.walletTransaction) this.a.get(i10), null, null, null, null, this.c, this.f), w7.a6.d(-2.0f, -1));
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, this.c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return this.a.size();
    }
}
