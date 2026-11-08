package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class aa implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aa(int i7, Object obj, Object obj2) {
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
                y9 y9Var = (y9) obj;
                if (y9Var != null) {
                    y9Var.d.add((ca) obj2);
                    break;
                }
                break;
            case 1:
                my0 my0Var = (my0) obj2;
                my0Var.k = r5.update(my0Var.l, (View) obj, my0Var.k, my0Var.b);
                break;
            default:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) obj2;
                org.telegram.ui.Wallet.b4 b4Var = c4Var.m;
                if (b4Var != null) {
                    b4Var.setPaused(!c4Var.n);
                }
                c4Var.a.isAttachedToWindow();
                int i10 = c4Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(c4Var.x0, 67);
                    }
                    c4Var.v0 = -1;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ca caVar = (ca) this.c;
                y9 y9Var = (y9) this.b;
                if (y9Var != null) {
                    ArrayList arrayList = y9Var.d;
                    arrayList.remove(caVar);
                    if (y9Var.e.isEmpty() && arrayList.isEmpty()) {
                        y9Var.n.o();
                    }
                }
                caVar.n = null;
                Paint paint = caVar.h;
                caVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                r5.release((View) this.b, ((my0) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) this.c;
                org.telegram.ui.Cells.t0 t0Var = c4Var.a;
                c4Var.f();
                c4Var.M = false;
                c4Var.N = 0L;
                c4Var.k();
                r1.g gVar = c4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    c4Var.Z = null;
                }
                c4Var.a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                c4Var.l();
                org.telegram.ui.Wallet.h6 h6Var = c4Var.k;
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.b;
                WeakHashMap weakHashMap = h6Var.e;
                weakHashMap.remove(t0Var2);
                if (weakHashMap.isEmpty()) {
                    h6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = c4Var.v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(c4Var.x0, 67);
                    }
                    c4Var.v0 = -1;
                }
                org.telegram.ui.Wallet.b4 b4Var = c4Var.m;
                if (b4Var != null) {
                    b4Var.setPaused(true);
                }
                c4Var.l.stop();
                c4Var.H = false;
                break;
        }
    }
}
