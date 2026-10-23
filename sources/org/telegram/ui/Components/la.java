package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class la implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ la(int i10, Object obj, Object obj2) {
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
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    break;
                }
                break;
            case 1:
                f11 f11Var = (f11) obj2;
                f11Var.k = a6.update(f11Var.l, (View) obj, f11Var.k, f11Var.b);
                break;
            default:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj2;
                org.telegram.ui.Wallet.m3 m3Var = n3Var.m;
                if (m3Var != null) {
                    m3Var.setPaused(!n3Var.n);
                }
                n3Var.a.isAttachedToWindow();
                int i11 = n3Var.v0;
                if (-1 != i11) {
                    if (i11 >= 0) {
                        NotificationCenter.getInstance(i11).removeObserver(n3Var.x0, NotificationCenter.userInfoDidLoad);
                    }
                    n3Var.v0 = -1;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                na naVar = (na) this.c;
                ja jaVar = (ja) this.b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.n.a();
                    }
                }
                naVar.n = null;
                Paint paint = naVar.h;
                naVar.o = null;
                paint.setShader(null);
                break;
            case 1:
                a6.release((View) this.b, ((f11) this.c).k);
                break;
            default:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) this.c;
                org.telegram.ui.Cells.w0 w0Var = n3Var.a;
                n3Var.f();
                n3Var.M = false;
                n3Var.N = 0L;
                n3Var.k();
                o1.k kVar = n3Var.Z;
                if (kVar != null) {
                    kVar.c();
                    n3Var.Z = null;
                }
                n3Var.a0 = 1.0f;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                }
                n3Var.l();
                org.telegram.ui.Wallet.y5 y5Var = n3Var.k;
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) this.b;
                WeakHashMap weakHashMap = y5Var.e;
                weakHashMap.remove(w0Var2);
                if (weakHashMap.isEmpty()) {
                    y5Var.a();
                }
                w0Var.isAttachedToWindow();
                int i10 = n3Var.v0;
                if (-1 != i10) {
                    if (i10 >= 0) {
                        NotificationCenter.getInstance(i10).removeObserver(n3Var.x0, NotificationCenter.userInfoDidLoad);
                    }
                    n3Var.v0 = -1;
                }
                org.telegram.ui.Wallet.m3 m3Var = n3Var.m;
                if (m3Var != null) {
                    m3Var.setPaused(true);
                }
                n3Var.l.stop();
                n3Var.H = false;
                break;
        }
    }
}
