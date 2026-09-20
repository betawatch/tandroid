package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j51 extends oz {
    public final /* synthetic */ s51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j51(s51 s51Var, int i10, i51 i51Var) {
        super(5, i10, i51Var);
        this.Y = s51Var;
    }

    @Override // org.telegram.ui.Components.oz
    public final boolean D1() {
        s51 s51Var = this.Y;
        return s51Var.n.getAdapter() == s51Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        s51 s51Var = this.Y;
        if (s51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (s51Var.L != null) {
            return 0;
        }
        if (s51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                i51 i51Var = s51Var.n;
                View q6 = q(i12);
                i51Var.getClass();
                int S = RecyclerView.S(q6);
                if (S < 1) {
                    i11 = S;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = s51Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override // s4.s, s4.c0, s4.o0
    public final boolean y0() {
        return false;
    }
}
