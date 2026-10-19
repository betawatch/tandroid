package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements GenericProvider, org.telegram.ui.Components.yl0, h60 {
    public final /* synthetic */ kx0 a;

    public /* synthetic */ hx0(kx0 kx0Var) {
        this.a = kx0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        kx0 kx0Var = this.a;
        if (i10 < kx0Var.r || i10 >= kx0Var.s) {
            return false;
        }
        if (kx0Var.y != 1) {
            throw null;
        }
        kx0Var.U(Long.valueOf(kx0Var.getMessagesController().blockePeers.keyAt(i10 - kx0Var.r)), view);
        return true;
    }

    @Override // org.telegram.ui.h60
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.V();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        kx0 kx0Var = this.a;
        kx0Var.getClass();
        if (((Integer) obj).intValue() == kx0Var.w) {
            return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false)));
        }
        return null;
    }
}
