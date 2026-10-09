package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class oa implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oa(int i10, Object obj, Object obj2) {
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
                ma maVar = (ma) obj;
                if (maVar != null) {
                    maVar.d.add((qa) obj2);
                    break;
                }
                break;
            case 1:
                l11 l11Var = (l11) obj2;
                l11Var.k = b6.update(l11Var.l, (View) obj, l11Var.k, l11Var.b);
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
                qa qaVar = (qa) this.c;
                ma maVar = (ma) this.b;
                if (maVar != null) {
                    ArrayList arrayList = maVar.d;
                    arrayList.remove(qaVar);
                    if (maVar.e.isEmpty() && arrayList.isEmpty()) {
                        maVar.n.a();
                    }
                }
                qaVar.n = null;
                Paint paint = qaVar.h;
                qaVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                b6.release((View) this.b, ((l11) this.c).k);
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
                org.telegram.ui.Cells.w0 w0Var = d3Var.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                d3Var.l();
                org.telegram.ui.Wallet.l5 l5Var = d3Var.k;
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) this.b;
                WeakHashMap weakHashMap = l5Var.e;
                weakHashMap.remove(w0Var2);
                if (weakHashMap.isEmpty()) {
                    l5Var.a();
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
