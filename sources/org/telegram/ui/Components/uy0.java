package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class uy0 extends lm0 {
    public final Context c;
    public final /* synthetic */ vy0 d;

    public uy0(vy0 vy0Var, Activity activity) {
        this.d = vy0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.c.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) b1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i10), i10 != arrayList.size() - 1);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(82.0f)));
        return new wl0(vVar);
    }
}
