package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft0 implements org.telegram.messenger.e9, org.telegram.ui.Components.hj0, n40 {
    public final /* synthetic */ it0 a;

    public /* synthetic */ ft0(it0 it0Var) {
        this.a = it0Var;
    }

    @Override // org.telegram.ui.n40
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        it0 it0Var = this.a;
        if (i3 < it0Var.r || i3 >= it0Var.s) {
            return false;
        }
        if (it0Var.E != 1) {
            throw null;
        }
        it0Var.Z(Long.valueOf(it0Var.getMessagesController().H0.keyAt(i3 - it0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        it0 it0Var = this.a;
        it0Var.getClass();
        if (((Integer) obj).intValue() == it0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false)));
        }
        return null;
    }
}
