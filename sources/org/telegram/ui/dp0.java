package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dp0 extends org.telegram.ui.Components.f91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dp0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.f91
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

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                aq0 aq0Var = (aq0) this.b;
                if (i10 == 1) {
                    return aq0Var.h;
                }
                if (i10 == 0) {
                    return aq0Var.n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.h2) this.b).c.get(i10);
        }
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.h2) this.b).c.size();
        }
    }

    @Override // org.telegram.ui.Components.f91
    public final int h(int i10) {
        int i11 = this.a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
