package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // r0.n0, r0.m0
    public void b() {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((h) obj).b.E.setVisibility(0);
                break;
            case 1:
                s sVar = (s) obj;
                sVar.E.setVisibility(0);
                if (sVar.E.getParent() instanceof View) {
                    View view = (View) sVar.E.getParent();
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(view);
                    break;
                }
                break;
        }
    }

    @Override // r0.m0
    public final void c() {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                s sVar = ((h) obj).b;
                sVar.E.setAlpha(1.0f);
                sVar.H.d(null);
                sVar.H = null;
                break;
            case 1:
                s sVar2 = (s) obj;
                sVar2.E.setAlpha(1.0f);
                sVar2.H.d(null);
                sVar2.H = null;
                break;
            default:
                s sVar3 = (s) ((tf.b) obj).b;
                sVar3.E.setVisibility(8);
                PopupWindow popupWindow = sVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.E.getParent() instanceof View) {
                    View view = (View) sVar3.E.getParent();
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(view);
                }
                sVar3.E.e();
                sVar3.H.d(null);
                sVar3.H = null;
                ViewGroup viewGroup = sVar3.K;
                WeakHashMap weakHashMap2 = i0.a;
                r0.y.c(viewGroup);
                break;
        }
    }
}
