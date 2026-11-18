package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rq0 extends org.telegram.ui.bn {
    public boolean vd;
    public final /* synthetic */ int wd;
    public final /* synthetic */ gt0 xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(gt0 gt0Var, Bundle bundle, int i7) {
        super(bundle);
        this.xd = gt0Var;
        this.wd = i7;
        this.vd = true;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        gt0 gt0Var = this.xd;
        ss0 ss0Var = gt0Var.V;
        if (this.vd) {
            if (this.k0 != null) {
                Oa("");
                this.k0.Q(ss0Var.x, false);
            }
            org.telegram.ui.bk bkVar = this.D1;
            if (bkVar != null) {
                bkVar.e(ss0Var.y, false);
            }
            org.telegram.messenger.ri mediaDataController = gt0Var.y1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.p0 p0Var = ss0Var.y;
            String str = ss0Var.x;
            ArrayList arrayList = ss0Var.n;
            ArrayList arrayList2 = ss0Var.h;
            int i7 = ss0Var.w;
            boolean z12 = ss0Var.s;
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
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.ks.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.l0()), Boolean.TRUE);
            this.vd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
