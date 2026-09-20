package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ka implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka(int i10, Object obj, Object obj2) {
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
                ia iaVar = (ia) obj;
                if (iaVar != null) {
                    iaVar.d.add((ma) obj2);
                    break;
                }
                break;
            default:
                u01 u01Var = (u01) obj2;
                u01Var.k = y5.update(u01Var.l, (View) obj, u01Var.k, u01Var.b);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                ma maVar = (ma) this.c;
                ia iaVar = (ia) this.b;
                if (iaVar != null) {
                    ArrayList arrayList = iaVar.d;
                    arrayList.remove(maVar);
                    if (iaVar.e.isEmpty() && arrayList.isEmpty()) {
                        iaVar.n.a();
                    }
                }
                maVar.n = null;
                Paint paint = maVar.h;
                maVar.o = null;
                paint.setShader(null);
                break;
            default:
                y5.release((View) this.b, ((u01) this.c).k);
                break;
        }
    }
}
