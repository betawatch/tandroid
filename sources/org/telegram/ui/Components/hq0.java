package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class hq0 extends org.telegram.ui.an {
    public boolean rd;
    public final /* synthetic */ int sd;
    public final /* synthetic */ xs0 td;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq0(xs0 xs0Var, Bundle bundle, int i7) {
        super(bundle);
        this.td = xs0Var;
        this.sd = i7;
        this.rd = true;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        xs0 xs0Var = this.td;
        js0 js0Var = xs0Var.U;
        if (this.rd) {
            if (this.j0 != null) {
                La("");
                this.j0.P(js0Var.x, false);
            }
            org.telegram.ui.ak akVar = this.C1;
            if (akVar != null) {
                akVar.e(js0Var.y, false);
            }
            org.telegram.messenger.ui mediaDataController = xs0Var.x1.getMediaDataController();
            int classGuid = getClassGuid();
            ch.o0 o0Var = js0Var.y;
            String str = js0Var.x;
            ArrayList arrayList = js0Var.n;
            ArrayList arrayList2 = js0Var.h;
            int i7 = js0Var.w;
            boolean z11 = js0Var.s;
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
            mediaDataController.e1 = this.sd;
            mediaDataController.getNotificationCenter().k(org.telegram.messenger.qs.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.c0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.e1), Integer.valueOf(mediaDataController.j0()), Boolean.TRUE);
            this.rd = false;
        }
        super.onTransitionAnimationStart(z9, z10);
    }
}
