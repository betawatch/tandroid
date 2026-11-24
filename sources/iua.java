// default package

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iua extends i98 {
    public final /* synthetic */ be0 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public iua(be0 be0Var, LinearLayout linearLayout, long j) {
        this.a = be0Var;
        this.b = linearLayout;
        this.c = j;
    }

    @Override // i98, o98
    public final boolean K() {
        return true;
    }

    @Override // i98, o98
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        be0 be0Var = this.a;
        ImageReceiver imageReceiver = be0Var.getImageReceiver();
        int[] iArr = new int[2];
        be0Var.getLocationInWindow(iArr);
        p98 p98Var = new p98();
        p98Var.b = iArr[0];
        p98Var.c = iArr[1];
        p98Var.d = this.b;
        p98Var.m = null;
        p98Var.a = imageReceiver;
        if (z) {
            p98Var.e = imageReceiver.p();
        }
        p98Var.h = imageReceiver.z();
        p98Var.f = this.c;
        p98Var.j = 0;
        p98Var.i = 0;
        return p98Var;
    }
}
