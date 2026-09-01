package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ip implements org.telegram.ui.ActionBar.l6 {
    public boolean a = false;
    public final /* synthetic */ mp b;

    public ip(mp mpVar) {
        this.b = mpVar;
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void a(float f10) {
        ArrayList arrayList;
        mp mpVar = this.b;
        kp kpVar = mpVar.h;
        if (f10 == 0.0f && !this.a) {
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lp) obj).c = mpVar.K ? 1 : 0;
                }
            }
            if (!mpVar.M) {
                for (int i11 = 0; i11 < kpVar.h(); i11++) {
                    ((lp) kpVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        ij0 ij0Var = mpVar.C;
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        ij0Var.setColorFilter(new PorterDuffColorFilter(mpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        mpVar.setOverlayNavBarColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        if (mpVar.M) {
            for (int i13 = 0; i13 < kpVar.h(); i13++) {
                ((lp) kpVar.d.get(i13)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            mpVar.M = false;
            this.a = false;
        }
        mpVar.D();
        ag.l lVar = mpVar.W;
        if (lVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = mpVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            int k10 = i0.a.k(mpVar.getThemedColor(i12), 76);
            lVar.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        k6 k6Var = mpVar.X;
        if (k6Var != null) {
            k6Var.setTextColor(mpVar.getThemedColor(i12));
        }
        mpVar.setBackgroundColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.k6.h5));
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void b() {
    }
}
