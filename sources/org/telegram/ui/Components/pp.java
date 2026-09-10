package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pp implements org.telegram.ui.ActionBar.k6 {
    public boolean a = false;
    public final /* synthetic */ sp b;

    public pp(sp spVar) {
        this.b = spVar;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void a(float f7) {
        ArrayList arrayList;
        sp spVar = this.b;
        qp qpVar = spVar.h;
        if (f7 == 0.0f && !this.a) {
            if (qpVar != null && (arrayList = qpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((rp) obj).c = spVar.N ? 1 : 0;
                }
            }
            if (!spVar.P) {
                for (int i11 = 0; i11 < qpVar.h(); i11++) {
                    ((rp) qpVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        hj0 hj0Var = spVar.F;
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        hj0Var.setColorFilter(new PorterDuffColorFilter(spVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        spVar.setOverlayNavBarColor(spVar.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        if (spVar.P) {
            for (int i13 = 0; i13 < qpVar.h(); i13++) {
                ((rp) qpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            spVar.P = false;
            this.a = false;
        }
        spVar.D();
        bi.n7 n7Var = spVar.Z;
        if (n7Var != null) {
            int dp = AndroidUtilities.dp(0.0f);
            int themedColor = spVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            int k10 = i0.a.k(spVar.getThemedColor(i12), 76);
            n7Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
        }
        o6 o6Var = spVar.a0;
        if (o6Var != null) {
            o6Var.setTextColor(spVar.getThemedColor(i12));
        }
        spVar.setBackgroundColor(spVar.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
    }
}
