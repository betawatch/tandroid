package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements org.telegram.messenger.j9, org.telegram.ui.Components.sj0, v40 {
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

    @Override // org.telegram.ui.Components.sj0
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

    @Override // org.telegram.messenger.j9
    public Object m(Object obj) {
        st0 st0Var = this.a;
        st0Var.getClass();
        if (((Integer) obj).intValue() == st0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.p7, false)));
        }
        return null;
    }
}
