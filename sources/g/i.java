package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.h0;
import r0.m0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.m0, r0.l0
    public void b() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((h) obj).b.D.setVisibility(0);
                break;
            case 1:
                r rVar = (r) obj;
                rVar.D.setVisibility(0);
                if (rVar.D.getParent() instanceof View) {
                    View view = (View) rVar.D.getParent();
                    WeakHashMap weakHashMap = h0.a;
                    r0.x.c(view);
                    break;
                }
                break;
        }
    }

    @Override // r0.l0
    public final void c() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                r rVar = ((h) obj).b;
                rVar.D.setAlpha(1.0f);
                rVar.G.d(null);
                rVar.G = null;
                break;
            case 1:
                r rVar2 = (r) obj;
                rVar2.D.setAlpha(1.0f);
                rVar2.G.d(null);
                rVar2.G = null;
                break;
            default:
                r rVar3 = (r) ((n4.q) obj).b;
                rVar3.D.setVisibility(8);
                PopupWindow popupWindow = rVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.D.getParent() instanceof View) {
                    View view = (View) rVar3.D.getParent();
                    WeakHashMap weakHashMap = h0.a;
                    r0.x.c(view);
                }
                rVar3.D.e();
                rVar3.G.d(null);
                rVar3.G = null;
                ViewGroup viewGroup = rVar3.J;
                WeakHashMap weakHashMap2 = h0.a;
                r0.x.c(viewGroup);
                break;
        }
    }
}
