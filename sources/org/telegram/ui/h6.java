package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ((a7) this.b).z0();
                break;
            default:
                kVar = ((org.telegram.ui.ActionBar.o2) ((cl) this.b).d).actionBar;
                kVar.invalidate();
                break;
        }
        return true;
    }
}
