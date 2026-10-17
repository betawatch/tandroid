package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class la implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ la(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    break;
                }
                break;
            case 1:
                d11 d11Var = (d11) obj2;
                d11Var.k = a6.update(d11Var.l, (View) obj, d11Var.k, d11Var.b);
                break;
            default:
                org.telegram.ui.Wallet.k3 k3Var = (org.telegram.ui.Wallet.k3) obj2;
                org.telegram.ui.Wallet.j3 j3Var = k3Var.m;
                if (j3Var != null) {
                    j3Var.setPaused(!k3Var.n);
                }
                k3Var.u();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                na naVar = (na) this.c;
                ja jaVar = (ja) this.b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.n.a();
                    }
                }
                naVar.n = null;
                Paint paint = naVar.h;
                naVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                a6.release((View) this.b, ((d11) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.k3 k3Var = (org.telegram.ui.Wallet.k3) this.c;
                k3Var.g();
                k3Var.M = false;
                k3Var.N = 0L;
                k3Var.m();
                o1.k kVar = k3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    k3Var.Z = null;
                }
                k3Var.a0 = 1.0f;
                org.telegram.ui.Cells.x0 x0Var = k3Var.a;
                x0Var.invalidate();
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                }
                k3Var.n();
                org.telegram.ui.Wallet.z5 z5Var = k3Var.k;
                org.telegram.ui.Cells.x0 x0Var2 = (org.telegram.ui.Cells.x0) this.b;
                WeakHashMap weakHashMap = z5Var.e;
                weakHashMap.remove(x0Var2);
                if (weakHashMap.isEmpty()) {
                    z5Var.a();
                }
                k3Var.u();
                org.telegram.ui.Wallet.j3 j3Var = k3Var.m;
                if (j3Var != null) {
                    j3Var.setPaused(true);
                }
                k3Var.l.stop();
                k3Var.H = false;
                break;
        }
    }
}
