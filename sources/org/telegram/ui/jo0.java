package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo0 implements zf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ jo0(lp0 lp0Var, int i10) {
        this.a = i10;
        this.b = lp0Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        lp0 lp0Var = this.b;
        lp0Var.b0 = defaultWindowInsets;
        wo0 wo0Var = lp0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = wo0Var.getPaddingTop();
        i0.b bVar = lp0Var.b0;
        wo0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        wo0 wo0Var2 = lp0Var.n.b;
        int i11 = lp0Var.b0.a;
        int paddingTop2 = wo0Var2.getPaddingTop();
        i0.b bVar2 = lp0Var.b0;
        wo0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = lp0Var.P;
        i0.b bVar3 = lp0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.k1.b;
    }

    @Override // zf.a0
    public void a(int i10) {
        lp0 lp0Var = this.b;
        gh.d dVar = lp0Var.g0;
        ArrayList arrayList = lp0Var.k0;
        bh.f fVar = lp0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || fVar == null) {
            return;
        }
        ArrayList arrayList2 = lp0Var.j0;
        int a2 = zf.f0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = lp0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.r.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.r.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(lp0Var.d.getHeight(), rectF.bottom);
        }
        fVar.g(a2, arrayList);
        if (fVar.e(lp0Var.i0, lp0Var.d.getWidth(), lp0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.f();
            }
            Iterator it = lp0Var.d0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
