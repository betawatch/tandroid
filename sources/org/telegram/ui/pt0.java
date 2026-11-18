package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements org.telegram.messenger.i9, org.telegram.ui.Components.qj0, v40 {
    public final /* synthetic */ st0 a;

    public /* synthetic */ pt0(st0 st0Var) {
        this.a = st0Var;
    }

    @Override // org.telegram.ui.v40
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        st0 st0Var = this.a;
        if (i7 < st0Var.r || i7 >= st0Var.s) {
            return false;
        }
        if (st0Var.E != 1) {
            throw null;
        }
        st0Var.Z(Long.valueOf(st0Var.getMessagesController().H0.keyAt(i7 - st0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        st0 st0Var = this.a;
        st0Var.getClass();
        if (((Integer) obj).intValue() == st0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.p7, false)));
        }
        return null;
    }
}
