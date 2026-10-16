package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wp implements org.telegram.ui.ActionBar.h6 {
    public boolean a = false;
    public final /* synthetic */ zp b;

    public wp(zp zpVar) {
        this.b = zpVar;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void a(float f7) {
        ArrayList arrayList;
        zp zpVar = this.b;
        xp xpVar = zpVar.h;
        if (f7 == 0.0f && !this.a) {
            if (xpVar != null && (arrayList = xpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yp) obj).c = zpVar.N ? 1 : 0;
                }
            }
            if (!zpVar.P) {
                for (int i11 = 0; i11 < xpVar.h(); i11++) {
                    ((yp) xpVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        yj0 yj0Var = zpVar.F;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        yj0Var.setColorFilter(new PorterDuffColorFilter(zpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        zpVar.setOverlayNavBarColor(zpVar.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        if (zpVar.P) {
            for (int i13 = 0; i13 < xpVar.h(); i13++) {
                ((yp) xpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            zpVar.P = false;
            this.a = false;
        }
        zpVar.F();
        ah.v vVar = zpVar.Z;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = zpVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6);
            int k10 = i0.a.k(zpVar.getThemedColor(i12), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        s6 s6Var = zpVar.a0;
        if (s6Var != null) {
            s6Var.setTextColor(zpVar.getThemedColor(i12));
        }
        zpVar.setBackgroundColor(zpVar.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
    }
}
