package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ki extends z4.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ org.telegram.messenger.jj g;
    public final /* synthetic */ org.telegram.ui.Components.li0 h;
    public final /* synthetic */ org.telegram.messenger.jj i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ z4.g l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ un p;

    public ki(un unVar, int i10, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.jj jjVar, org.telegram.ui.Components.li0 li0Var, org.telegram.messenger.jj jjVar2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.p = unVar;
        this.c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = jjVar;
        this.h = li0Var;
        this.i = jjVar2;
        this.j = sparseIntArray;
        this.k = i11;
        this.l = gVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i12;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override // z4.a
    public final int b() {
        return this.c;
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        int i11;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        int i12 = this.e ? i10 - 1 : i10;
        TLRPC.ReactionCount reactionCount = i12 >= 0 ? (TLRPC.ReactionCount) this.f.get(i12) : null;
        Context context = gVar.getContext();
        un unVar = this.p;
        sn snVar = unVar.xa;
        i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(context, snVar, i11, this.g, reactionCount, true);
        org.telegram.ui.Components.li0 li0Var = this.h;
        vi0Var.h(li0Var.getSeenUsers());
        vi0Var.G = new y0(this, 18);
        vi0Var.E = new ng.d(13, this, this.i);
        vi0Var.D = new mg.e(this.j, i10, this.k, this.l, this.m, this.n);
        if (i12 < 0) {
            vi0Var.setPredictiveCount(this.o);
            li0Var.setSeenCallback(new f3(vi0Var, 1));
        }
        gVar.addView(vi0Var);
        sparseArray.put(i10, vi0Var);
        return vi0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
