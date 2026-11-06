package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt0 implements org.telegram.messenger.k9, org.telegram.ui.Components.dj0, s40 {
    public final /* synthetic */ st0 a;

    public /* synthetic */ pt0(st0 st0Var) {
        this.a = st0Var;
    }

    @Override // org.telegram.ui.s40
    public void a(ArrayList arrayList, boolean z9, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.a.a0();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        st0 st0Var = this.a;
        if (i7 < st0Var.r || i7 >= st0Var.s) {
            return false;
        }
        if (st0Var.D != 1) {
            throw null;
        }
        st0Var.Z(Long.valueOf(st0Var.getMessagesController().G0.keyAt(i7 - st0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        st0 st0Var = this.a;
        st0Var.getClass();
        if (((Integer) obj).intValue() == st0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false)));
        }
        return null;
    }
}
