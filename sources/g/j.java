package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
import r0.n0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.n0, r0.m0
    public void b() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((h) obj).b.D.setVisibility(0);
                break;
            case 1:
                s sVar = (s) obj;
                sVar.D.setVisibility(0);
                if (sVar.D.getParent() instanceof View) {
                    View view = (View) sVar.D.getParent();
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(view);
                    break;
                }
                break;
        }
    }

    @Override // r0.m0
    public final void c() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                s sVar = ((h) obj).b;
                sVar.D.setAlpha(1.0f);
                sVar.G.d(null);
                sVar.G = null;
                break;
            case 1:
                s sVar2 = (s) obj;
                sVar2.D.setAlpha(1.0f);
                sVar2.G.d(null);
                sVar2.G = null;
                break;
            default:
                s sVar3 = (s) ((q4.q) obj).c;
                sVar3.D.setVisibility(8);
                PopupWindow popupWindow = sVar3.E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (sVar3.D.getParent() instanceof View) {
                    View view = (View) sVar3.D.getParent();
                    WeakHashMap weakHashMap = i0.a;
                    r0.y.c(view);
                }
                sVar3.D.e();
                sVar3.G.d(null);
                sVar3.G = null;
                ViewGroup viewGroup = sVar3.J;
                WeakHashMap weakHashMap2 = i0.a;
                r0.y.c(viewGroup);
                break;
        }
    }
}
