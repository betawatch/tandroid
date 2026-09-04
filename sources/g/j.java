package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n0, r0.m0
    public void b() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((i) obj).b.y.setVisibility(0);
                break;
            case 1:
                s sVar = (s) obj;
                sVar.y.setVisibility(0);
                if (sVar.y.getParent() instanceof View) {
                    View view = (View) sVar.y.getParent();
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
                s sVar = ((i) obj).b;
                sVar.y.setAlpha(1.0f);
                sVar.G.d(null);
                sVar.G = null;
                break;
            case 1:
                s sVar2 = (s) obj;
                sVar2.y.setAlpha(1.0f);
                sVar2.G.d(null);
                sVar2.G = null;
                break;
            default:
                s sVar3 = (s) ((n4.y) obj).c;
                sVar3.y.setVisibility(8);
                PopupWindow popupWindow = sVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.y.getParent() instanceof View) {
                    View view = (View) sVar3.y.getParent();
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(view);
                }
                sVar3.y.e();
                sVar3.G.d(null);
                sVar3.G = null;
                ViewGroup viewGroup = sVar3.J;
                WeakHashMap weakHashMap2 = i0.a;
                r0.y.c(viewGroup);
                break;
        }
    }
}
