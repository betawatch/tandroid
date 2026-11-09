package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jq0 extends org.telegram.ui.cn {
    public boolean td;
    public final /* synthetic */ int ud;
    public final /* synthetic */ zs0 vd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(zs0 zs0Var, Bundle bundle, int i7) {
        super(bundle);
        this.vd = zs0Var;
        this.ud = i7;
        this.td = true;
    }

    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        zs0 zs0Var = this.vd;
        ls0 ls0Var = zs0Var.U;
        if (this.td) {
            if (this.j0 != null) {
                Na("");
                this.j0.P(ls0Var.x, false);
            }
            org.telegram.ui.ck ckVar = this.C1;
            if (ckVar != null) {
                ckVar.e(ls0Var.y, false);
            }
            org.telegram.messenger.ui mediaDataController = zs0Var.x1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.o0 o0Var = ls0Var.y;
            String str = ls0Var.x;
            ArrayList arrayList = ls0Var.n;
            ArrayList arrayList2 = ls0Var.h;
            int i7 = ls0Var.w;
            boolean z11 = ls0Var.s;
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
