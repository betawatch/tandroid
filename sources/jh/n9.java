package jh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pt0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n9 extends pt0 {
    public final /* synthetic */ org.telegram.ui.Components.t9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public n9(org.telegram.ui.Components.t9 t9Var, LinearLayout linearLayout, long j10) {
        this.a = t9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.t9 t9Var = this.a;
        ImageReceiver imageReceiver = t9Var.getImageReceiver();
        int[] iArr = new int[2];
        t9Var.getLocationInWindow(iArr);
        zt0 zt0Var = new zt0();
        zt0Var.b = iArr[0];
        zt0Var.c = iArr[1];
        zt0Var.d = this.b;
        zt0Var.m = null;
        zt0Var.a = imageReceiver;
        if (z10) {
            zt0Var.e = imageReceiver.getBitmapSafe();
        }
        zt0Var.h = imageReceiver.getRoundRadius(true);
        zt0Var.f = this.c;
        zt0Var.j = 0;
        zt0Var.i = 0;
        return zt0Var;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean K() {
        return true;
    }
}
