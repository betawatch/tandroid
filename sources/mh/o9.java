package mh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.au0;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class o9 extends au0 {
    public final /* synthetic */ org.telegram.ui.Components.p9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public o9(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j10) {
        this.a = p9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var = this.a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        lu0 lu0Var = new lu0();
        lu0Var.b = iArr[0];
        lu0Var.c = iArr[1];
        lu0Var.d = this.b;
        lu0Var.m = null;
        lu0Var.a = imageReceiver;
        if (z4) {
            lu0Var.e = imageReceiver.getBitmapSafe();
        }
        lu0Var.h = imageReceiver.getRoundRadius(true);
        lu0Var.f = this.c;
        lu0Var.j = 0;
        lu0Var.i = 0;
        return lu0Var;
    }

    @Override // org.telegram.ui.au0, org.telegram.ui.ju0
    public final boolean K() {
        return true;
    }
}
