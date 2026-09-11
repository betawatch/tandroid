package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class g61 extends l61 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ j71 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(j71 j71Var, Context context, int i10) {
        super(j71Var, context);
        this.g3 = j71Var;
        this.f3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        j71 j71Var = this.g3;
        a61 a61Var = j71Var.f0;
        if (i10 == 0) {
            j71Var.w1 = false;
            if (j71Var.a == -1 || a61Var.getVisibility() != 0 || a61Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            j71.a(j71Var, a61Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        j71 j71Var = this.g3;
        j71Var.h();
        if (!j71Var.w1) {
            int I0 = j71Var.r0.I0();
            ArrayList arrayList = j71Var.D0;
            SparseIntArray sparseIntArray = j71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || j71Var.C0) ? arrayList.size() + (j71Var.N0 ? 1 : 0) : 40) && I0 > j71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.xx xxVar = valueAt >= 0 ? (org.telegram.ui.Components.xx) j71Var.M0.get(valueAt) : null;
                        if (xxVar != null) {
                            boolean z10 = xxVar.h;
                            int size = xxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.bw bwVar = j71Var.d0;
                                bwVar.j(((bwVar.E == null || !bwVar.b0) ? 0 : 1) + (bwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    j71Var.d0.j(0, true);
                }
            }
        }
        j71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(j71Var.e0, j71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        j71Var.m();
    }
}
