package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gk extends org.telegram.ui.Components.gp {
    public final /* synthetic */ wn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(wn wnVar, Context context) {
        super(context);
        this.f = wnVar;
    }

    @Override // org.telegram.ui.Components.gp
    public final void a(boolean z10) {
        wn wnVar = this.f;
        wnVar.C7();
        wnVar.A7();
        wnVar.D7();
        wnVar.E7();
        zk zkVar = wnVar.Ab;
        if (zkVar != null) {
            zkVar.setTranslationY(wnVar.M9 + getCurrentHeight());
        }
        if (!z10) {
            wnVar.A9();
        } else {
            wnVar.T9 = true;
            wnVar.Ac();
        }
    }
}
