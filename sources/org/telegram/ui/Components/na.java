package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                i11 i11Var = (i11) obj2;
                i11Var.k = b6.update(i11Var.l, (View) obj, i11Var.k, i11Var.b);
                break;
            default:
                org.telegram.ui.Wallet.d3 d3Var = ((org.telegram.ui.Wallet.e3) obj2).m;
                if (d3Var != null) {
                    d3Var.setPaused(!r2.n);
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
                b6.release((View) this.b, ((i11) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) this.c;
                e3Var.f();
                e3Var.M = false;
                e3Var.N = 0L;
                e3Var.k();
                o1.k kVar = e3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    e3Var.Z = null;
                }
                e3Var.a0 = 1.0f;
                org.telegram.ui.Cells.w0 w0Var = e3Var.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                e3Var.l();
                org.telegram.ui.Wallet.m5 m5Var = e3Var.k;
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) this.b;
                WeakHashMap weakHashMap = m5Var.e;
                weakHashMap.remove(w0Var2);
                if (weakHashMap.isEmpty()) {
                    m5Var.a();
                }
                org.telegram.ui.Wallet.d3 d3Var = e3Var.m;
                if (d3Var != null) {
                    d3Var.setPaused(true);
                }
                e3Var.l.stop();
                e3Var.H = false;
                break;
        }
    }
}
