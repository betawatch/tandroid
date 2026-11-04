package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ol extends org.telegram.ui.Components.tj0 implements ei.g7 {
    public final /* synthetic */ wm f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(wm wmVar, Context context, um umVar) {
        super(context, umVar);
        this.f3 = wmVar;
    }

    @Override // ei.g7
    public final void a(int[] iArr) {
        wm wmVar = this.f3;
        iArr[0] = ((int) wmVar.M9) - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = org.telegram.messenger.k5.B(3.0f, wmVar.A0.getPaddingBottom(), wmVar.A0.getMeasuredHeight());
    }
}
