package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nh extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ org.telegram.messenger.fj g;
    public final /* synthetic */ org.telegram.ui.Components.uh0 h;
    public final /* synthetic */ org.telegram.messenger.fj i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ c5.l l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ bn p;

    public nh(bn bnVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.fj fjVar, org.telegram.ui.Components.uh0 uh0Var, org.telegram.messenger.fj fjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.p = bnVar;
        this.c = i7;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = fjVar;
        this.h = uh0Var;
        this.i = fjVar2;
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
        i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context, zmVar, i10, this.g, reactionCount, true);
        org.telegram.ui.Components.uh0 uh0Var = this.h;
        ei0Var.h(uh0Var.getSeenUsers());
        ei0Var.H = new w0(this, 18);
        ei0Var.F = new oi.e0(15, this, this.i);
        ei0Var.E = new ki.w3(this.j, i7, this.k, this.l, this.m, this.n);
        if (i11 < 0) {
            ei0Var.setPredictiveCount(this.o);
            uh0Var.setSeenCallback(new f3(ei0Var, 1));
        }
        lVar.addView(ei0Var);
        sparseArray.put(i7, ei0Var);
        return ei0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
