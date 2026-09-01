package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements GenericProvider, org.telegram.ui.Components.ll0, v60 {
    public final /* synthetic */ ox0 a;

    public /* synthetic */ lx0(ox0 ox0Var) {
        this.a = ox0Var;
    }

    @Override // org.telegram.ui.v60
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        ox0 ox0Var = this.a;
        if (i10 < ox0Var.r || i10 >= ox0Var.s) {
            return false;
        }
        if (ox0Var.y != 1) {
            throw null;
        }
        ox0Var.U(Long.valueOf(ox0Var.getMessagesController().blockePeers.keyAt(i10 - ox0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        ox0 ox0Var = this.a;
        ox0Var.getClass();
        if (((Integer) obj).intValue() == ox0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false)));
        }
        return null;
    }
}
