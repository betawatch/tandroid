package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                q11 q11Var = (q11) obj2;
                q11Var.k = c6.update(q11Var.l, (View) obj, q11Var.k, q11Var.b);
                break;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj2;
                org.telegram.ui.Wallet.l3 l3Var = m3Var.m;
                if (l3Var != null) {
                    l3Var.setPaused(!m3Var.n);
                }
                m3Var.a.isAttachedToWindow();
                int i11 = m3Var.v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        NotificationCenter.getInstance(i11).removeObserver(m3Var.x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.v0 = -1;
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
                c6.release((View) this.b, ((q11) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.c;
                org.telegram.ui.Cells.v0 v0Var = m3Var.a;
                m3Var.f();
                m3Var.M = false;
                m3Var.N = 0L;
                m3Var.k();
                o1.j jVar = m3Var.Z;
                if (jVar != null) {
                    jVar.c();
                    m3Var.Z = null;
                }
                m3Var.a0 = 1.0f;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                }
                m3Var.l();
                org.telegram.ui.Wallet.x5 x5Var = m3Var.k;
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.b;
                WeakHashMap weakHashMap = x5Var.e;
                weakHashMap.remove(v0Var2);
                if (weakHashMap.isEmpty()) {
                    x5Var.a();
                }
                v0Var.isAttachedToWindow();
                int i10 = m3Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        NotificationCenter.getInstance(i10).removeObserver(m3Var.x0, NotificationCenter.userInfoDidLoad);
                    }
                    m3Var.v0 = -1;
                }
                org.telegram.ui.Wallet.l3 l3Var = m3Var.m;
                if (l3Var != null) {
                    l3Var.setPaused(true);
                }
                m3Var.l.stop();
                m3Var.H = false;
                break;
        }
    }
}
