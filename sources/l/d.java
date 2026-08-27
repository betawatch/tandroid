package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.g0;
import m.h0;
import m.k2;
import m.n0;
import m.q0;
import org.telegram.ui.Components.oc0;
import r0.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                ArrayList arrayList = fVar.n;
                if (fVar.a() && arrayList.size() > 0 && !((e) arrayList.get(0)).a.J) {
                    View view = fVar.A;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            ((e) obj2).a.g();
                        }
                        break;
                    } else {
                        fVar.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                d0 d0Var = (d0) obj;
                k2 k2Var = d0Var.n;
                if (d0Var.a() && !k2Var.J) {
                    View view2 = d0Var.x;
                    if (view2 != null && view2.isShown()) {
                        k2Var.g();
                        break;
                    } else {
                        d0Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                q0 q0Var = (q0) obj;
                if (!q0Var.getInternalPopup().a()) {
                    q0Var.f.m(h0.b(q0Var), h0.a(q0Var));
                }
                ViewTreeObserver viewTreeObserver = q0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    g0.a(viewTreeObserver, this);
                    break;
                }
                break;
            case 3:
                n0 n0Var = (n0) obj;
                q0 q0Var2 = n0Var.S;
                n0Var.getClass();
                WeakHashMap weakHashMap = j0.a;
                if (!q0Var2.isAttachedToWindow() || !q0Var2.getGlobalVisibleRect(n0Var.Q)) {
                    n0Var.dismiss();
                    break;
                } else {
                    n0Var.r();
                    n0Var.g();
                    break;
                }
                break;
            default:
                oc0 oc0Var = (oc0) obj;
                oc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                oc0Var.h = oc0Var.e.getCurrentItem();
                oc0.a(oc0Var, oc0Var.h, 0);
                break;
        }
    }
}
