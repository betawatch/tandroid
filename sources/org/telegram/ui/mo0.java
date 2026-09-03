package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo0 implements lf.d0, r0.o, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public /* synthetic */ mo0(np0 np0Var, int i10) {
        this.a = i10;
        this.b = np0Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        np0 np0Var = this.b;
        np0Var.Y = defaultWindowInsets;
        yo0 yo0Var = np0Var.h.b;
        int i10 = defaultWindowInsets.a;
        int paddingTop = yo0Var.getPaddingTop();
        i0.b bVar = np0Var.Y;
        yo0Var.setPadding(i10, paddingTop, bVar.c, AndroidUtilities.dp(72.0f) + bVar.d);
        yo0 yo0Var2 = np0Var.n.b;
        int i11 = np0Var.Y.a;
        int paddingTop2 = yo0Var2.getPaddingTop();
        i0.b bVar2 = np0Var.Y;
        yo0Var2.setPadding(i11, paddingTop2, bVar2.c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = np0Var.M;
        i0.b bVar3 = np0Var.Y;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.m1.b;
    }

    @Override // lf.d0
    public void a(int i10) {
        np0 np0Var = this.b;
        tg.d dVar = np0Var.d0;
        ArrayList arrayList = np0Var.h0;
        og.e eVar = np0Var.c0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || eVar == null) {
            return;
        }
        ArrayList arrayList2 = np0Var.g0;
        int a2 = lf.l0.a((i11 < 29 || dVar == null) ? 0 : dVar.d(arrayList2, 0, AndroidUtilities.dp(8.0f)), arrayList2, arrayList);
        int measuredWidth = np0Var.d.getMeasuredWidth();
        for (int i12 = 0; i12 < a2; i12++) {
            RectF rectF = (RectF) arrayList.get(i12);
            float f10 = measuredWidth;
            rectF.left = k7.o.a(rectF.left, 0.0f, f10);
            rectF.top = Math.max(0.0f, rectF.top);
            rectF.right = k7.o.a(rectF.right, 0.0f, f10);
            rectF.bottom = Math.min(np0Var.d.getHeight(), rectF.bottom);
        }
        eVar.g(a2, arrayList);
        if (eVar.e(np0Var.f0, np0Var.d.getWidth(), np0Var.d.getHeight())) {
            if (dVar != null) {
                dVar.e();
            }
            Iterator it = np0Var.a0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
