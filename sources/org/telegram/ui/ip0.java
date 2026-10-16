package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ip0 extends org.telegram.ui.Components.d91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ip0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (view instanceof org.telegram.ui.Wallet.g2) {
                    ((org.telegram.ui.Wallet.g2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                eq0 eq0Var = (eq0) this.b;
                if (i10 == 1) {
                    return eq0Var.h;
                }
                if (i10 == 0) {
                    return eq0Var.n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.i2) this.b).c.get(i10);
        }
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.i2) this.b).c.size();
        }
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        int i11 = this.a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
