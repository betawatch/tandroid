package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ja implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ja(int i10, Object obj, Object obj2) {
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
                ha haVar = (ha) obj;
                if (haVar != null) {
                    haVar.d.add((la) obj2);
                    break;
                }
                break;
            default:
                g01 g01Var = (g01) obj2;
                g01Var.k = x5.update(g01Var.l, (View) obj, g01Var.k, g01Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                la laVar = (la) this.c;
                ha haVar = (ha) this.b;
                if (haVar != null) {
                    ArrayList arrayList = haVar.d;
                    arrayList.remove(laVar);
                    if (haVar.e.isEmpty() && arrayList.isEmpty()) {
                        haVar.n.a();
                    }
                }
                laVar.n = null;
                Paint paint = laVar.h;
                laVar.o = null;
                paint.setShader(null);
                break;
            default:
                x5.release((View) this.b, ((g01) this.c).k);
                break;
        }
    }
}
