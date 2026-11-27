// default package

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mya extends yc8 {
    public final /* synthetic */ de0 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public mya(de0 de0Var, LinearLayout linearLayout, long j) {
        this.a = de0Var;
        this.b = linearLayout;
        this.c = j;
    }

    @Override // yc8, ed8
    public final boolean K() {
        return true;
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        de0 de0Var = this.a;
        ImageReceiver imageReceiver = de0Var.getImageReceiver();
        int[] iArr = new int[2];
        de0Var.getLocationInWindow(iArr);
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = this.b;
        fd8Var.m = null;
        fd8Var.a = imageReceiver;
        if (z) {
            fd8Var.e = imageReceiver.p();
        }
        fd8Var.h = imageReceiver.z();
        fd8Var.f = this.c;
        fd8Var.j = 0;
        fd8Var.i = 0;
        return fd8Var;
    }
}
