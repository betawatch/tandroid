package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oc extends yo0 {
    public final /* synthetic */ pc B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(pc pcVar, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, j10, context, b6Var);
        this.B = pcVar;
    }

    @Override // org.telegram.ui.yo0
    public final void b(int i9, boolean z10) {
        super.b(i9, z10);
        pc pcVar = this.B;
        TextView textView = pcVar.d;
        if (textView != null) {
            textView.setTextColor(pcVar.b.h.getTextColor());
        }
    }
}
