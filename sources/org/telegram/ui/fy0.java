package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements GenericProvider, org.telegram.ui.Components.cl0, c70 {
    public final /* synthetic */ iy0 a;

    public /* synthetic */ fy0(iy0 iy0Var) {
        this.a = iy0Var;
    }

    @Override // org.telegram.ui.c70
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        iy0 iy0Var = this.a;
        if (i10 < iy0Var.r || i10 >= iy0Var.s) {
            return false;
        }
        if (iy0Var.y != 1) {
            throw null;
        }
        iy0Var.U(Long.valueOf(iy0Var.getMessagesController().blockePeers.keyAt(i10 - iy0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        iy0 iy0Var = this.a;
        iy0Var.getClass();
        if (((Integer) obj).intValue() == iy0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false)));
        }
        return null;
    }
}
