package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class tp implements org.telegram.ui.ActionBar.i6 {
    public boolean a = false;
    public final /* synthetic */ wp b;

    public tp(wp wpVar) {
        this.b = wpVar;
    }

    @Override // org.telegram.ui.ActionBar.i6
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
                    ((vp) obj).c = wpVar.N ? 1 : 0;
                }
            }
            if (!wpVar.P) {
                for (int i11 = 0; i11 < upVar.h(); i11++) {
                    ((vp) upVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        uj0 uj0Var = wpVar.F;
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        uj0Var.setColorFilter(new PorterDuffColorFilter(wpVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        wpVar.setOverlayNavBarColor(wpVar.getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        if (wpVar.P) {
            for (int i13 = 0; i13 < upVar.h(); i13++) {
                ((vp) upVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            wpVar.P = false;
            this.a = false;
        }
        wpVar.F();
        ah.v vVar = wpVar.Z;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = wpVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6);
            int o10 = i0.b.o(wpVar.getThemedColor(i12), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor, o10, o10));
        }
        q6 q6Var = wpVar.a0;
        if (q6Var != null) {
            q6Var.setTextColor(wpVar.getThemedColor(i12));
        }
        wpVar.setBackgroundColor(wpVar.getThemedColor(org.telegram.ui.ActionBar.h6.h5));
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void b() {
    }
}
