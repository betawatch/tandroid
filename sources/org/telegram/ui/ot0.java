package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot0 implements org.telegram.messenger.k9, org.telegram.ui.Components.dj0, s40 {
    public final /* synthetic */ rt0 a;

    public /* synthetic */ ot0(rt0 rt0Var) {
        this.a = rt0Var;
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
        rt0 rt0Var = this.a;
        if (i7 < rt0Var.r || i7 >= rt0Var.s) {
            return false;
        }
        if (rt0Var.D != 1) {
            throw null;
        }
        rt0Var.Z(Long.valueOf(rt0Var.getMessagesController().G0.keyAt(i7 - rt0Var.r)), view);
        return true;
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        rt0 rt0Var = this.a;
        rt0Var.getClass();
        if (((Integer) obj).intValue() == rt0Var.x) {
            return Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false)));
        }
        return null;
    }
}
