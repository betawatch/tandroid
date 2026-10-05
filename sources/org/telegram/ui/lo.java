package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ to b;

    public /* synthetic */ lo(to toVar, int i10) {
        this.a = i10;
        this.b = toVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                to.T(this.b);
                break;
            case 1:
                to.Z(this.b);
                break;
            case 2:
                to toVar = this.b;
                toVar.b.dismiss();
                toVar.finishFragment();
                break;
            case 3:
                to toVar2 = this.b;
                toVar2.M.setChecked(toVar2.x0.autotranslation);
                break;
            default:
                to toVar3 = this.b;
                toVar3.e.setImageDrawable(toVar3.r);
                toVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = toVar3.D0;
                if (user != null) {
                    user.photo = null;
                    toVar3.getMessagesController().putUser(toVar3.D0, true);
                }
                toVar3.O0 = true;
                if (toVar3.R0 == null) {
                    toVar3.R0 = new org.telegram.ui.Components.kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                toVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                toVar3.b0.e.setAnimation(toVar3.R0);
                break;
        }
    }
}
