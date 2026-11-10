package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final /* synthetic */ StickersActivity a;

    public /* synthetic */ j51(StickersActivity stickersActivity) {
        this.a = stickersActivity;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        StickersActivity stickersActivity = this.a;
        if (stickersActivity.x.isEmpty() && (x31Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.g8) view);
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        StickersActivity.Z(this.a, (org.telegram.ui.Components.x31) obj, (View) obj2);
    }
}
