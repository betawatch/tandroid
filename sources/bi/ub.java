package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gu0;
import org.telegram.ui.qu0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class ub extends gu0 {
    public final /* synthetic */ org.telegram.ui.Components.y9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public ub(org.telegram.ui.Components.y9 y9Var, LinearLayout linearLayout, long j10) {
        this.a = y9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var = this.a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.b = iArr[0];
        qu0Var.c = iArr[1];
        qu0Var.d = this.b;
        qu0Var.m = null;
        qu0Var.a = imageReceiver;
        if (z10) {
            qu0Var.e = imageReceiver.getBitmapSafe();
        }
        qu0Var.h = imageReceiver.getRoundRadius(true);
        qu0Var.f = this.c;
        qu0Var.j = 0;
        qu0Var.i = 0;
        return qu0Var;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean L() {
        return true;
    }
}
