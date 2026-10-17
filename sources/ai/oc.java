package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class oc extends bu0 {
    public final /* synthetic */ org.telegram.ui.Components.w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public oc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.a = w9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = this.b;
        lu0Var.m = null;
        lu0Var.a = imageReceiver;
        if (z10) {
            lu0Var.e = imageReceiver.getBitmapSafe();
        }
        lu0Var.h = imageReceiver.getRoundRadius(true);
        lu0Var.f = this.c;
        lu0Var.j = 0;
        lu0Var.i = 0;
        return lu0Var;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean L() {
        return true;
    }
}
