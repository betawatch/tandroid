package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fx0 extends yk0 {
    public final Context c;
    public final /* synthetic */ gx0 d;

    public fx0(gx0 gx0Var, Activity activity) {
        this.d = gx0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.c.size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) o1Var.a;
        ArrayList arrayList = this.d.c;
        wVar.b((TLRPC.StickerSetCovered) arrayList.get(i10), i10 != arrayList.size() - 1);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.c, false);
        wVar.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(82.0f)));
        return new lk0(wVar);
    }
}
