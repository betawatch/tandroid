package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yx0 extends rl0 {
    public final Context c;
    public final /* synthetic */ zx0 d;

    public yx0(zx0 zx0Var, Activity activity) {
        this.d = zx0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.c.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) m1Var.a;
        ArrayList arrayList = this.d.c;
        wVar.b((TLRPC.StickerSetCovered) arrayList.get(i10), i10 != arrayList.size() - 1);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.c, false);
        wVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(82.0f)));
        return new el0(wVar);
    }
}
