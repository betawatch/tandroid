package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q81 extends org.telegram.ui.Components.g71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ q91 e;

    public q81(q91 q91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = q91Var;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = frameLayout;
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        q91 q91Var = this.e;
        if (q91Var.h0) {
            return q91Var.f0;
        }
        boolean z10 = this.a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.b) {
            if (i10 == 0) {
                return q91Var.f0;
            }
            i10--;
        }
        return (this.c && i10 == 0) ? q91Var.g0 : frameLayout;
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        if (this.e.h0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
    }
}
