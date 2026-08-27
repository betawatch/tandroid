package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ho0 extends org.telegram.ui.Components.g71 {
    public final /* synthetic */ ap0 a;

    public ho0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        ap0 ap0Var = this.a;
        if (i10 == 1) {
            return ap0Var.f;
        }
        if (i10 == 0) {
            return ap0Var.h;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
    }
}
