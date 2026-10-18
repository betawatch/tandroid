package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                org.telegram.ui.Wallet.l3 l3Var = (org.telegram.ui.Wallet.l3) obj2;
                org.telegram.ui.Wallet.k3 k3Var = l3Var.m;
                if (k3Var != null) {
                    k3Var.setPaused(!l3Var.n);
                }
                l3Var.u();
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
                org.telegram.ui.Wallet.l3 l3Var = (org.telegram.ui.Wallet.l3) this.c;
                l3Var.g();
                l3Var.M = false;
                l3Var.N = 0L;
                l3Var.m();
                o1.k kVar = l3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    l3Var.Z = null;
                }
                l3Var.a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = l3Var.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                l3Var.n();
                org.telegram.ui.Wallet.c6 c6Var = l3Var.k;
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) this.b;
                WeakHashMap weakHashMap = c6Var.e;
                weakHashMap.remove(w0Var2);
                if (weakHashMap.isEmpty()) {
                    c6Var.a();
                }
                l3Var.u();
                org.telegram.ui.Wallet.k3 k3Var = l3Var.m;
                if (k3Var != null) {
                    k3Var.setPaused(true);
                }
                l3Var.l.stop();
                l3Var.H = false;
                break;
        }
    }
}
