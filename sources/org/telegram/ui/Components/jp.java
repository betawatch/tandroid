package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jp implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ mp b;

    public jp(mp mpVar) {
        this.b = mpVar;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f7) {
        ArrayList arrayList;
        mp mpVar = this.b;
        kp kpVar = mpVar.h;
        if (f7 == 0.0f && !this.a) {
            if (kpVar != null && (arrayList = kpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lp) obj).c = mpVar.N ? 1 : 0;
                }
            }
            if (!mpVar.P) {
                for (int i11 = 0; i11 < kpVar.h(); i11++) {
                    ((lp) kpVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        ij0 ij0Var = mpVar.F;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        ij0Var.setColorFilter(new PorterDuffColorFilter(mpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        mpVar.setOverlayNavBarColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        if (mpVar.P) {
            for (int i13 = 0; i13 < kpVar.h(); i13++) {
                ((lp) kpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            mpVar.P = false;
            this.a = false;
        }
        mpVar.E();
        ci.n6 n6Var = mpVar.Z;
        if (n6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            int k10 = i0.a.k(mpVar.getThemedColor(i12), 76);
            n6Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        p6 p6Var = mpVar.a0;
        if (p6Var != null) {
            p6Var.setTextColor(mpVar.getThemedColor(i12));
        }
        mpVar.setBackgroundColor(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}
