package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements GenericProvider, org.telegram.ui.Components.bl0, a70 {
    public final /* synthetic */ gy0 a;

    public /* synthetic */ dy0(gy0 gy0Var) {
        this.a = gy0Var;
    }

    @Override // org.telegram.ui.a70
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        gy0 gy0Var = this.a;
        if (i10 < gy0Var.r || i10 >= gy0Var.s) {
            return false;
        }
        if (gy0Var.y != 1) {
            throw null;
        }
        gy0Var.U(Long.valueOf(gy0Var.getMessagesController().blockePeers.keyAt(i10 - gy0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        gy0 gy0Var = this.a;
        gy0Var.getClass();
        if (((Integer) obj).intValue() == gy0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false)));
        }
        return null;
    }
}
