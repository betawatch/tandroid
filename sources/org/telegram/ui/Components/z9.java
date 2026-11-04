package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z9(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                x9 x9Var = (x9) obj;
                if (x9Var != null) {
                    x9Var.d.add((ba) obj2);
                    break;
                }
                break;
            case 1:
                ly0 ly0Var = (ly0) obj2;
                ly0Var.k = p5.update(ly0Var.l, (View) obj, ly0Var.k, ly0Var.b);
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
                        org.telegram.messenger.hs.f(i10).n(b4Var.x0, 67);
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
                ba baVar = (ba) this.c;
                x9 x9Var = (x9) this.b;
                if (x9Var != null) {
                    ArrayList arrayList = x9Var.d;
                    arrayList.remove(baVar);
                    if (x9Var.e.isEmpty() && arrayList.isEmpty()) {
                        x9Var.n.o();
                    }
                }
                baVar.n = null;
                Paint paint = baVar.h;
                baVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                p5.release((View) this.b, ((ly0) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) this.c;
                org.telegram.ui.Cells.t0 t0Var = b4Var.a;
                b4Var.f();
                b4Var.M = false;
                b4Var.N = 0L;
                b4Var.k();
                q1.g gVar = b4Var.Z;
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
                int i3 = b4Var.v0;
                if (-1 != i3) {
                    if (i3 >= 0) {
                        org.telegram.messenger.hs.f(i3).n(b4Var.x0, 67);
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
