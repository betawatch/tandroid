package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f61 extends k61 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ i71 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(i71 i71Var, Context context, int i10) {
        super(i71Var, context);
        this.g3 = i71Var;
        this.f3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        i71 i71Var = this.g3;
        z51 z51Var = i71Var.f0;
        if (i10 == 0) {
            i71Var.w1 = false;
            if (i71Var.a == -1 || z51Var.getVisibility() != 0 || z51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            i71.a(i71Var, z51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10, int i11) {
        int i12;
        i71 i71Var = this.g3;
        i71Var.h();
        if (!i71Var.w1) {
            int I0 = i71Var.r0.I0();
            ArrayList arrayList = i71Var.D0;
            SparseIntArray sparseIntArray = i71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || i71Var.C0) ? arrayList.size() + (i71Var.N0 ? 1 : 0) : 40) && I0 > i71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.wx wxVar = valueAt >= 0 ? (org.telegram.ui.Components.wx) i71Var.M0.get(valueAt) : null;
                        if (wxVar != null) {
                            boolean z10 = wxVar.h;
                            int size = wxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.cw cwVar = i71Var.d0;
                                cwVar.j(((cwVar.E == null || !cwVar.b0) ? 0 : 1) + (cwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    i71Var.d0.j(0, true);
                }
            }
        }
        i71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(i71Var.e0, i71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        i71Var.m();
    }
}
