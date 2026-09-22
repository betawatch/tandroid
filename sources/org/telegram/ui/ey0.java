package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey0 implements GenericProvider, org.telegram.ui.Components.ol0, a70 {
    public final /* synthetic */ hy0 a;

    public /* synthetic */ ey0(hy0 hy0Var) {
        this.a = hy0Var;
    }

    @Override // org.telegram.ui.a70
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        hy0 hy0Var = this.a;
        if (i10 < hy0Var.r || i10 >= hy0Var.s) {
            return false;
        }
        if (hy0Var.y != 1) {
            throw null;
        }
        hy0Var.U(Long.valueOf(hy0Var.getMessagesController().blockePeers.keyAt(i10 - hy0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        hy0 hy0Var = this.a;
        hy0Var.getClass();
        if (((Integer) obj).intValue() == hy0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false)));
        }
        return null;
    }
}
