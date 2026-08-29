package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dp implements org.telegram.ui.ActionBar.h6 {
    public boolean a = false;
    public final /* synthetic */ gp b;

    public dp(gp gpVar) {
        this.b = gpVar;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void a(float f9) {
        ArrayList arrayList;
        gp gpVar = this.b;
        ep epVar = gpVar.h;
        if (f9 == 0.0f && !this.a) {
            if (epVar != null && (arrayList = epVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((fp) obj).c = gpVar.J ? 1 : 0;
                }
            }
            if (!gpVar.L) {
                for (int i11 = 0; i11 < epVar.h(); i11++) {
                    ((fp) epVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        xi0 xi0Var = gpVar.B;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        xi0Var.setColorFilter(new PorterDuffColorFilter(gpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        gpVar.setOverlayNavBarColor(gpVar.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        if (gpVar.L) {
            for (int i13 = 0; i13 < epVar.h(); i13++) {
                ((fp) epVar.d.get(i13)).getClass();
            }
        }
        if (f9 == 1.0f && this.a) {
            gpVar.L = false;
            this.a = false;
        }
        gpVar.D();
        bg.d1 d1Var = gpVar.V;
        if (d1Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = gpVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6);
            int k9 = i0.a.k(gpVar.getThemedColor(i12), 76);
            d1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor, k9, k9));
        }
        o6 o6Var = gpVar.W;
        if (o6Var != null) {
            o6Var.setTextColor(gpVar.getThemedColor(i12));
        }
        gpVar.setBackgroundColor(gpVar.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
    }
}
