package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e51 implements org.telegram.messenger.x10, org.telegram.messenger.y10 {
    public final /* synthetic */ StickersActivity a;

    public /* synthetic */ e51(StickersActivity stickersActivity) {
        this.a = stickersActivity;
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(org.telegram.ui.Components.b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        StickersActivity stickersActivity = this.a;
        if (stickersActivity.x.isEmpty() && (b41Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.f8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        StickersActivity.Z(this.a, (org.telegram.ui.Components.b41) obj, (View) obj2);
    }
}
