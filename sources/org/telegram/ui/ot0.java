package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot0 implements org.telegram.messenger.i9, org.telegram.ui.Components.sj0, u40 {
    public final /* synthetic */ rt0 a;

    public /* synthetic */ ot0(rt0 rt0Var) {
        this.a = rt0Var;
    }

    @Override // org.telegram.ui.u40
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        rt0 rt0Var = this.a;
        if (i7 < rt0Var.r || i7 >= rt0Var.s) {
            return false;
        }
        if (rt0Var.E != 1) {
            throw null;
        }
        rt0Var.Z(Long.valueOf(rt0Var.getMessagesController().H0.keyAt(i7 - rt0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        rt0 rt0Var = this.a;
        rt0Var.getClass();
        if (((Integer) obj).intValue() == rt0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.p7, false)));
        }
        return null;
    }
}
