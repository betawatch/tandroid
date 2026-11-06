package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class wb extends mq0 {
    public final /* synthetic */ org.telegram.ui.Components.l9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public wb(org.telegram.ui.Components.l9 l9Var, LinearLayout linearLayout, long j3) {
        this.a = l9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final vq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var = this.a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        vq0 vq0Var = new vq0();
        vq0Var.b = iArr[0];
        vq0Var.c = iArr[1];
        vq0Var.d = this.b;
        vq0Var.m = null;
        vq0Var.a = imageReceiver;
        if (z9) {
            vq0Var.e = imageReceiver.p();
        }
        vq0Var.h = imageReceiver.E();
        vq0Var.f = this.c;
        vq0Var.j = 0;
        vq0Var.i = 0;
        return vq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean L() {
        return true;
    }
}
