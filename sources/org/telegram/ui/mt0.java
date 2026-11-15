package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt0 implements org.telegram.messenger.j9, org.telegram.ui.Components.ij0, s40 {
    public final /* synthetic */ pt0 a;

    public /* synthetic */ mt0(pt0 pt0Var) {
        this.a = pt0Var;
    }

    @Override // org.telegram.ui.s40
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        pt0 pt0Var = this.a;
        if (i7 < pt0Var.r || i7 >= pt0Var.s) {
            return false;
        }
        if (pt0Var.E != 1) {
            throw null;
        }
        pt0Var.Z(Long.valueOf(pt0Var.getMessagesController().H0.keyAt(i7 - pt0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        pt0 pt0Var = this.a;
        pt0Var.getClass();
        if (((Integer) obj).intValue() == pt0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.p7, false)));
        }
        return null;
    }
}
