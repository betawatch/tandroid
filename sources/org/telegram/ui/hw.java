package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hw implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hw(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((av) this.c).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((ci.e3) this.b, 100L);
                return false;
            case 1:
                x30 x30Var = (x30) this.c;
                x30Var.I1.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var.i4 = null;
                x30Var.S3.j((org.telegram.messenger.s3) this.b);
                org.telegram.messenger.g0.b4(x30Var.e4);
                x30Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener(this);
                xh.h hVar = (xh.h) this.c;
                org.telegram.ui.Components.ib ibVar = hVar.X;
                if (ibVar != null) {
                    int[] iArr = xh.h.e0;
                    ibVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.ib ibVar2 = hVar.X;
                    float topOffset = translationY + (ibVar2.top ? ibVar2.getTopOffset() : -ibVar2.getBottomOffset());
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
