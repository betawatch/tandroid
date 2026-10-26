package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.fp {
    public final /* synthetic */ un f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(un unVar, Context context) {
        super(context);
        this.f = unVar;
    }

    @Override // org.telegram.ui.Components.fp
    public final void a(boolean z10) {
        un unVar = this.f;
        unVar.A7();
        unVar.y7();
        unVar.B7();
        unVar.C7();
        xk xkVar = unVar.wb;
        if (xkVar != null) {
            xkVar.setTranslationY(unVar.I9 + getCurrentHeight());
        }
        if (!z10) {
            unVar.x9();
        } else {
            unVar.P9 = true;
            unVar.wc();
        }
    }
}
