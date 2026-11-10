package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zv0 extends oj0 {
    public final Context c;
    public final /* synthetic */ aw0 d;

    public zv0(aw0 aw0Var, Activity activity) {
        this.d = aw0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.c.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) d1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i7), i7 != arrayList.size() - 1);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new xi0(vVar);
    }
}
