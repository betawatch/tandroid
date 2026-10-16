package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements GenericProvider, org.telegram.ui.Components.cm0, f70 {
    public final /* synthetic */ my0 a;

    public /* synthetic */ jy0(my0 my0Var) {
        this.a = my0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        my0 my0Var = this.a;
        if (i10 < my0Var.r || i10 >= my0Var.s) {
            return false;
        }
        if (my0Var.y != 1) {
            throw null;
        }
        my0Var.U(Long.valueOf(my0Var.getMessagesController().blockePeers.keyAt(i10 - my0Var.r)), view);
        return true;
    }

    @Override // org.telegram.ui.f70
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        my0 my0Var = this.a;
        my0Var.getClass();
        if (((Integer) obj).intValue() == my0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false)));
        }
        return null;
    }
}
