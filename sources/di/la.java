package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oq0;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class la extends oq0 {
    public final /* synthetic */ org.telegram.ui.Components.q9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public la(org.telegram.ui.Components.q9 q9Var, LinearLayout linearLayout, long j3) {
        this.a = q9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.q9 q9Var = this.a;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = this.b;
        wq0Var.m = null;
        wq0Var.a = imageReceiver;
        if (z10) {
            wq0Var.e = imageReceiver.p();
        }
        wq0Var.h = imageReceiver.E();
        wq0Var.f = this.c;
        wq0Var.j = 0;
        wq0Var.i = 0;
        return wq0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean L() {
        return true;
    }
}
