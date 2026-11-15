package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mw implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mw(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((ev) this.c).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((di.x2) this.b, 100L);
                return false;
            case 1:
                c40 c40Var = (c40) this.c;
                c40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.p4 = null;
                c40Var.Z3.j((org.telegram.messenger.s3) this.b);
                org.telegram.messenger.g0.a4(c40Var.l4);
                c40Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.c;
                org.telegram.ui.Components.fb fbVar = hVar.X;
                if (fbVar != null) {
                    int[] iArr = wh.h.e0;
                    fbVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.fb fbVar2 = hVar.X;
                    float topOffset = translationY + (fbVar2.top ? fbVar2.getTopOffset() : -fbVar2.getBottomOffset());
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
