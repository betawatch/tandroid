package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class tq0 extends org.telegram.ui.bn {
    public boolean vd;
    public final /* synthetic */ int wd;
    public final /* synthetic */ jt0 xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(jt0 jt0Var, Bundle bundle, int i7) {
        super(bundle);
        this.xd = jt0Var;
        this.wd = i7;
        this.vd = true;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        jt0 jt0Var = this.xd;
        vs0 vs0Var = jt0Var.V;
        if (this.vd) {
            if (this.k0 != null) {
                Oa("");
                this.k0.Q(vs0Var.x, false);
            }
            org.telegram.ui.bk bkVar = this.D1;
            if (bkVar != null) {
                bkVar.e(vs0Var.y, false);
            }
            org.telegram.messenger.si mediaDataController = jt0Var.y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = vs0Var.y;
            String str = vs0Var.x;
            ArrayList arrayList = vs0Var.n;
            ArrayList arrayList2 = vs0Var.h;
            int i7 = vs0Var.w;
            boolean z12 = vs0Var.s;
            mediaDataController.R0 = p0Var;
            mediaDataController.e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.b1.clear();
            mediaDataController.b1.addAll(arrayList);
            mediaDataController.p2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f1 = this.wd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ls.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.l0()), Boolean.TRUE);
            this.vd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
