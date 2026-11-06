package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class kw implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kw(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((dv) this.c).a.e0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((bi.r3) this.b, 100L);
                return false;
            case 1:
                c40 c40Var = (c40) this.c;
                c40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.h4 = null;
                c40Var.R3.j((org.telegram.messenger.s3) this.b);
                org.telegram.messenger.g0.b4(c40Var.d4);
                c40Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.c;
                org.telegram.ui.Components.kb kbVar = hVar.W;
                if (kbVar != null) {
                    int[] iArr = wh.h.d0;
                    kbVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.kb kbVar2 = hVar.W;
                    float topOffset = translationY + (kbVar2.top ? kbVar2.getTopOffset() : -kbVar2.getBottomOffset());
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
