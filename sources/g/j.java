package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.j0;
import r0.o0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.o0, r0.n0
    public void b() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((i) obj).b.y.setVisibility(0);
                break;
            case 1:
                r rVar = (r) obj;
                rVar.y.setVisibility(0);
                if (rVar.y.getParent() instanceof View) {
                    View view = (View) rVar.y.getParent();
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
                r rVar = ((i) obj).b;
                rVar.y.setAlpha(1.0f);
                rVar.C.d(null);
                rVar.C = null;
                break;
            case 1:
                r rVar2 = (r) obj;
                rVar2.y.setAlpha(1.0f);
                rVar2.C.d(null);
                rVar2.C = null;
                break;
            default:
                r rVar3 = (r) ((xe.b) obj).c;
                rVar3.y.setVisibility(8);
                PopupWindow popupWindow = rVar3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (rVar3.y.getParent() instanceof View) {
                    View view = (View) rVar3.y.getParent();
                    WeakHashMap weakHashMap = j0.a;
                    r0.z.c(view);
                }
                rVar3.y.e();
                rVar3.C.d(null);
                rVar3.C = null;
                ViewGroup viewGroup = rVar3.F;
                WeakHashMap weakHashMap2 = j0.a;
                r0.z.c(viewGroup);
                break;
        }
    }
}
