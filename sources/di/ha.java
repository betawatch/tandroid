package di;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;
import org.telegram.ui.uq0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ha extends mq0 {
    public final /* synthetic */ org.telegram.ui.Components.i9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public ha(org.telegram.ui.Components.i9 i9Var, LinearLayout linearLayout, long j3) {
        this.a = i9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.i9 i9Var = this.a;
        ImageReceiver imageReceiver = i9Var.getImageReceiver();
        int[] iArr = new int[2];
        i9Var.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.b = iArr[0];
        uq0Var.c = iArr[1];
        uq0Var.d = this.b;
        uq0Var.m = null;
        uq0Var.a = imageReceiver;
        if (z10) {
            uq0Var.e = imageReceiver.p();
        }
        uq0Var.h = imageReceiver.E();
        uq0Var.f = this.c;
        uq0Var.j = 0;
        uq0Var.i = 0;
        return uq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean L() {
        return true;
    }
}
