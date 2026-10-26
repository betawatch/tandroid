package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kp implements org.telegram.ui.ActionBar.g7 {
    public boolean a = false;
    public final /* synthetic */ yp b;

    public kp(yp ypVar) {
        this.b = ypVar;
    }

    @Override // org.telegram.ui.ActionBar.g7
    public final void a(float f7) {
        ArrayList arrayList;
        yp ypVar = this.b;
        wp wpVar = ypVar.h;
        if (f7 == 0.0f && !this.a) {
            if (wpVar != null && (arrayList = wpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xp) obj).c = ypVar.M ? 1 : 0;
                }
            }
            if (!ypVar.O) {
                for (int i11 = 0; i11 < wpVar.h(); i11++) {
                    ((xp) wpVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        xj0 xj0Var = ypVar.E;
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int themedColor = ypVar.getThemedColor(i12);
        ypVar.j0 = themedColor;
        xj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        ypVar.setOverlayNavBarColor(ypVar.getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        if (ypVar.O) {
            for (int i13 = 0; i13 < wpVar.h(); i13++) {
                ((xp) wpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            ypVar.O = false;
            this.a = false;
        }
        ypVar.K();
        bh.p pVar = ypVar.Y;
        if (pVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor2 = ypVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
            int o10 = i0.a.o(ypVar.getThemedColor(i12), 76);
            pVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor2, o10, o10));
        }
        s6 s6Var = ypVar.Z;
        if (s6Var != null) {
            s6Var.setTextColor(ypVar.getThemedColor(i12));
        }
        int themedColor3 = ypVar.getThemedColor(org.telegram.ui.ActionBar.y6.h5);
        ypVar.k0 = themedColor3;
        ypVar.setBackgroundColor(themedColor3);
    }

    @Override // org.telegram.ui.ActionBar.g7
    public final void b() {
        this.b.x();
    }
}
