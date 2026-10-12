package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class na implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na(int i10, Object obj, Object obj2) {
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
                la laVar = (la) obj;
                if (laVar != null) {
                    laVar.d.add((pa) obj2);
                    break;
                }
                break;
            case 1:
                h11 h11Var = (h11) obj2;
                h11Var.k = b6.update(h11Var.l, (View) obj, h11Var.k, h11Var.b);
                break;
            default:
                org.telegram.ui.Wallet.c3 c3Var = ((org.telegram.ui.Wallet.d3) obj2).m;
                if (c3Var != null) {
                    c3Var.setPaused(!r2.n);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                pa paVar = (pa) this.c;
                la laVar = (la) this.b;
                if (laVar != null) {
                    ArrayList arrayList = laVar.d;
                    arrayList.remove(paVar);
                    if (laVar.e.isEmpty() && arrayList.isEmpty()) {
                        laVar.n.a();
                    }
                }
                paVar.n = null;
                Paint paint = paVar.h;
                paVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                b6.release((View) this.b, ((h11) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) this.c;
                d3Var.f();
                d3Var.M = false;
                d3Var.N = 0L;
                d3Var.k();
                o1.k kVar = d3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    d3Var.Z = null;
                }
                d3Var.a0 = 1.0f;
                org.telegram.ui.Cells.x0 x0Var = d3Var.a;
                x0Var.invalidate();
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                }
                d3Var.l();
                org.telegram.ui.Wallet.k5 k5Var = d3Var.k;
                org.telegram.ui.Cells.x0 x0Var2 = (org.telegram.ui.Cells.x0) this.b;
                WeakHashMap weakHashMap = k5Var.e;
                weakHashMap.remove(x0Var2);
                if (weakHashMap.isEmpty()) {
                    k5Var.a();
                }
                org.telegram.ui.Wallet.c3 c3Var = d3Var.m;
                if (c3Var != null) {
                    c3Var.setPaused(true);
                }
                d3Var.l.stop();
                d3Var.H = false;
                break;
        }
    }
}
