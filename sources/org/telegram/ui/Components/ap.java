package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ap implements org.telegram.ui.ActionBar.u6 {
    public boolean a = false;
    public final /* synthetic */ np b;

    public ap(np npVar) {
        this.b = npVar;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void a(float f10) {
        ArrayList arrayList;
        np npVar = this.b;
        lp lpVar = npVar.r1;
        if (f10 == 0.0f && !this.a) {
            if (lpVar != null && (arrayList = lpVar.d) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((mp) obj).c = npVar.H1 ? 1 : 0;
                }
            }
            if (!npVar.J1) {
                for (int i10 = 0; i10 < lpVar.b(); i10++) {
                    ((mp) lpVar.d.get(i10)).getClass();
                }
            }
            this.a = true;
        }
        oh0 oh0Var = npVar.z1;
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i11, npVar.J0);
        npVar.e2 = w02;
        oh0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        npVar.E0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, npVar.J0));
        if (npVar.J1) {
            for (int i12 = 0; i12 < lpVar.b(); i12++) {
                ((mp) lpVar.d.get(i12)).getClass();
            }
        }
        if (f10 == 1.0f && this.a) {
            npVar.J1 = false;
            this.a = false;
        }
        npVar.Z0();
        ai.l0 l0Var = npVar.T1;
        if (l0Var != null) {
            int L = org.telegram.messenger.g0.L(0.0f);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, npVar.J0);
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(i11, npVar.J0), 76);
            l0Var.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, o4, o4));
        }
        o6 o6Var = npVar.U1;
        if (o6Var != null) {
            o6Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, npVar.J0));
        }
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, npVar.J0);
        npVar.f2 = w04;
        npVar.v0(w04);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b() {
        this.b.O0();
    }
}
