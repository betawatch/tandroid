package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qq0;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wb extends qq0 {
    public final /* synthetic */ org.telegram.ui.Components.k9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public wb(org.telegram.ui.Components.k9 k9Var, LinearLayout linearLayout, long j3) {
        this.a = k9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.k9 k9Var = this.a;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        int[] iArr = new int[2];
        k9Var.getLocationInWindow(iArr);
        zq0 zq0Var = new zq0();
        zq0Var.b = iArr[0];
        zq0Var.c = iArr[1];
        zq0Var.d = this.b;
        zq0Var.m = null;
        zq0Var.a = imageReceiver;
        if (z9) {
            zq0Var.e = imageReceiver.p();
        }
        zq0Var.h = imageReceiver.E();
        zq0Var.f = this.c;
        zq0Var.j = 0;
        zq0Var.i = 0;
        return zq0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean L() {
        return true;
    }
}
