package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class oh extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ org.telegram.messenger.gj g;
    public final /* synthetic */ org.telegram.ui.Components.lh0 h;
    public final /* synthetic */ org.telegram.messenger.gj i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ c5.l l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ an p;

    public oh(an anVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.gj gjVar, org.telegram.ui.Components.lh0 lh0Var, org.telegram.messenger.gj gjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.p = anVar;
        this.c = i7;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = gjVar;
        this.h = lh0Var;
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
        an anVar = this.p;
        ym ymVar = anVar.Aa;
        i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(context, ymVar, i10, this.g, reactionCount, true);
        org.telegram.ui.Components.lh0 lh0Var = this.h;
        vh0Var.h(lh0Var.getSeenUsers());
        vh0Var.H = new w0(this, 18);
        vh0Var.F = new m2.d(17, this, this.i);
        vh0Var.E = new ki.b4(this.j, i7, this.k, this.l, this.m, this.n);
        if (i11 < 0) {
            vh0Var.setPredictiveCount(this.o);
            lh0Var.setSeenCallback(new f3(vh0Var, 1));
        }
        lVar.addView(vh0Var);
        sparseArray.put(i7, vh0Var);
        return vh0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
