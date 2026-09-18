package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ((z6) this.b).z0();
                break;
            default:
                kVar = ((org.telegram.ui.ActionBar.n2) ((al) this.b).d).actionBar;
                kVar.invalidate();
                break;
        }
        return true;
    }
}
