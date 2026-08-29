package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o0, r0.n0
    public void b() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((h) obj).b.y.setVisibility(0);
                break;
            case 1:
                q qVar = (q) obj;
                qVar.y.setVisibility(0);
                if (qVar.y.getParent() instanceof View) {
                    View view = (View) qVar.y.getParent();
                    WeakHashMap weakHashMap = j0.a;
                    r0.z.c(view);
                    break;
                }
                break;
        }
    }

    @Override // r0.n0
    public final void c() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                q qVar = ((h) obj).b;
                qVar.y.setAlpha(1.0f);
                qVar.C.d(null);
                qVar.C = null;
                break;
            case 1:
                q qVar2 = (q) obj;
                qVar2.y.setAlpha(1.0f);
                qVar2.C.d(null);
                qVar2.C = null;
                break;
            default:
                q qVar3 = (q) ((ze.b) obj).b;
                qVar3.y.setVisibility(8);
                PopupWindow popupWindow = qVar3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qVar3.y.getParent() instanceof View) {
                    View view = (View) qVar3.y.getParent();
                    WeakHashMap weakHashMap = j0.a;
                    r0.z.c(view);
                }
                qVar3.y.e();
                qVar3.C.d(null);
                qVar3.C = null;
                ViewGroup viewGroup = qVar3.F;
                WeakHashMap weakHashMap2 = j0.a;
                r0.z.c(viewGroup);
                break;
        }
    }
}
