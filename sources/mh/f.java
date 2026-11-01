package mh;

import android.view.ViewTreeObserver;
import org.telegram.messenger.i0;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.eb;
import org.telegram.ui.a50;
import org.telegram.ui.hw;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                ((hw) this.c).a.e0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                i0.h3((bi.e) this.b, 100L);
                break;
            default:
                a50 a50Var = (a50) this.c;
                a50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var.h4 = null;
                a50Var.R3.j((v3) this.b);
                i0.a4(a50Var.d4);
                a50Var.b.requestLayout();
                break;
        }
        return false;
    }
}
