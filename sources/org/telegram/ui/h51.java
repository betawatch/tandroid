package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class h51 extends sg.c1 {
    public final /* synthetic */ i51 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(i51 i51Var, Context context) {
        super(context, 2, null);
        this.M = i51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        i51 i51Var = this.M;
        if (i51Var.getParent() instanceof View) {
            ((View) i51Var.getParent()).invalidate();
        }
    }
}
