package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class oh extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ org.telegram.messenger.ij g;
    public final /* synthetic */ org.telegram.ui.Components.hh0 h;
    public final /* synthetic */ org.telegram.messenger.ij i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ c5.k l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ an p;

    public oh(an anVar, int i7, SparseArray sparseArray, boolean z9, List list, org.telegram.messenger.ij ijVar, org.telegram.ui.Components.hh0 hh0Var, org.telegram.messenger.ij ijVar2, SparseIntArray sparseIntArray, int i10, c5.k kVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.p = anVar;
        this.c = i7;
        this.d = sparseArray;
        this.e = z9;
        this.f = list;
        this.g = ijVar;
        this.h = hh0Var;
        this.i = ijVar2;
        this.j = sparseIntArray;
        this.k = i10;
        this.l = kVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i11;
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override // c5.a
    public final int b() {
        return this.c;
    }

    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        int i10;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            kVar.addView(view);
            return view;
        }
        int i11 = this.e ? i7 - 1 : i7;
        TLRPC.ReactionCount reactionCount = i11 >= 0 ? (TLRPC.ReactionCount) this.f.get(i11) : null;
        Context context = kVar.getContext();
        an anVar = this.p;
        ym ymVar = anVar.xa;
        i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context, ymVar, i10, this.g, reactionCount, true);
        org.telegram.ui.Components.hh0 hh0Var = this.h;
        rh0Var.h(hh0Var.getSeenUsers());
        rh0Var.G = new w0(this, 18);
        rh0Var.E = new ni.c(13, this, this.i);
        rh0Var.D = new hi.g4(this.j, i7, this.k, this.l, this.m, this.n);
        if (i11 < 0) {
            rh0Var.setPredictiveCount(this.o);
            hh0Var.setSeenCallback(new f3(rh0Var, 1));
        }
        kVar.addView(rh0Var);
        sparseArray.put(i7, rh0Var);
        return rh0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
