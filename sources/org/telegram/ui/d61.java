package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class d61 extends i61 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ g71 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(g71 g71Var, Context context, int i10) {
        super(g71Var, context);
        this.g3 = g71Var;
        this.f3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        g71 g71Var = this.g3;
        x51 x51Var = g71Var.f0;
        if (i10 == 0) {
            g71Var.w1 = false;
            if (g71Var.a == -1 || x51Var.getVisibility() != 0 || x51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            g71.a(g71Var, x51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10, int i11) {
        int i12;
        g71 g71Var = this.g3;
        g71Var.h();
        if (!g71Var.w1) {
            int I0 = g71Var.r0.I0();
            ArrayList arrayList = g71Var.D0;
            SparseIntArray sparseIntArray = g71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || g71Var.C0) ? arrayList.size() + (g71Var.N0 ? 1 : 0) : 40) && I0 > g71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.xx xxVar = valueAt >= 0 ? (org.telegram.ui.Components.xx) g71Var.M0.get(valueAt) : null;
                        if (xxVar != null) {
                            boolean z10 = xxVar.h;
                            int size = xxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.cw cwVar = g71Var.d0;
                                cwVar.j(((cwVar.E == null || !cwVar.b0) ? 0 : 1) + (cwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    g71Var.d0.j(0, true);
                }
            }
        }
        g71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(g71Var.e0, g71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        g71Var.m();
    }
}
