package hh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cu0;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r9 extends st0 {
    public final /* synthetic */ org.telegram.ui.Components.n9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public r9(org.telegram.ui.Components.n9 n9Var, LinearLayout linearLayout, long j10) {
        this.a = n9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.n9 n9Var = this.a;
        ImageReceiver imageReceiver = n9Var.getImageReceiver();
        int[] iArr = new int[2];
        n9Var.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.b = iArr[0];
        cu0Var.c = iArr[1];
        cu0Var.d = this.b;
        cu0Var.m = null;
        cu0Var.a = imageReceiver;
        if (z10) {
            cu0Var.e = imageReceiver.getBitmapSafe();
        }
        cu0Var.h = imageReceiver.getRoundRadius(true);
        cu0Var.f = this.c;
        cu0Var.j = 0;
        cu0Var.i = 0;
        return cu0Var;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean K() {
        return true;
    }
}
