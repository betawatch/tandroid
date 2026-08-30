package lh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ju0;
import org.telegram.ui.yt0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o9 extends yt0 {
    public final /* synthetic */ org.telegram.ui.Components.p9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public o9(org.telegram.ui.Components.p9 p9Var, LinearLayout linearLayout, long j10) {
        this.a = p9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Components.p9 p9Var = this.a;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        ju0 ju0Var = new ju0();
        ju0Var.b = iArr[0];
        ju0Var.c = iArr[1];
        ju0Var.d = this.b;
        ju0Var.m = null;
        ju0Var.a = imageReceiver;
        if (z4) {
            ju0Var.e = imageReceiver.getBitmapSafe();
        }
        ju0Var.h = imageReceiver.getRoundRadius(true);
        ju0Var.f = this.c;
        ju0Var.j = 0;
        ju0Var.i = 0;
        return ju0Var;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean K() {
        return true;
    }
}
