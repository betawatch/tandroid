package bi;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pq0;
import org.telegram.ui.yq0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wb extends pq0 {
    public final /* synthetic */ org.telegram.ui.Components.l9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public wb(org.telegram.ui.Components.l9 l9Var, LinearLayout linearLayout, long j3) {
        this.a = l9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final yq0 E(ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var = this.a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        yq0 yq0Var = new yq0();
        yq0Var.b = iArr[0];
        yq0Var.c = iArr[1];
        yq0Var.d = this.b;
        yq0Var.m = null;
        yq0Var.a = imageReceiver;
        if (z9) {
            yq0Var.e = imageReceiver.p();
        }
        yq0Var.h = imageReceiver.E();
        yq0Var.f = this.c;
        yq0Var.j = 0;
        yq0Var.i = 0;
        return yq0Var;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean L() {
        return true;
    }
}
