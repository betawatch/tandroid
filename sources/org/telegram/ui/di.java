package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class di extends m2.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ MessageObject g;
    public final /* synthetic */ org.telegram.ui.Components.oj0 h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ m2.h l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ xn p;

    public di(xn xnVar, int i10, SparseArray sparseArray, boolean z4, List list, MessageObject messageObject, org.telegram.ui.Components.oj0 oj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.p = xnVar;
        this.c = i10;
        this.d = sparseArray;
        this.e = z4;
        this.f = list;
        this.g = messageObject;
        this.h = oj0Var;
        this.i = messageObject2;
        this.j = sparseIntArray;
        this.k = i11;
        this.l = hVar;
        this.m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.n = iArr;
        this.o = i12;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override // m2.a
    public final int b() {
        return this.c;
    }

    @Override // m2.a
    public final Object e(m2.h hVar, int i10) {
        int i11;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            hVar.addView(view);
            return view;
        }
        int i12 = this.e ? i10 - 1 : i10;
        TLRPC.ReactionCount reactionCount = i12 >= 0 ? (TLRPC.ReactionCount) this.f.get(i12) : null;
        Context context = hVar.getContext();
        xn xnVar = this.p;
        vn vnVar = xnVar.ba;
        i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(context, vnVar, i11, this.g, reactionCount, true);
        org.telegram.ui.Components.oj0 oj0Var = this.h;
        yj0Var.h(oj0Var.getSeenUsers());
        yj0Var.D = new a1(this, 16);
        yj0Var.B = new mg.w(17, this, this.i);
        yj0Var.y = new gg.d(this.j, i10, this.k, this.l, this.m, this.n);
        if (i12 < 0) {
            yj0Var.setPredictiveCount(this.o);
            oj0Var.setSeenCallback(new j3(yj0Var, 1));
        }
        hVar.addView(yj0Var);
        sparseArray.put(i10, yj0Var);
        return yj0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
