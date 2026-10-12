package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kp0 extends org.telegram.ui.Components.c91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kp0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (view instanceof org.telegram.ui.Wallet.f2) {
                    ((org.telegram.ui.Wallet.f2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                gq0 gq0Var = (gq0) this.b;
                if (i10 == 1) {
                    return gq0Var.h;
                }
                if (i10 == 0) {
                    return gq0Var.n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.h2) this.b).c.get(i10);
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.h2) this.b).c.size();
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final int h(int i10) {
        int i11 = this.a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
