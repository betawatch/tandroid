package mh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fu0;
import org.telegram.ui.qu0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class o9 extends fu0 {
    public final /* synthetic */ org.telegram.ui.Components.p9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public o9(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j10) {
        this.a = p9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var = this.a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = this.b;
        qu0Var.m = null;
        qu0Var.a = imageReceiver;
        if (z4) {
            qu0Var.e = imageReceiver.getBitmapSafe();
        }
        qu0Var.h = imageReceiver.getRoundRadius(true);
        qu0Var.f = this.c;
        qu0Var.j = 0;
        qu0Var.i = 0;
        return qu0Var;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean K() {
        return true;
    }
}
