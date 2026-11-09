package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bm0 extends xr {
    public final /* synthetic */ org.telegram.ui.yw f0;
    public final /* synthetic */ org.telegram.ui.hw g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(org.telegram.ui.hw hwVar, qj0 qj0Var, Context context, int i7, int i10, org.telegram.ui.yw ywVar) {
        super(qj0Var, context, i7, i10);
        this.g0 = hwVar;
        this.f0 = ywVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final void O(boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z9);
        tl0 tl0Var = this.g0.i0;
        tl0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z9);
        if (!TextUtils.isEmpty(this.d0)) {
            tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
            tl0Var.e.setVisibility(8);
        } else {
            tl0Var.d.setText(org.telegram.messenger.id.M0(2131748231, null));
            tl0Var.e.setVisibility(0);
            tl0Var.e.setText(org.telegram.messenger.id.M0(2131748232, null));
        }
    }
}
