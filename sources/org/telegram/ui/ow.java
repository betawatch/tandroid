package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ow implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((gv) this.c).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.h3((bi.e4) this.b, 100L);
                return false;
            case 1:
                e40 e40Var = (e40) this.c;
                e40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.p4 = null;
                e40Var.Z3.j((org.telegram.messenger.u3) this.b);
                org.telegram.messenger.g0.Z3(e40Var.l4);
                e40Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.c;
                org.telegram.ui.Components.nb nbVar = hVar.X;
                if (nbVar != null) {
                    int[] iArr = wh.h.e0;
                    nbVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.nb nbVar2 = hVar.X;
                    float topOffset = translationY + (nbVar2.top ? nbVar2.getTopOffset() : -nbVar2.getBottomOffset());
                    hVar.a.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float f12 = iArr[1];
                    hVar.Y = (hVar.X.a.getMeasuredWidth() / 2.0f) + (f10 - f11) + hVar.X.a.getLeft();
                    hVar.Z = (hVar.X.a.getMeasuredHeight() / 2.0f) + (topOffset - f12) + hVar.X.a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
