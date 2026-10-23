package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cu0;
import org.telegram.ui.mu0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class qc extends cu0 {
    public final /* synthetic */ org.telegram.ui.Components.w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public qc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.a = w9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        mu0 mu0Var = new mu0();
        mu0Var.b = iArr[0];
        mu0Var.c = iArr[1];
        mu0Var.d = this.b;
        mu0Var.m = null;
        mu0Var.a = imageReceiver;
        if (z10) {
            mu0Var.e = imageReceiver.getBitmapSafe();
        }
        mu0Var.h = imageReceiver.getRoundRadius(true);
        mu0Var.f = this.c;
        mu0Var.j = 0;
        mu0Var.i = 0;
        return mu0Var;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean L() {
        return true;
    }
}
