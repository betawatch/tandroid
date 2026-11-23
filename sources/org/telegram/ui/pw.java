package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pw implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pw(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((hv) this.c).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.h3((bi.c4) this.b, 100L);
                return false;
            case 1:
                f40 f40Var = (f40) this.c;
                f40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.p4 = null;
                f40Var.Z3.j((org.telegram.messenger.u3) this.b);
                org.telegram.messenger.g0.Z3(f40Var.l4);
                f40Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.c;
                org.telegram.ui.Components.ob obVar = hVar.X;
                if (obVar != null) {
                    int[] iArr = wh.h.e0;
                    obVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.ob obVar2 = hVar.X;
                    float topOffset = translationY + (obVar2.top ? obVar2.getTopOffset() : -obVar2.getBottomOffset());
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
