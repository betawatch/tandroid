package mh;

import android.view.ViewTreeObserver;
import org.telegram.messenger.i0;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.eb;
import org.telegram.ui.b50;
import org.telegram.ui.iw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener(this);
                j jVar = (j) this.c;
                eb ebVar = jVar.W;
                if (ebVar != null) {
                    int[] iArr = j.d0;
                    ebVar.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float translationY = iArr[1] - jVar.W.getTranslationY();
                    eb ebVar2 = jVar.W;
                    float topOffset = translationY + (ebVar2.top ? ebVar2.getTopOffset() : -ebVar2.getBottomOffset());
                    jVar.a.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    jVar.X = (jVar.W.a.getMeasuredWidth() / 2.0f) + (f7 - f10) + jVar.W.a.getLeft();
                    jVar.Y = (jVar.W.a.getMeasuredHeight() / 2.0f) + (topOffset - f11) + jVar.W.a.getTop();
                }
                jVar.c();
                break;
            case 1:
                ((iw) this.c).a.e0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                i0.h3((bi.e) this.b, 100L);
                break;
            default:
                b50 b50Var = (b50) this.c;
                b50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var.h4 = null;
                b50Var.R3.j((v3) this.b);
                i0.a4(b50Var.d4);
                b50Var.b.requestLayout();
                break;
        }
        return false;
    }
}
