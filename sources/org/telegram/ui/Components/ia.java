package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ia implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ia(int i10, Object obj, Object obj2) {
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
                ga gaVar = (ga) obj;
                if (gaVar != null) {
                    gaVar.d.add((ka) obj2);
                    break;
                }
                break;
            default:
                zz0 zz0Var = (zz0) obj2;
                zz0Var.k = y5.update(zz0Var.l, (View) obj, zz0Var.k, zz0Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ka kaVar = (ka) this.c;
                ga gaVar = (ga) this.b;
                if (gaVar != null) {
                    ArrayList arrayList = gaVar.d;
                    arrayList.remove(kaVar);
                    if (gaVar.e.isEmpty() && arrayList.isEmpty()) {
                        gaVar.n.a();
                    }
                }
                kaVar.n = null;
                Paint paint = kaVar.h;
                kaVar.o = null;
                paint.setShader(null);
                break;
            default:
                y5.release((View) this.b, ((zz0) this.c).k);
                break;
        }
    }
}
