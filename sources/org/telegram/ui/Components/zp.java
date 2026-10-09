package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zp implements org.telegram.ui.ActionBar.j6 {
    public boolean a = false;
    public final /* synthetic */ cq b;

    public zp(cq cqVar) {
        this.b = cqVar;
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final void a(float f7) {
        ArrayList arrayList;
        cq cqVar = this.b;
        aq aqVar = cqVar.h;
        if (f7 == 0.0f && !this.a) {
            if (aqVar != null && (arrayList = aqVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((bq) obj).c = cqVar.N ? 1 : 0;
                }
            }
            if (!cqVar.P) {
                for (int i11 = 0; i11 < aqVar.h(); i11++) {
                    ((bq) aqVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        ck0 ck0Var = cqVar.F;
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        ck0Var.setColorFilter(new PorterDuffColorFilter(cqVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        cqVar.setOverlayNavBarColor(cqVar.getThemedColor(org.telegram.ui.ActionBar.i6.a7));
        if (cqVar.P) {
            for (int i13 = 0; i13 < aqVar.h(); i13++) {
                ((bq) aqVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            cqVar.P = false;
            this.a = false;
        }
        cqVar.F();
        ci.m6 m6Var = cqVar.Z;
        if (m6Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = cqVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6);
            int k10 = i0.a.k(cqVar.getThemedColor(i12), 76);
            m6Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        r6 r6Var = cqVar.a0;
        if (r6Var != null) {
            r6Var.setTextColor(cqVar.getThemedColor(i12));
        }
        cqVar.setBackgroundColor(cqVar.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final void b() {
    }
}
