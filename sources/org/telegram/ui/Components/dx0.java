package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dx0 extends vk0 {
    public final Context c;
    public final /* synthetic */ ex0 d;

    public dx0(ex0 ex0Var, Activity activity) {
        this.d = ex0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.c.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) q1Var.a;
        ArrayList arrayList = this.d.c;
        wVar.b((TLRPC.StickerSetCovered) arrayList.get(i9), i9 != arrayList.size() - 1);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.c, false);
        wVar.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(82.0f)));
        return new ik0(wVar);
    }
}
