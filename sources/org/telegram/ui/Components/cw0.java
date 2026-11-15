package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cw0 extends tj0 {
    public final Context c;
    public final /* synthetic */ dw0 d;

    public cw0(dw0 dw0Var, Activity activity) {
        this.d = dw0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.c.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) e1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i7), i7 != arrayList.size() - 1);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new cj0(vVar);
    }
}
