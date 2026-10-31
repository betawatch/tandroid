package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ir0 extends org.telegram.ui.un {
    public boolean jd;
    public final /* synthetic */ int kd;
    public final /* synthetic */ zt0 ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir0(zt0 zt0Var, Bundle bundle, int i10) {
        super(bundle);
        this.ld = zt0Var;
        this.kd = i10;
        this.jd = true;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        zt0 zt0Var = this.ld;
        lt0 lt0Var = zt0Var.U;
        if (this.jd) {
            if (this.j0 != null) {
                Ba("");
                this.j0.P(lt0Var.x, false);
            }
            org.telegram.ui.wk wkVar = this.C1;
            if (wkVar != null) {
                wkVar.e(lt0Var.y, false);
            }
            org.telegram.messenger.ui mediaDataController = zt0Var.x1.getMediaDataController();
            int classGuid = getClassGuid();
            sg.o0 o0Var = lt0Var.y;
            String str = lt0Var.x;
            ArrayList arrayList = lt0Var.n;
            ArrayList arrayList2 = lt0Var.h;
            int i10 = lt0Var.w;
            boolean z12 = lt0Var.s;
            mediaDataController.Q0 = o0Var;
            mediaDataController.d1 = str;
            boolean[] zArr = mediaDataController.X0;
            zArr[0] = z12;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.Z0;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.a1.clear();
            mediaDataController.a1.addAll(arrayList);
            mediaDataController.k2();
            int[] iArr = mediaDataController.W0;
            iArr[0] = i10;
            iArr[1] = 0;
            mediaDataController.e1 = this.kd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.zs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.jd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
