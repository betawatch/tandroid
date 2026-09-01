package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                qVar.D.d(null);
                qVar.D = null;
                break;
            case 1:
                q qVar2 = (q) obj;
                qVar2.y.setAlpha(1.0f);
                qVar2.D.d(null);
                qVar2.D = null;
                break;
            default:
                q qVar3 = (q) ((f7.b) obj).c;
                qVar3.y.setVisibility(8);
                PopupWindow popupWindow = qVar3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qVar3.y.getParent() instanceof View) {
                    View view = (View) qVar3.y.getParent();
                    WeakHashMap weakHashMap = j0.a;
                    r0.z.c(view);
                }
                qVar3.y.e();
                qVar3.D.d(null);
                qVar3.D = null;
                ViewGroup viewGroup = qVar3.G;
                WeakHashMap weakHashMap2 = j0.a;
                r0.z.c(viewGroup);
                break;
        }
    }
}
