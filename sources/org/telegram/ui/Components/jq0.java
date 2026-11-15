package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class jq0 extends org.telegram.ui.an {
    public boolean ud;
    public final /* synthetic */ int vd;
    public final /* synthetic */ ys0 wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(ys0 ys0Var, Bundle bundle, int i7) {
        super(bundle);
        this.wd = ys0Var;
        this.vd = i7;
        this.ud = true;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        ys0 ys0Var = this.wd;
        ks0 ks0Var = ys0Var.V;
        if (this.ud) {
            if (this.k0 != null) {
                Oa("");
                this.k0.Q(ks0Var.x, false);
            }
            org.telegram.ui.ak akVar = this.D1;
            if (akVar != null) {
                akVar.e(ks0Var.y, false);
            }
            org.telegram.messenger.si mediaDataController = ys0Var.y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = ks0Var.y;
            String str = ks0Var.x;
            ArrayList arrayList = ks0Var.n;
            ArrayList arrayList2 = ks0Var.h;
            int i7 = ks0Var.w;
            boolean z12 = ks0Var.s;
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
            mediaDataController.k2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i7;
            iArr[1] = 0;
            mediaDataController.f1 = this.vd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ns.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.ud = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
