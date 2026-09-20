package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                    uoVar3.R0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar3.b0.e.setAnimation(uoVar3.R0);
                break;
        }
    }
}
