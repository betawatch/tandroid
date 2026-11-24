// default package

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iq1 extends qt7 {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ k47 g;
    public final /* synthetic */ p19 h;
    public final /* synthetic */ k47 i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ ggc l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ yv1 p;

    public iq1(yv1 yv1Var, int i, SparseArray sparseArray, boolean z, List list, k47 k47Var, p19 p19Var, k47 k47Var2, SparseIntArray sparseIntArray, int i2, ggc ggcVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i3) {
        this.p = yv1Var;
        this.c = i;
        this.d = sparseArray;
        this.e = z;
        this.f = list;
        this.g = k47Var;
        this.h = p19Var;
        this.i = k47Var2;
        this.j = sparseIntArray;
        this.k = i2;
        this.l = ggcVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i3;
    }

    @Override // qt7
    public final void a(ggc ggcVar, Object obj) {
        ggcVar.removeView((View) obj);
    }

    @Override // qt7
    public final int b() {
        return this.c;
    }

    @Override // qt7
    public final Object e(ggc ggcVar, int i) {
        int i2;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            ggcVar.addView(view);
            return view;
        }
        int i3 = this.e ? i - 1 : i;
        TLRPC.ReactionCount reactionCount = i3 >= 0 ? (TLRPC.ReactionCount) this.f.get(i3) : null;
        Context context = ggcVar.getContext();
        yv1 yv1Var = this.p;
        wv1 wv1Var = yv1Var.Ba;
        i2 = ((d) yv1Var).currentAccount;
        c29 c29Var = new c29(context, wv1Var, i2, this.g, reactionCount, true);
        p19 p19Var = this.h;
        c29Var.d(p19Var.getSeenUsers());
        c29Var.H = new cd1(this, (byte) 8);
        c29Var.F = new g11(this, this.i, (byte) 16);
        c29Var.E = new pn0(this.j, i, this.k, this.l, this.m, this.n);
        if (i3 < 0) {
            c29Var.setPredictiveCount(this.o);
            p19Var.setSeenCallback(new gx(c29Var, (byte) 3));
        }
        ggcVar.addView(c29Var);
        sparseArray.put(i, c29Var);
        return c29Var;
    }

    @Override // qt7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
