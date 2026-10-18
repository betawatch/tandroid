package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj2;
                org.telegram.ui.Wallet.l3 l3Var = m3Var.m;
                if (l3Var != null) {
                    l3Var.setPaused(!m3Var.n);
                }
                m3Var.u();
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
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.c;
                m3Var.g();
                m3Var.M = false;
                m3Var.N = 0L;
                m3Var.m();
                o1.k kVar = m3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    m3Var.Z = null;
                }
                m3Var.a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = m3Var.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                m3Var.n();
                org.telegram.ui.Wallet.y5 y5Var = m3Var.k;
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) this.b;
                WeakHashMap weakHashMap = y5Var.e;
                weakHashMap.remove(w0Var2);
                if (weakHashMap.isEmpty()) {
                    y5Var.a();
                }
                m3Var.u();
                org.telegram.ui.Wallet.l3 l3Var = m3Var.m;
                if (l3Var != null) {
                    l3Var.setPaused(true);
                }
                m3Var.l.stop();
                m3Var.H = false;
                break;
        }
    }
}
