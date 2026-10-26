package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class px0 implements GenericProvider, org.telegram.ui.Components.bm0, n60 {
    public final /* synthetic */ sx0 a;

    public /* synthetic */ px0(sx0 sx0Var) {
        this.a = sx0Var;
    }

    @Override // org.telegram.ui.n60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.W();
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        sx0 sx0Var = this.a;
        if (i10 < sx0Var.r || i10 >= sx0Var.s) {
            return false;
        }
        if (sx0Var.y != 1) {
            throw null;
        }
        sx0Var.V(Long.valueOf(sx0Var.getMessagesController().blockePeers.keyAt(i10 - sx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        sx0 sx0Var = this.a;
        sx0Var.getClass();
        if (((Integer) obj).intValue() == sx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false)));
        }
        return null;
    }
}
