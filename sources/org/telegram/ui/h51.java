package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final /* synthetic */ StickersActivity a;

    public /* synthetic */ h51(StickersActivity stickersActivity) {
        this.a = stickersActivity;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(org.telegram.ui.Components.r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        StickersActivity stickersActivity = this.a;
        if (stickersActivity.x.isEmpty() && (r31Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.g8) view);
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        StickersActivity.Z(this.a, (org.telegram.ui.Components.r31) obj, (View) obj2);
    }
}
