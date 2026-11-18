package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jw0 extends bk0 {
    public final Context c;
    public final /* synthetic */ kw0 d;

    public jw0(kw0 kw0Var, Activity activity) {
        this.d = kw0Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) f1Var.a;
        ArrayList arrayList = this.d.c;
        vVar.b((TLRPC.StickerSetCovered) arrayList.get(i7), i7 != arrayList.size() - 1);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.c, false);
        vVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new kj0(vVar);
    }
}
