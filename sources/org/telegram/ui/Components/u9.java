package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u9(int i10, Object obj, Object obj2) {
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
                s9 s9Var = (s9) obj;
                if (s9Var != null) {
                    s9Var.d.add((w9) obj2);
                    break;
                }
                break;
            case 1:
                qz0 qz0Var = (qz0) obj2;
                qz0Var.k = o5.update(qz0Var.l, (View) obj, qz0Var.k, qz0Var.b);
                break;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj2;
                org.telegram.ui.Wallet.c4 c4Var = d4Var.m;
                if (c4Var != null) {
                    c4Var.setPaused(!d4Var.n);
                }
                d4Var.a.isAttachedToWindow();
                int i11 = d4Var.v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        org.telegram.messenger.zs.f(i11).n(d4Var.x0, 67);
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
                w9 w9Var = (w9) this.c;
                s9 s9Var = (s9) this.b;
                if (s9Var != null) {
                    ArrayList arrayList = s9Var.d;
                    arrayList.remove(w9Var);
                    if (s9Var.e.isEmpty() && arrayList.isEmpty()) {
                        s9Var.n.c();
                    }
                }
                w9Var.n = null;
                Paint paint = w9Var.h;
                w9Var.o = null;
                paint.setShader(null);
                break;
            case 1:
                o5.release((View) this.b, ((qz0) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.c;
                org.telegram.ui.Cells.s0 s0Var = d4Var.a;
                d4Var.f();
                d4Var.M = false;
                d4Var.N = 0L;
                d4Var.k();
                o1.j jVar = d4Var.Z;
                if (jVar != null) {
                    jVar.d();
                    d4Var.Z = null;
                }
                d4Var.a0 = 1.0f;
                s0Var.invalidate();
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                }
                d4Var.l();
                org.telegram.ui.Wallet.m6 m6Var = d4Var.k;
                org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) this.b;
                WeakHashMap weakHashMap = m6Var.e;
                weakHashMap.remove(s0Var2);
                if (weakHashMap.isEmpty()) {
                    m6Var.a();
                }
                s0Var.isAttachedToWindow();
                int i10 = d4Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        org.telegram.messenger.zs.f(i10).n(d4Var.x0, 67);
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
