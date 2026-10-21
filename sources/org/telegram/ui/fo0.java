package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo0 implements zf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip0 b;

    public /* synthetic */ fo0(ip0 ip0Var, int i10) {
        this.a = i10;
        this.b = ip0Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ip0 ip0Var = this.b;
        ip0Var.b0 = defaultWindowInsets;
        to0 to0Var = ip0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = to0Var.getPaddingTop();
        i0.b bVar = ip0Var.b0;
        to0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        to0 to0Var2 = ip0Var.n.b;
        int i11 = ip0Var.b0.a;
        int paddingTop2 = to0Var2.getPaddingTop();
        i0.b bVar2 = ip0Var.b0;
        to0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = ip0Var.P;
        i0.b bVar3 = ip0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.k1.b;
    }

    @Override // zf.a0
    public void a(int i10) {
        ip0 ip0Var = this.b;
        gh.d dVar = ip0Var.g0;
        ArrayList arrayList = ip0Var.k0;
        bh.f fVar = ip0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || fVar == null) {
            return;
        }
        ArrayList arrayList2 = ip0Var.j0;
        int a2 = zf.f0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = ip0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.r.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.r.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(ip0Var.d.getHeight(), rectF.bottom);
        }
        fVar.g(a2, arrayList);
        if (fVar.e(ip0Var.i0, ip0Var.d.getWidth(), ip0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = ip0Var.d0.iterator();
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
