package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class da implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da(int i7, Object obj, Object obj2) {
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
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    break;
                }
                break;
            case 1:
                wy0 wy0Var = (wy0) obj2;
                wy0Var.k = x5.update(wy0Var.l, (View) obj, wy0Var.k, wy0Var.b);
                break;
            default:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) obj2;
                org.telegram.ui.Wallet.m4 m4Var = n4Var.m;
                if (m4Var != null) {
                    m4Var.setPaused(!n4Var.n);
                }
                n4Var.a.isAttachedToWindow();
                int i10 = n4Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.ks.f(i10).n(n4Var.x0, 67);
                    }
                    n4Var.v0 = -1;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                fa faVar = (fa) this.c;
                ba baVar = (ba) this.b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.e.isEmpty() && arrayList.isEmpty()) {
                        baVar.n.o();
                    }
                }
                faVar.n = null;
                Paint paint = faVar.h;
                faVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                x5.release((View) this.b, ((wy0) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) this.c;
                org.telegram.ui.Cells.v0 v0Var = n4Var.a;
                n4Var.f();
                n4Var.M = false;
                n4Var.N = 0L;
                n4Var.k();
                r1.g gVar = n4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    n4Var.Z = null;
                }
                n4Var.a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                n4Var.l();
                org.telegram.ui.Wallet.z6 z6Var = n4Var.k;
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.b;
                WeakHashMap weakHashMap = z6Var.e;
                weakHashMap.remove(v0Var2);
                if (weakHashMap.isEmpty()) {
                    z6Var.a();
                }
                v0Var.isAttachedToWindow();
                int i7 = n4Var.v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ks.f(i7).n(n4Var.x0, 67);
                    }
                    n4Var.v0 = -1;
                }
                org.telegram.ui.Wallet.m4 m4Var = n4Var.m;
                if (m4Var != null) {
                    m4Var.setPaused(true);
                }
                n4Var.l.stop();
                n4Var.H = false;
                break;
        }
    }
}
