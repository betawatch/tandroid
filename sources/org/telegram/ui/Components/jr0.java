package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jr0 extends org.telegram.ui.un {
    public boolean kd;
    public final /* synthetic */ int ld;
    public final /* synthetic */ au0 md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(au0 au0Var, Bundle bundle, int i10) {
        super(bundle);
        this.md = au0Var;
        this.ld = i10;
        this.kd = true;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        au0 au0Var = this.md;
        mt0 mt0Var = au0Var.U;
        if (this.kd) {
            if (this.j0 != null) {
                Ga("");
                this.j0.P(mt0Var.x, false);
            }
            org.telegram.ui.wk wkVar = this.C1;
            if (wkVar != null) {
                wkVar.e(mt0Var.y, false);
            }
            org.telegram.messenger.vi mediaDataController = au0Var.x1.getMediaDataController();
            int classGuid = getClassGuid();
            sg.o0 o0Var = mt0Var.y;
            String str = mt0Var.x;
            ArrayList arrayList = mt0Var.n;
            ArrayList arrayList2 = mt0Var.h;
            int i10 = mt0Var.w;
            boolean z12 = mt0Var.s;
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
            mediaDataController.e1 = this.ld;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.at.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.kd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
