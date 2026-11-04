package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yv0 extends sj0 {
    public final Context c;
    public final /* synthetic */ zv0 d;

    public yv0(zv0 zv0Var, Activity activity) {
        this.d = zv0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.c.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) d1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i3), i3 != arrayList.size() - 1);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new bj0(vVar);
    }
}
