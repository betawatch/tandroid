package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xo implements org.telegram.ui.ActionBar.h6 {
    public boolean a = false;
    public final /* synthetic */ ap b;

    public xo(ap apVar) {
        this.b = apVar;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void a(float f10) {
        ArrayList arrayList;
        ap apVar = this.b;
        yo yoVar = apVar.h;
        if (f10 == 0.0f && !this.a) {
            if (yoVar != null && (arrayList = yoVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zo) obj).c = apVar.J ? 1 : 0;
                }
            }
            if (!apVar.L) {
                for (int i11 = 0; i11 < yoVar.h(); i11++) {
                    ((zo) yoVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        oi0 oi0Var = apVar.B;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        oi0Var.setColorFilter(new PorterDuffColorFilter(apVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        apVar.setOverlayNavBarColor(apVar.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        if (apVar.L) {
            for (int i13 = 0; i13 < yoVar.h(); i13++) {
                ((zo) yoVar.d.get(i13)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            apVar.L = false;
            this.a = false;
        }
        apVar.E();
        ag.y1 y1Var = apVar.V;
        if (y1Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = apVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6);
            int k10 = i0.b.k(apVar.getThemedColor(i12), 76);
            y1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        j6 j6Var = apVar.W;
        if (j6Var != null) {
            j6Var.setTextColor(apVar.getThemedColor(i12));
        }
        apVar.setBackgroundColor(apVar.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
    }
}
