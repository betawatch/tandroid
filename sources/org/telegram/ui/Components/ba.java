package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ba implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ba(int i10, Object obj, Object obj2) {
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
                z9 z9Var = (z9) obj;
                if (z9Var != null) {
                    z9Var.d.add((da) obj2);
                    break;
                }
                break;
            default:
                pz0 pz0Var = (pz0) obj2;
                pz0Var.k = t5.update(pz0Var.l, (View) obj, pz0Var.k, pz0Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                da daVar = (da) this.c;
                z9 z9Var = (z9) this.b;
                if (z9Var != null) {
                    ArrayList arrayList = z9Var.d;
                    arrayList.remove(daVar);
                    if (z9Var.e.isEmpty() && arrayList.isEmpty()) {
                        z9Var.n.a();
                    }
                }
                daVar.n = null;
                Paint paint = daVar.h;
                daVar.o = null;
                paint.setShader(null);
                break;
            default:
                t5.release((View) this.b, ((pz0) this.c).k);
                break;
        }
    }
}
