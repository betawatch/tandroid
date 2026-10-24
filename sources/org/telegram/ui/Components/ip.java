package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ip implements org.telegram.ui.ActionBar.s6 {
    public boolean a = false;
    public final /* synthetic */ wp b;

    public ip(wp wpVar) {
        this.b = wpVar;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void a(float f7) {
        ArrayList arrayList;
        wp wpVar = this.b;
        up upVar = wpVar.h;
        if (f7 == 0.0f && !this.a) {
            if (upVar != null && (arrayList = upVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((vp) obj).c = wpVar.M ? 1 : 0;
                }
            }
            if (!wpVar.O) {
                for (int i11 = 0; i11 < upVar.h(); i11++) {
                    ((vp) upVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        yj0 yj0Var = wpVar.E;
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor = wpVar.getThemedColor(i12);
        wpVar.j0 = themedColor;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        wpVar.setOverlayNavBarColor(wpVar.getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        if (wpVar.O) {
            for (int i13 = 0; i13 < upVar.h(); i13++) {
                ((vp) upVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            wpVar.O = false;
            this.a = false;
        }
        wpVar.K();
        ah.v vVar = wpVar.Y;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor2 = wpVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            int o10 = i0.a.o(wpVar.getThemedColor(i12), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor2, o10, o10));
        }
        q6 q6Var = wpVar.Z;
        if (q6Var != null) {
            q6Var.setTextColor(wpVar.getThemedColor(i12));
        }
        int themedColor3 = wpVar.getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        wpVar.k0 = themedColor3;
        wpVar.setBackgroundColor(themedColor3);
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void b() {
        this.b.y();
    }
}
