package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n0, r0.m0
    public void b() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((h) obj).b.y.setVisibility(0);
                break;
            case 1:
                r rVar = (r) obj;
                rVar.y.setVisibility(0);
                if (rVar.y.getParent() instanceof View) {
                    View view = (View) rVar.y.getParent();
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(view);
                    break;
                }
                break;
        }
    }

    @Override // r0.m0
    public final void c() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).b;
                rVar.y.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                break;
            case 1:
                r rVar2 = (r) obj;
                rVar2.y.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                break;
            default:
                r rVar3 = (r) ((n4.x) obj).c;
                rVar3.y.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.y.getParent() instanceof View) {
                    View view = (View) rVar3.y.getParent();
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(view);
                }
                rVar3.y.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = i0.a;
                r0.y.c(viewGroup);
                break;
        }
    }
}
