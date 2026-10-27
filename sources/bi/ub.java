package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.iu0;
import org.telegram.ui.su0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ub extends iu0 {
    public final /* synthetic */ org.telegram.ui.Components.y9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public ub(org.telegram.ui.Components.y9 y9Var, LinearLayout linearLayout, long j10) {
        this.a = y9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.y9 y9Var = this.a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        su0 su0Var = new su0();
        su0Var.b = iArr[0];
        su0Var.c = iArr[1];
        su0Var.d = this.b;
        su0Var.m = null;
        su0Var.a = imageReceiver;
        if (z10) {
            su0Var.e = imageReceiver.getBitmapSafe();
        }
        su0Var.h = imageReceiver.getRoundRadius(true);
        su0Var.f = this.c;
        su0Var.j = 0;
        su0Var.i = 0;
        return su0Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean L() {
        return true;
    }
}
