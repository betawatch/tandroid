package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ StickersActivity a;

    public /* synthetic */ da1(StickersActivity stickersActivity) {
        this.a = stickersActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        StickersActivity.V(this.a, (org.telegram.ui.Components.u61) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        StickersActivity stickersActivity = this.a;
        if (stickersActivity.w.isEmpty() && (u61Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.o0((org.telegram.ui.Cells.p8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
