package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ez0 extends mm0 {
    public final Context c;
    public final /* synthetic */ fz0 d;

    public ez0(fz0 fz0Var, Activity activity) {
        this.d = fz0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.c.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) e1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i10), i10 != arrayList.size() - 1);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(82.0f)));
        return new wl0(vVar);
    }
}
