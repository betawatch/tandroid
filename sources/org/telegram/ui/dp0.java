package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements zf.b0, r0.o, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gq0 b;

    public /* synthetic */ dp0(gq0 gq0Var, int i10) {
        this.a = i10;
        this.b = gq0Var;
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        gq0 gq0Var = this.b;
        gq0Var.b0 = defaultWindowInsets;
        rp0 rp0Var = gq0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = rp0Var.getPaddingTop();
        i0.b bVar = gq0Var.b0;
        rp0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        rp0 rp0Var2 = gq0Var.n.b;
        int i11 = gq0Var.b0.a;
        int paddingTop2 = rp0Var2.getPaddingTop();
        i0.b bVar2 = gq0Var.b0;
        rp0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = gq0Var.P;
        i0.b bVar3 = gq0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
    }

    @Override // zf.b0
    public void a(int i10) {
        gq0 gq0Var = this.b;
        gh.d dVar = gq0Var.g0;
        ArrayList arrayList = gq0Var.k0;
        bh.f fVar = gq0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || fVar == null) {
            return;
        }
        ArrayList arrayList2 = gq0Var.j0;
        int a2 = zf.f0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = gq0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.s.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.s.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(gq0Var.d.getHeight(), rectF.bottom);
        }
        fVar.g(a2, arrayList);
        if (fVar.e(gq0Var.i0, gq0Var.d.getWidth(), gq0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = gq0Var.d0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
