package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ea implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                ca caVar = (ca) obj;
                if (caVar != null) {
                    caVar.d.add((ga) obj2);
                    break;
                }
                break;
            case 1:
                vy0 vy0Var = (vy0) obj2;
                vy0Var.k = x5.update(vy0Var.l, (View) obj, vy0Var.k, vy0Var.b);
                break;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) obj2;
                org.telegram.ui.Wallet.l4 l4Var = m4Var.m;
                if (l4Var != null) {
                    l4Var.setPaused(!m4Var.n);
                }
                m4Var.a.isAttachedToWindow();
                int i10 = m4Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.ks.f(i10).n(m4Var.x0, 67);
                    }
                    m4Var.v0 = -1;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.c;
                ca caVar = (ca) this.b;
                if (caVar != null) {
                    ArrayList arrayList = caVar.d;
                    arrayList.remove(gaVar);
                    if (caVar.e.isEmpty() && arrayList.isEmpty()) {
                        caVar.n.o();
                    }
                }
                gaVar.n = null;
                Paint paint = gaVar.h;
                gaVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                x5.release((View) this.b, ((vy0) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) this.c;
                org.telegram.ui.Cells.u0 u0Var = m4Var.a;
                m4Var.f();
                m4Var.M = false;
                m4Var.N = 0L;
                m4Var.k();
                r1.g gVar = m4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    m4Var.Z = null;
                }
                m4Var.a0 = 1.0f;
                u0Var.invalidate();
                if (u0Var.getParent() instanceof View) {
                    ((View) u0Var.getParent()).invalidate();
                }
                m4Var.l();
                org.telegram.ui.Wallet.y6 y6Var = m4Var.k;
                org.telegram.ui.Cells.u0 u0Var2 = (org.telegram.ui.Cells.u0) this.b;
                WeakHashMap weakHashMap = y6Var.e;
                weakHashMap.remove(u0Var2);
                if (weakHashMap.isEmpty()) {
                    y6Var.a();
                }
                u0Var.isAttachedToWindow();
                int i7 = m4Var.v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ks.f(i7).n(m4Var.x0, 67);
                    }
                    m4Var.v0 = -1;
                }
                org.telegram.ui.Wallet.l4 l4Var = m4Var.m;
                if (l4Var != null) {
                    l4Var.setPaused(true);
                }
                m4Var.l.stop();
                m4Var.H = false;
                break;
        }
    }
}
