package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx0 implements GenericProvider, org.telegram.ui.Components.kl0, u60 {
    public final /* synthetic */ mx0 a;

    public /* synthetic */ jx0(mx0 mx0Var) {
        this.a = mx0Var;
    }

    @Override // org.telegram.ui.u60
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
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

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        mx0 mx0Var = this.a;
        mx0Var.getClass();
        if (((Integer) obj).intValue() == mx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false)));
        }
        return null;
    }
}
