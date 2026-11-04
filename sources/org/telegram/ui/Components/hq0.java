package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hq0 extends org.telegram.ui.wm {
    public boolean sd;
    public final /* synthetic */ int td;
    public final /* synthetic */ ws0 ud;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq0(ws0 ws0Var, Bundle bundle, int i3) {
        super(bundle);
        this.ud = ws0Var;
        this.td = i3;
        this.sd = true;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ws0 ws0Var = this.ud;
        is0 is0Var = ws0Var.V;
        if (this.sd) {
            if (this.k0 != null) {
                La("");
                this.k0.P(is0Var.x, false);
            }
            org.telegram.ui.wj wjVar = this.D1;
            if (wjVar != null) {
                wjVar.e(is0Var.y, false);
            }
            org.telegram.messenger.li mediaDataController = ws0Var.y1.getMediaDataController();
            int classGuid = getClassGuid();
            dh.n0 n0Var = is0Var.y;
            String str = is0Var.x;
            ArrayList arrayList = is0Var.n;
            ArrayList arrayList2 = is0Var.h;
            int i3 = is0Var.w;
            boolean z12 = is0Var.s;
            mediaDataController.R0 = n0Var;
            mediaDataController.e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.b1.clear();
            mediaDataController.b1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i3;
            iArr[1] = 0;
            mediaDataController.f1 = this.td;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.hs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.sd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
