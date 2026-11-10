package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.cn {
    public boolean td;
    public final /* synthetic */ int ud;
    public final /* synthetic */ ys0 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(ys0 ys0Var, Bundle bundle, int i7) {
        super(bundle);
        this.vd = ys0Var;
        this.ud = i7;
        this.td = true;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        ys0 ys0Var = this.vd;
        ks0 ks0Var = ys0Var.U;
        if (this.td) {
            if (this.j0 != null) {
                Na("");
                this.j0.P(ks0Var.x, false);
            }
            org.telegram.ui.ck ckVar = this.C1;
            if (ckVar != null) {
                ckVar.e(ks0Var.y, false);
            }
            org.telegram.messenger.ui mediaDataController = ys0Var.x1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.o0 o0Var = ks0Var.y;
            String str = ks0Var.x;
            ArrayList arrayList = ks0Var.n;
            ArrayList arrayList2 = ks0Var.h;
            int i7 = ks0Var.w;
            boolean z11 = ks0Var.s;
            mediaDataController.Q0 = o0Var;
            mediaDataController.d1 = str;
            boolean[] zArr = mediaDataController.X0;
            zArr[0] = z11;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.Z0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.a1.clear();
            mediaDataController.a1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.W0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.e1 = this.ud;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.qs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.td = false;
        }
        super.onTransitionAnimationStart(z9, z10);
    }
}
