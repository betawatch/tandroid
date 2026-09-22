package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo b;

    public /* synthetic */ mo(uo uoVar, int i10) {
        this.a = i10;
        this.b = uoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uo.V(this.b);
                break;
            case 1:
                uo.a0(this.b);
                break;
            case 2:
                uo uoVar = this.b;
                uoVar.b.dismiss();
                uoVar.finishFragment();
                break;
            case 3:
                uo uoVar2 = this.b;
                uoVar2.M.setChecked(uoVar2.x0.autotranslation);
                break;
            default:
                uo uoVar3 = this.b;
                uoVar3.e.setImageDrawable(uoVar3.r);
                uoVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar3.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar3.getMessagesController().putUser(uoVar3.D0, true);
                }
                uoVar3.O0 = true;
                if (uoVar3.R0 == null) {
                    uoVar3.R0 = new org.telegram.ui.Components.kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar3.b0.e.setAnimation(uoVar3.R0);
                break;
        }
    }
}
