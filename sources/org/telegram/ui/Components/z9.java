package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z9(int i7, Object obj, Object obj2) {
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
                x9 x9Var = (x9) obj;
                if (x9Var != null) {
                    x9Var.d.add((ba) obj2);
                    break;
                }
                break;
            case 1:
                my0 my0Var = (my0) obj2;
                my0Var.k = q5.update(my0Var.l, (View) obj, my0Var.k, my0Var.b);
                break;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj2;
                org.telegram.ui.Wallet.c4 c4Var = d4Var.m;
                if (c4Var != null) {
                    c4Var.setPaused(!d4Var.n);
                }
                d4Var.a.isAttachedToWindow();
                int i10 = d4Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.qs.f(i10).n(d4Var.x0, 67);
                    }
                    d4Var.v0 = -1;
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
                q5.release((View) this.b, ((my0) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.c;
                org.telegram.ui.Cells.t0 t0Var = d4Var.a;
                d4Var.f();
                d4Var.M = false;
                d4Var.N = 0L;
                d4Var.k();
                r1.g gVar = d4Var.Z;
                if (gVar != null) {
                    gVar.d();
                    d4Var.Z = null;
                }
                d4Var.a0 = 1.0f;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                }
                d4Var.l();
                org.telegram.ui.Wallet.j6 j6Var = d4Var.k;
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.b;
                WeakHashMap weakHashMap = j6Var.e;
                weakHashMap.remove(t0Var2);
                if (weakHashMap.isEmpty()) {
                    j6Var.a();
                }
                t0Var.isAttachedToWindow();
                int i7 = d4Var.v0;
                if (-1 != i7) {
                    if (i7 >= 0) {
                        org.telegram.messenger.qs.f(i7).n(d4Var.x0, 67);
                    }
                    d4Var.v0 = -1;
                }
                org.telegram.ui.Wallet.c4 c4Var = d4Var.m;
                if (c4Var != null) {
                    c4Var.setPaused(true);
                }
                d4Var.l.stop();
                d4Var.H = false;
                break;
        }
    }
}
