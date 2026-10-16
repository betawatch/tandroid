package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.Components.gp {
    public final /* synthetic */ fo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(fo foVar, Context context) {
        super(context);
        this.f = foVar;
    }

    @Override // org.telegram.ui.Components.gp
    public final void a(boolean z10) {
        fo foVar = this.f;
        foVar.w7();
        foVar.u7();
        foVar.x7();
        foVar.y7();
        il ilVar = foVar.bb;
        if (ilVar != null) {
            ilVar.setTranslationY(foVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            foVar.t9();
        } else {
            foVar.D9 = true;
            foVar.nc();
        }
    }
}
