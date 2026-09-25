package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ po0(tp0 tp0Var, int i10) {
        this.a = i10;
        this.b = tp0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        tp0 tp0Var = this.b;
        tp0Var.b0 = defaultWindowInsets;
        ep0 ep0Var = tp0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = ep0Var.getPaddingTop();
        i0.b bVar = tp0Var.b0;
        ep0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        ep0 ep0Var2 = tp0Var.n.b;
        int i11 = tp0Var.b0.a;
        int paddingTop2 = ep0Var2.getPaddingTop();
        i0.b bVar2 = tp0Var.b0;
        ep0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = tp0Var.P;
        i0.b bVar3 = tp0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        tp0 tp0Var = this.b;
        fh.d dVar = tp0Var.g0;
        ArrayList arrayList = tp0Var.k0;
        ah.h hVar = tp0Var.f0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || hVar == null) {
            return;
        }
        ArrayList arrayList2 = tp0Var.j0;
        int a2 = yf.e0.a(arrayList2, (i11 < 29 || dVar == null) ? 0 : dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2), arrayList);
        int measuredWidth = tp0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f7 = measuredWidth;
            rectF.left = w7.q.a(rectF.left, 0.0f, f7);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = w7.q.a(rectF.right, 0.0f, f7);
            rectF.bottom = Math.min(tp0Var.d.getHeight(), rectF.bottom);
        }
        hVar.g(a2, arrayList);
        if (hVar.e(tp0Var.i0, tp0Var.d.getWidth(), tp0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.f();
            }
            Iterator it = tp0Var.d0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
