package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        to toVar = voVar.o1;
        if (f10 == 0.0f && !this.a) {
            if (toVar != null && (arrayList = toVar.d) != null) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((uo) obj).c = voVar.E1 ? 1 : 0;
                }
            }
            if (!voVar.G1) {
                for (int i10 = 0; i10 < toVar.b(); i10++) {
                    ((uo) toVar.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        ch0 ch0Var = voVar.w1;
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, voVar.J0);
        voVar.b2 = w02;
        ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        voVar.E0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, voVar.J0));
        if (voVar.G1) {
            for (int i12 = 0; i12 < toVar.b(); i12++) {
                ((uo) toVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            voVar.G1 = false;
            this.a = false;
        }
        voVar.Y0();
        ai.c0 c0Var = voVar.Q1;
        if (c0Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, voVar.J0);
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, voVar.J0), 76);
            c0Var.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, o10, o10));
        }
        h6 h6Var = voVar.R1;
        if (h6Var != null) {
            h6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, voVar.J0));
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, voVar.J0);
        voVar.c2 = w04;
        voVar.v0(w04);
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void b() {
        this.b.N0();
    }
}
