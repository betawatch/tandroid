package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final /* synthetic */ StickersActivity a;

    public /* synthetic */ h51(StickersActivity stickersActivity) {
        this.a = stickersActivity;
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(org.telegram.ui.Components.l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        StickersActivity stickersActivity = this.a;
        if (stickersActivity.x.isEmpty() && (l41Var.H instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.g8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        StickersActivity.Z(this.a, (org.telegram.ui.Components.l41) obj, (View) obj2);
    }
}
