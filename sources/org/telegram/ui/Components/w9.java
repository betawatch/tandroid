package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w9(int i7, Object obj, Object obj2) {
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
                u9 u9Var = (u9) obj;
                if (u9Var != null) {
                    u9Var.d.add((y9) obj2);
                    break;
                }
                break;
            case 1:
                oy0 oy0Var = (oy0) obj2;
                oy0Var.k = p5.update(oy0Var.l, (View) obj, oy0Var.k, oy0Var.b);
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
                        org.telegram.messenger.ns.f(i10).n(c4Var.x0, 67);
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
                y9 y9Var = (y9) this.c;
                u9 u9Var = (u9) this.b;
                if (u9Var != null) {
                    ArrayList arrayList = u9Var.d;
                    arrayList.remove(y9Var);
                    if (u9Var.e.isEmpty() && arrayList.isEmpty()) {
                        u9Var.n.o();
                    }
                }
                y9Var.n = null;
                Paint paint = y9Var.h;
                y9Var.o = null;
                paint.setShader(null);
                break;
            case 1:
                p5.release((View) this.b, ((oy0) this.c).k);
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
                org.telegram.ui.Wallet.i6 i6Var = c4Var.k;
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.b;
                WeakHashMap weakHashMap = i6Var.e;
                weakHashMap.remove(t0Var2);
                if (weakHashMap.isEmpty()) {
                    i6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = c4Var.v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.ns.f(i7).n(c4Var.x0, 67);
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
