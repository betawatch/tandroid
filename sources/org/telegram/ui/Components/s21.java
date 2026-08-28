package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s21 extends z21 {
    public final /* synthetic */ org.telegram.ui.gf P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i9, TL_iv.RichMessage richMessage, org.telegram.ui.gf gfVar) {
        super(activity, str, str2, null, inputPeer, i9, false, richMessage);
        this.P = gfVar;
    }

    @Override // org.telegram.ui.Components.z21, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.P.run();
    }
}
