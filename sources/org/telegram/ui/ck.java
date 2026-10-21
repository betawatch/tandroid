package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.dp {
    public final /* synthetic */ qn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(qn qnVar, Context context) {
        super(context);
        this.f = qnVar;
    }

    @Override // org.telegram.ui.Components.dp
    public final void a(boolean z10) {
        qn qnVar = this.f;
        qnVar.w7();
        qnVar.u7();
        qnVar.x7();
        qnVar.y7();
        vk vkVar = qnVar.bb;
        if (vkVar != null) {
            vkVar.setTranslationY(qnVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            qnVar.t9();
        } else {
            qnVar.D9 = true;
            qnVar.oc();
        }
    }
}
