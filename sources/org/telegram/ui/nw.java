package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nw implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nw(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((gv) this.c).a.e0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((bi.r3) this.b, 100L);
                return false;
            case 1:
                f40 f40Var = (f40) this.c;
                f40Var.K1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.k4 = null;
                f40Var.U3.j((org.telegram.messenger.s3) this.b);
                org.telegram.messenger.g0.b4(f40Var.g4);
                f40Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.c;
                org.telegram.ui.Components.jb jbVar = hVar.W;
                if (jbVar != null) {
                    int[] iArr = wh.h.d0;
                    jbVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.jb jbVar2 = hVar.W;
                    float topOffset = translationY + (jbVar2.top ? jbVar2.getTopOffset() : -jbVar2.getBottomOffset());
                    hVar.a.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float f12 = iArr[1];
                    hVar.X = (hVar.W.a.getMeasuredWidth() / 2.0f) + (f10 - f11) + hVar.W.a.getLeft();
                    hVar.Y = (hVar.W.a.getMeasuredHeight() / 2.0f) + (topOffset - f12) + hVar.W.a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
