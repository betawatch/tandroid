package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ro implements org.telegram.ui.ActionBar.r6 {
    public boolean a = false;
    public final /* synthetic */ ep b;

    public ro(ep epVar) {
        this.b = epVar;
    }

    @Override // org.telegram.ui.ActionBar.r6
    public final void a(float f10) {
        ArrayList arrayList;
        ep epVar = this.b;
        cp cpVar = epVar.r1;
        if (f10 == 0.0f && !this.a) {
            if (cpVar != null && (arrayList = cpVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((dp) obj).c = epVar.H1 ? 1 : 0;
                }
            }
            if (!epVar.J1) {
                for (int i10 = 0; i10 < cpVar.b(); i10++) {
                    ((dp) cpVar.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        ch0 ch0Var = epVar.z1;
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i11, epVar.J0);
        epVar.e2 = w02;
        ch0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        epVar.E0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, epVar.J0));
        if (epVar.J1) {
            for (int i12 = 0; i12 < cpVar.b(); i12++) {
                ((dp) cpVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            epVar.J1 = false;
            this.a = false;
        }
        epVar.Y0();
        ai.j0 j0Var = epVar.T1;
        if (j0Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, epVar.J0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(i11, epVar.J0), 76);
            j0Var.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w03, o4, o4));
        }
        h6 h6Var = epVar.U1;
        if (h6Var != null) {
            h6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, epVar.J0));
        }
        int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, epVar.J0);
        epVar.f2 = w04;
        epVar.v0(w04);
    }

    @Override // org.telegram.ui.ActionBar.r6
    public final void b() {
        this.b.N0();
    }
}
