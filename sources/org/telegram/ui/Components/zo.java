package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zo implements org.telegram.ui.ActionBar.g6 {
    public boolean a = false;
    public final /* synthetic */ cp b;

    public zo(cp cpVar) {
        this.b = cpVar;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void a(float f10) {
        ArrayList arrayList;
        cp cpVar = this.b;
        ap apVar = cpVar.h;
        if (f10 == 0.0f && !this.a) {
            if (apVar != null && (arrayList = apVar.d) != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((bp) obj).c = cpVar.J ? 1 : 0;
                }
            }
            if (!cpVar.L) {
                for (int i10 = 0; i10 < apVar.h(); i10++) {
                    ((bp) apVar.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        mi0 mi0Var = cpVar.B;
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        mi0Var.setColorFilter(new PorterDuffColorFilter(cpVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        cpVar.setOverlayNavBarColor(cpVar.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        if (cpVar.L) {
            for (int i12 = 0; i12 < apVar.h(); i12++) {
                ((bp) apVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            cpVar.L = false;
            this.a = false;
        }
        cpVar.D();
        fh.v vVar = cpVar.V;
        if (vVar != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = cpVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6);
            int k10 = i0.a.k(cpVar.getThemedColor(i11), 76);
            vVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        j6 j6Var = cpVar.W;
        if (j6Var != null) {
            j6Var.setTextColor(cpVar.getThemedColor(i11));
        }
        cpVar.setBackgroundColor(cpVar.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b() {
    }
}
