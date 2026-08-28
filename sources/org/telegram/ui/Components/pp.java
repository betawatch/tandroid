package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pp extends LinearLayout {
    public final /* synthetic */ sp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(sp spVar, Context context) {
        super(context);
        this.a = spVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        sp.m(this.a);
    }
}
