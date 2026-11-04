package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kh extends b5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ org.telegram.messenger.zi g;
    public final /* synthetic */ org.telegram.ui.Components.kh0 h;
    public final /* synthetic */ org.telegram.messenger.zi i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ b5.l l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ wm p;

    public kh(wm wmVar, int i3, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.zi ziVar, org.telegram.ui.Components.kh0 kh0Var, org.telegram.messenger.zi ziVar2, SparseIntArray sparseIntArray, int i10, b5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.p = wmVar;
        this.c = i3;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = ziVar;
        this.h = kh0Var;
        this.i = ziVar2;
        this.j = sparseIntArray;
        this.k = i10;
        this.l = lVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i11;
    }

    @Override // b5.a
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override // b5.a
    public final int b() {
        return this.c;
    }

    @Override // b5.a
    public final Object e(b5.l lVar, int i3) {
        int i10;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i3);
        if (view != null) {
            lVar.addView(view);
            return view;
        }
        int i11 = this.e ? i3 - 1 : i3;
        TLRPC.ReactionCount reactionCount = i11 >= 0 ? (TLRPC.ReactionCount) this.f.get(i11) : null;
        Context context = lVar.getContext();
        wm wmVar = this.p;
        um umVar = wmVar.ya;
        i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        org.telegram.ui.Components.uh0 uh0Var = new org.telegram.ui.Components.uh0(context, umVar, i10, this.g, reactionCount, true);
        org.telegram.ui.Components.kh0 kh0Var = this.h;
        uh0Var.h(kh0Var.getSeenUsers());
        uh0Var.H = new x0(this, 18);
        uh0Var.F = new mi.d4(23, this, this.i);
        uh0Var.E = new ii.g4(this.j, i3, this.k, this.l, this.m, this.n);
        if (i11 < 0) {
            uh0Var.setPredictiveCount(this.o);
            kh0Var.setSeenCallback(new g3(uh0Var, 1));
        }
        lVar.addView(uh0Var);
        sparseArray.put(i3, uh0Var);
        return uh0Var;
    }

    @Override // b5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
