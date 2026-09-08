package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vx0 extends kl0 {
    public final Context c;
    public final /* synthetic */ wx0 d;

    public vx0(wx0 wx0Var, Activity activity) {
        this.d = wx0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.c.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) c1Var.a;
        ArrayList arrayList = this.d.c;
        wVar.b((TLRPC.StickerSetCovered) arrayList.get(i10), i10 != arrayList.size() - 1);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.c, false);
        wVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(82.0f)));
        return new vk0(wVar);
    }
}
