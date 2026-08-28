package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // r0.o0, r0.n0
    public void b() {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
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
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
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
                q qVar3 = (q) ((we.b) obj).c;
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
