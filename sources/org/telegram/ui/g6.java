package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
