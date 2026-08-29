package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tp extends LinearLayout {
    public final /* synthetic */ wp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(wp wpVar, Context context) {
        super(context);
        this.a = wpVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        wp.m(this.a);
    }
}
