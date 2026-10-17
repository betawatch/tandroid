package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements zf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp0 b;

    public /* synthetic */ go0(jp0 jp0Var, int i10) {
        this.a = i10;
        this.b = jp0Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        jp0 jp0Var = this.b;
        jp0Var.b0 = defaultWindowInsets;
        uo0 uo0Var = jp0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = uo0Var.getPaddingTop();
        i0.c cVar = jp0Var.b0;
        uo0Var.setPadding(i10, paddingTop, cVar.c, AndroidUtilities.dp(72.0f) + cVar.d);
        uo0 uo0Var2 = jp0Var.n.b;
        int i11 = jp0Var.b0.a;
        int paddingTop2 = uo0Var2.getPaddingTop();
        i0.c cVar2 = jp0Var.b0;
        uo0Var2.setPadding(i11, paddingTop2, cVar2.c, AndroidUtilities.dp(72.0f) + cVar2.d);
        FrameLayout frameLayout = jp0Var.P;
        i0.c cVar3 = jp0Var.b0;
        frameLayout.setPadding(cVar3.a, 0, cVar3.c, cVar3.d);
        return r0.k1.b;
    }

    @Override // zf.a0
    public void a(int i10) {
        jp0 jp0Var = this.b;
        gh.d dVar = jp0Var.g0;
        ArrayList arrayList = jp0Var.k0;
        bh.f fVar = jp0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || fVar == null) {
            return;
        }
        ArrayList arrayList2 = jp0Var.j0;
        int a2 = zf.e0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = jp0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.r.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.r.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(jp0Var.d.getHeight(), rectF.bottom);
        }
        fVar.g(a2, arrayList);
        if (fVar.e(jp0Var.i0, jp0Var.d.getWidth(), jp0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = jp0Var.d0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                this.b.finishFragment();
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
