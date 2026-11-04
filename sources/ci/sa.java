package ci;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.eq0;
import org.telegram.ui.mq0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sa extends eq0 {
    public final /* synthetic */ org.telegram.ui.Components.k9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public sa(org.telegram.ui.Components.k9 k9Var, LinearLayout linearLayout, long j10) {
        this.a = k9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.ui.Components.k9 k9Var = this.a;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        int[] iArr = new int[2];
        k9Var.getLocationInWindow(iArr);
        mq0 mq0Var = new mq0();
        mq0Var.b = iArr[0];
        mq0Var.c = iArr[1];
        mq0Var.d = this.b;
        mq0Var.m = null;
        mq0Var.a = imageReceiver;
        if (z10) {
            mq0Var.e = imageReceiver.p();
        }
        mq0Var.h = imageReceiver.E();
        mq0Var.f = this.c;
        mq0Var.j = 0;
        mq0Var.i = 0;
        return mq0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean L() {
        return true;
    }
}
