package gh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bu0;
import org.telegram.ui.rt0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s9 extends rt0 {
    public final /* synthetic */ org.telegram.ui.Components.o9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public s9(org.telegram.ui.Components.o9 o9Var, LinearLayout linearLayout, long j10) {
        this.a = o9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        org.telegram.ui.Components.o9 o9Var = this.a;
        ImageReceiver imageReceiver = o9Var.getImageReceiver();
        int[] iArr = new int[2];
        o9Var.getLocationInWindow(iArr);
        bu0 bu0Var = new bu0();
        bu0Var.b = iArr[0];
        bu0Var.c = iArr[1];
        bu0Var.d = this.b;
        bu0Var.m = null;
        bu0Var.a = imageReceiver;
        if (z10) {
            bu0Var.e = imageReceiver.getBitmapSafe();
        }
        bu0Var.h = imageReceiver.getRoundRadius(true);
        bu0Var.f = this.c;
        bu0Var.j = 0;
        bu0Var.i = 0;
        return bu0Var;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean K() {
        return true;
    }
}
