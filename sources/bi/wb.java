package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nq0;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wb extends nq0 {
    public final /* synthetic */ org.telegram.ui.Components.l9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public wb(org.telegram.ui.Components.l9 l9Var, LinearLayout linearLayout, long j3) {
        this.a = l9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var = this.a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = this.b;
        wq0Var.m = null;
        wq0Var.a = imageReceiver;
        if (z9) {
            wq0Var.e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.E();
        wq0Var.f = this.c;
        wq0Var.j = 0;
        wq0Var.i = 0;
        return wq0Var;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean L() {
        return true;
    }
}
