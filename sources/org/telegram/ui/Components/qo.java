package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qo implements org.telegram.ui.ActionBar.b7 {
    public boolean a = false;
    public final /* synthetic */ dp b;

    public qo(dp dpVar) {
        this.b = dpVar;
    }

    @Override // org.telegram.ui.ActionBar.b7
    public final void a(float f7) {
        ArrayList arrayList;
        dp dpVar = this.b;
        bp bpVar = dpVar.n1;
        if (f7 == 0.0f && !this.a) {
            if (bpVar != null && (arrayList = bpVar.d) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((cp) obj).c = dpVar.D1 ? 1 : 0;
                }
            }
            if (!dpVar.F1) {
                for (int i11 = 0; i11 < bpVar.b(); i11++) {
                    ((cp) bpVar.d.get(i11)).getClass();
                }
            }
            this.a = true;
        }
        bi0 bi0Var = dpVar.v1;
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, dpVar.I0);
        dpVar.a2 = w02;
        bi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        dpVar.E0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, dpVar.I0));
        if (dpVar.F1) {
            for (int i13 = 0; i13 < bpVar.b(); i13++) {
                ((cp) bpVar.d.get(i13)).getClass();
            }
        }
        if (f7 == 1.0f && this.a) {
            dpVar.F1 = false;
            this.a = false;
        }
        dpVar.Y0();
        fg.i iVar = dpVar.P1;
        if (iVar != null) {
            int L = org.telegram.messenger.i0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, dpVar.I0);
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i12, dpVar.I0), 76);
            iVar.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w03, o10, o10));
        }
        f6 f6Var = dpVar.Q1;
        if (f6Var != null) {
            f6Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, dpVar.I0));
        }
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, dpVar.I0);
        dpVar.b2 = w04;
        dpVar.v0(w04);
    }

    @Override // org.telegram.ui.ActionBar.b7
    public final void b() {
        this.b.N0();
    }
}
