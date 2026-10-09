package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements GenericProvider, org.telegram.ui.Components.gm0, y60 {
    public final /* synthetic */ gy0 a;

    public /* synthetic */ dy0(gy0 gy0Var) {
        this.a = gy0Var;
    }

    @Override // org.telegram.ui.y60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.gm0
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
            return Integer.valueOf(org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.p7, false)));
        }
        return null;
    }
}
