package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
