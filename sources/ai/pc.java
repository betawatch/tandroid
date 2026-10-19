package ai;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ju0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class pc extends zt0 {
    public final /* synthetic */ org.telegram.ui.Components.w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public pc(org.telegram.ui.Components.w9 w9Var, LinearLayout linearLayout, long j10) {
        this.a = w9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.w9 w9Var = this.a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = this.b;
        ju0Var.m = null;
        ju0Var.a = imageReceiver;
        if (z10) {
            ju0Var.e = imageReceiver.getBitmapSafe();
        }
        ju0Var.h = imageReceiver.getRoundRadius(true);
        ju0Var.f = this.c;
        ju0Var.j = 0;
        ju0Var.i = 0;
        return ju0Var;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean L() {
        return true;
    }
}
