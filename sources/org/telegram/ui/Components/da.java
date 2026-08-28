package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class da implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i9 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    break;
                }
                break;
            default:
                nz0 nz0Var = (nz0) obj2;
                nz0Var.k = t5.update(nz0Var.l, (View) obj, nz0Var.k, nz0Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                fa faVar = (fa) this.c;
                ba baVar = (ba) this.b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.e.isEmpty() && arrayList.isEmpty()) {
                        baVar.n.a();
                    }
                }
                faVar.n = null;
                Paint paint = faVar.h;
                faVar.o = null;
                paint.setShader(null);
                break;
            default:
                t5.release((View) this.b, ((nz0) this.c).k);
                break;
        }
    }
}
