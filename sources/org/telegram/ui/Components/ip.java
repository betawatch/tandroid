package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ip extends LinearLayout {
    public final /* synthetic */ lp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(lp lpVar, Context context) {
        super(context);
        this.a = lpVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        lp.I0(this.a);
    }
}
