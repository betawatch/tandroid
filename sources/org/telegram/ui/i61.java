package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i61 extends n61 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ l71 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i61(l71 l71Var, Context context, int i10) {
        super(l71Var, context);
        this.g3 = l71Var;
        this.f3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        l71 l71Var = this.g3;
        c61 c61Var = l71Var.f0;
        if (i10 == 0) {
            l71Var.w1 = false;
            if (l71Var.a == -1 || c61Var.getVisibility() != 0 || c61Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            l71.a(l71Var, c61Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        l71 l71Var = this.g3;
        l71Var.h();
        if (!l71Var.w1) {
            int I0 = l71Var.r0.I0();
            ArrayList arrayList = l71Var.D0;
            SparseIntArray sparseIntArray = l71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || l71Var.C0) ? arrayList.size() + (l71Var.N0 ? 1 : 0) : 40) && I0 > l71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.dy dyVar = valueAt >= 0 ? (org.telegram.ui.Components.dy) l71Var.M0.get(valueAt) : null;
                        if (dyVar != null) {
                            boolean z10 = dyVar.h;
                            int size = dyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gw gwVar = l71Var.d0;
                                gwVar.j(((gwVar.E == null || !gwVar.b0) ? 0 : 1) + (gwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    l71Var.d0.j(0, true);
                }
            }
        }
        l71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(l71Var.e0, l71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        l71Var.m();
    }
}
