package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class oh extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ org.telegram.messenger.gj g;
    public final /* synthetic */ org.telegram.ui.Components.wh0 h;
    public final /* synthetic */ org.telegram.messenger.gj i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ c5.l l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ bn p;

    public oh(bn bnVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.gj gjVar, org.telegram.ui.Components.wh0 wh0Var, org.telegram.messenger.gj gjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.p = bnVar;
        this.c = i7;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = gjVar;
        this.h = wh0Var;
        this.i = gjVar2;
        this.j = sparseIntArray;
        this.k = i10;
        this.l = lVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i11;
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override // c5.a
    public final int b() {
        return this.c;
    }

    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        int i10;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            lVar.addView(view);
            return view;
        }
        int i11 = this.e ? i7 - 1 : i7;
        TLRPC.ReactionCount reactionCount = i11 >= 0 ? (TLRPC.ReactionCount) this.f.get(i11) : null;
        Context context = lVar.getContext();
        bn bnVar = this.p;
        zm zmVar = bnVar.Ba;
        i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(context, zmVar, i10, this.g, reactionCount, true);
        org.telegram.ui.Components.wh0 wh0Var = this.h;
        gi0Var.h(wh0Var.getSeenUsers());
        gi0Var.H = new w0(this, 18);
        gi0Var.F = new oi.f0(15, this, this.i);
        gi0Var.E = new ki.v3(this.j, i7, this.k, this.l, this.m, this.n);
        if (i11 < 0) {
            gi0Var.setPredictiveCount(this.o);
            wh0Var.setSeenCallback(new f3(gi0Var, 1));
        }
        lVar.addView(gi0Var);
        sparseArray.put(i7, gi0Var);
        return gi0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
