package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e61 extends j61 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ h71 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(h71 h71Var, Context context, int i10) {
        super(h71Var, context);
        this.g3 = h71Var;
        this.f3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        h71 h71Var = this.g3;
        y51 y51Var = h71Var.f0;
        if (i10 == 0) {
            h71Var.w1 = false;
            if (h71Var.a == -1 || y51Var.getVisibility() != 0 || y51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            h71.a(h71Var, y51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        h71 h71Var = this.g3;
        h71Var.h();
        if (!h71Var.w1) {
            int I0 = h71Var.r0.I0();
            ArrayList arrayList = h71Var.D0;
            SparseIntArray sparseIntArray = h71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || h71Var.C0) ? arrayList.size() + (h71Var.N0 ? 1 : 0) : 40) && I0 > h71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.wx wxVar = valueAt >= 0 ? (org.telegram.ui.Components.wx) h71Var.M0.get(valueAt) : null;
                        if (wxVar != null) {
                            boolean z10 = wxVar.h;
                            int size = wxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.cw cwVar = h71Var.d0;
                                cwVar.j(((cwVar.E == null || !cwVar.b0) ? 0 : 1) + (cwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    h71Var.d0.j(0, true);
                }
            }
        }
        h71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(h71Var.e0, h71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        h71Var.m();
    }
}
