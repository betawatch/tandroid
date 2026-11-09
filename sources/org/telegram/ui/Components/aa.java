package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ny0 ny0Var = (ny0) obj2;
                ny0Var.k = r5.update(ny0Var.l, (View) obj, ny0Var.k, ny0Var.b);
                break;
            default:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) obj2;
                org.telegram.ui.Wallet.a4 a4Var = b4Var.m;
                if (a4Var != null) {
                    a4Var.setPaused(!b4Var.n);
                }
                b4Var.a.isAttachedToWindow();
                int i10 = b4Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(b4Var.x0, 67);
                    }
                    b4Var.v0 = -1;
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
                r5.release((View) this.b, ((ny0) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) this.c;
                org.telegram.ui.Cells.t0 t0Var = b4Var.a;
                b4Var.f();
                b4Var.M = false;
                b4Var.N = 0L;
                b4Var.k();
                r1.g gVar = b4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    b4Var.Z = null;
                }
                b4Var.a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                b4Var.l();
                org.telegram.ui.Wallet.g6 g6Var = b4Var.k;
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.b;
                WeakHashMap weakHashMap = g6Var.e;
                weakHashMap.remove(t0Var2);
                if (weakHashMap.isEmpty()) {
                    g6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = b4Var.v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(b4Var.x0, 67);
                    }
                    b4Var.v0 = -1;
                }
                org.telegram.ui.Wallet.a4 a4Var = b4Var.m;
                if (a4Var != null) {
                    a4Var.setPaused(true);
                }
                b4Var.l.stop();
                b4Var.H = false;
                break;
        }
    }
}
