package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fv extends n9 {
    public final /* synthetic */ iv C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(iv ivVar, Context context) {
        super(context);
        this.C = ivVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.C.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
