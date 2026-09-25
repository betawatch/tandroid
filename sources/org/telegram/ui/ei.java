package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ei extends z4.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ SparseArray d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;
    public final /* synthetic */ MessageObject g;
    public final /* synthetic */ org.telegram.ui.Components.qj0 h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ SparseIntArray j;
    public final /* synthetic */ int k;
    public final /* synthetic */ z4.g l;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout m;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ wn p;

    public ei(wn wnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.qj0 qj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.p = wnVar;
        this.c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f = list;
        this.g = messageObject;
        this.h = qj0Var;
        this.i = messageObject2;
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
        wn wnVar = this.p;
        un unVar = wnVar.ea;
        i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context, unVar, i11, this.g, reactionCount, true);
        org.telegram.ui.Components.qj0 qj0Var = this.h;
        ak0Var.h(qj0Var.getSeenUsers());
        ak0Var.G = new z0(this, 16);
        ak0Var.E = new o(11, this, this.i);
        ak0Var.y = new ei.u4(this.j, i10, this.k, this.l, this.m, this.n);
        if (i12 < 0) {
            ak0Var.setPredictiveCount(this.o);
            qj0Var.setSeenCallback(new h3(ak0Var, 1));
        }
        gVar.addView(ak0Var);
        sparseArray.put(i10, ak0Var);
        return ak0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
