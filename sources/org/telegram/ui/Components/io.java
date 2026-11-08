package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class io implements org.telegram.ui.ActionBar.s6 {
    public boolean a = false;
    public final /* synthetic */ vo b;

    public io(vo voVar) {
        this.b = voVar;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void a(float f10) {
        ArrayList arrayList;
        vo voVar = this.b;
        to toVar = voVar.n1;
        if (f10 == 0.0f && !this.a) {
            if (toVar != null && (arrayList = toVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((uo) obj).c = voVar.D1 ? 1 : 0;
                }
            }
            if (!voVar.F1) {
                for (int i10 = 0; i10 < toVar.b(); i10++) {
                    ((uo) toVar.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        zg0 zg0Var = voVar.v1;
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, voVar.I0);
        voVar.a2 = w02;
        zg0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        voVar.E0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, voVar.I0));
        if (voVar.F1) {
            for (int i12 = 0; i12 < toVar.b(); i12++) {
                ((uo) toVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            voVar.F1 = false;
            this.a = false;
        }
        voVar.Y0();
        bi.x5 x5Var = voVar.P1;
        if (x5Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, voVar.I0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, voVar.I0), 76);
            x5Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, o4, o4));
        }
        j6 j6Var = voVar.Q1;
        if (j6Var != null) {
            j6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, voVar.I0));
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, voVar.I0);
        voVar.b2 = w04;
        voVar.v0(w04);
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void b() {
        this.b.N0();
    }
}
