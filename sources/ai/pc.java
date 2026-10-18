package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bu0;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class pc extends bu0 {
    public final /* synthetic */ org.telegram.ui.Components.w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public pc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
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
