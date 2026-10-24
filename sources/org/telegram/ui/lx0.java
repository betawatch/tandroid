package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements GenericProvider, org.telegram.ui.Components.cm0, l60 {
    public final /* synthetic */ ox0 a;

    public /* synthetic */ lx0(ox0 ox0Var) {
        this.a = ox0Var;
    }

    @Override // org.telegram.ui.l60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
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
            return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false)));
        }
        return null;
    }
}
