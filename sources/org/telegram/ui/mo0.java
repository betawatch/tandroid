package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class mo0 extends org.telegram.ui.Components.w81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (view instanceof org.telegram.ui.Wallet.h2) {
                    ((org.telegram.ui.Wallet.h2) view).getClass();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        switch (this.a) {
            case 0:
                ip0 ip0Var = (ip0) this.b;
                if (i10 == 1) {
                    return ip0Var.h;
                }
                if (i10 == 0) {
                    return ip0Var.n;
                }
                return null;
            default:
                return (View) ((org.telegram.ui.Wallet.j2) this.b).c.get(i10);
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return ((org.telegram.ui.Wallet.j2) this.b).c.size();
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        int i11 = this.a;
        return i10;
    }

    private final void i(View view, int i10, int i11) {
    }
}
