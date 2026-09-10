package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy0 implements GenericProvider, org.telegram.ui.Components.ll0, a70 {
    public final /* synthetic */ ky0 a;

    public /* synthetic */ hy0(ky0 ky0Var) {
        this.a = ky0Var;
    }

    @Override // org.telegram.ui.a70
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        ky0 ky0Var = this.a;
        if (i10 < ky0Var.r || i10 >= ky0Var.s) {
            return false;
        }
        if (ky0Var.y != 1) {
            throw null;
        }
        ky0Var.U(Long.valueOf(ky0Var.getMessagesController().blockePeers.keyAt(i10 - ky0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        ky0 ky0Var = this.a;
        ky0Var.getClass();
        if (((Integer) obj).intValue() == ky0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false)));
        }
        return null;
    }
}
