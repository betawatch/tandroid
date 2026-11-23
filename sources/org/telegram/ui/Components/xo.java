package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xo implements org.telegram.ui.ActionBar.v6 {
    public boolean a = false;
    public final /* synthetic */ kp b;

    public xo(kp kpVar) {
        this.b = kpVar;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final void a(float f10) {
        ArrayList arrayList;
        kp kpVar = this.b;
        ip ipVar = kpVar.r1;
        if (f10 == 0.0f && !this.a) {
            if (ipVar != null && (arrayList = ipVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((jp) obj).c = kpVar.H1 ? 1 : 0;
                }
            }
            if (!kpVar.J1) {
                for (int i10 = 0; i10 < ipVar.b(); i10++) {
                    ((jp) ipVar.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        nh0 nh0Var = kpVar.z1;
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, kpVar.J0);
        kpVar.e2 = w02;
        nh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        kpVar.E0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, kpVar.J0));
        if (kpVar.J1) {
            for (int i12 = 0; i12 < ipVar.b(); i12++) {
                ((jp) ipVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            kpVar.J1 = false;
            this.a = false;
        }
        kpVar.Z0();
        ai.h0 h0Var = kpVar.T1;
        if (h0Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, kpVar.J0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i11, kpVar.J0), 76);
            h0Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w03, o4, o4));
        }
        n6 n6Var = kpVar.U1;
        if (n6Var != null) {
            n6Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(i11, kpVar.J0));
        }
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, kpVar.J0);
        kpVar.f2 = w04;
        kpVar.v0(w04);
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final void b() {
        this.b.O0();
    }
}
