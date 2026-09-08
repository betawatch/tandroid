package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ po(xo xoVar, int i10) {
        this.a = i10;
        this.b = xoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xo.V(this.b);
                break;
            case 1:
                xo.a0(this.b);
                break;
            case 2:
                xo xoVar = this.b;
                xoVar.b.dismiss();
                xoVar.finishFragment();
                break;
            case 3:
                xo xoVar2 = this.b;
                xoVar2.M.setChecked(xoVar2.x0.autotranslation);
                break;
            default:
                xo xoVar3 = this.b;
                xoVar3.e.setImageDrawable(xoVar3.r);
                xoVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = xoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    xoVar3.getMessagesController().putUser(xoVar3.D0, true);
                }
                xoVar3.O0 = true;
                if (xoVar3.R0 == null) {
                    xoVar3.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                xoVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                xoVar3.b0.e.setAnimation(xoVar3.R0);
                break;
        }
    }
}
