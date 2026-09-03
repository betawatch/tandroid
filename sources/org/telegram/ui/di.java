package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class di extends m2.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ MessageObject g;
    public final /* synthetic */ org.telegram.ui.Components.pj0 h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ m2.h l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ xn p;

    public di(xn xnVar, int i10, SparseArray sparseArray, boolean z4, List list, MessageObject messageObject, org.telegram.ui.Components.pj0 pj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.p = xnVar;
        this.c = i10;
        this.d = sparseArray;
        this.e = z4;
        this.f = list;
        this.g = messageObject;
        this.h = pj0Var;
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
        org.telegram.ui.Components.zj0 zj0Var = new org.telegram.ui.Components.zj0(context, vnVar, i11, this.g, reactionCount, true);
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        zj0Var.h(pj0Var.getSeenUsers());
        zj0Var.D = new a1(this, 16);
        zj0Var.B = new ng.w(17, this, this.i);
        zj0Var.y = new hg.d(this.j, i10, this.k, this.l, this.m, this.n);
        if (i12 < 0) {
            zj0Var.setPredictiveCount(this.o);
            pj0Var.setSeenCallback(new j3(zj0Var, 1));
        }
        hVar.addView(zj0Var);
        sparseArray.put(i10, zj0Var);
        return zj0Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
