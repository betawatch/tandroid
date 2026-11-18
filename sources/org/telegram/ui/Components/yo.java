package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yo implements org.telegram.ui.ActionBar.v6 {
    public boolean a = false;
    public final /* synthetic */ lp b;

    public yo(lp lpVar) {
        this.b = lpVar;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final void a(float f10) {
        ArrayList arrayList;
        lp lpVar = this.b;
        jp jpVar = lpVar.r1;
        if (f10 == 0.0f && !this.a) {
            if (jpVar != null && (arrayList = jpVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((kp) obj).c = lpVar.H1 ? 1 : 0;
                }
            }
            if (!lpVar.J1) {
                for (int i10 = 0; i10 < jpVar.b(); i10++) {
                    ((kp) jpVar.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        mh0 mh0Var = lpVar.z1;
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i11, lpVar.J0);
        lpVar.e2 = w02;
        mh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        lpVar.E0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, lpVar.J0));
        if (lpVar.J1) {
            for (int i12 = 0; i12 < jpVar.b(); i12++) {
                ((kp) jpVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            lpVar.J1 = false;
            this.a = false;
        }
        lpVar.Z0();
        ai.k0 k0Var = lpVar.T1;
        if (k0Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, lpVar.J0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i11, lpVar.J0), 76);
            k0Var.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w03, o4, o4));
        }
        n6 n6Var = lpVar.U1;
        if (n6Var != null) {
            n6Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(i11, lpVar.J0));
        }
        int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, lpVar.J0);
        lpVar.f2 = w04;
        lpVar.v0(w04);
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final void b() {
        this.b.O0();
    }
}
