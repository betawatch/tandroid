package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx0 implements GenericProvider, org.telegram.ui.Components.yl0, j60 {
    public final /* synthetic */ mx0 a;

    public /* synthetic */ jx0(mx0 mx0Var) {
        this.a = mx0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        mx0 mx0Var = this.a;
        if (i10 < mx0Var.r || i10 >= mx0Var.s) {
            return false;
        }
        if (mx0Var.y != 1) {
            throw null;
        }
        mx0Var.U(Long.valueOf(mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.ui.j60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        mx0 mx0Var = this.a;
        mx0Var.getClass();
        if (((Integer) obj).intValue() == mx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false)));
        }
        return null;
    }
}
