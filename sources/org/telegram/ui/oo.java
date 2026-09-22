package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ oo(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wo.V(this.b);
                break;
            case 1:
                wo.a0(this.b);
                break;
            case 2:
                wo woVar = this.b;
                woVar.b.dismiss();
                woVar.finishFragment();
                break;
            case 3:
                wo woVar2 = this.b;
                woVar2.M.setChecked(woVar2.x0.autotranslation);
                break;
            default:
                wo woVar3 = this.b;
                woVar3.e.setImageDrawable(woVar3.r);
                woVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = woVar3.D0;
                if (user != null) {
                    user.photo = null;
                    woVar3.getMessagesController().putUser(woVar3.D0, true);
                }
                woVar3.O0 = true;
                if (woVar3.R0 == null) {
                    woVar3.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                woVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                woVar3.b0.e.setAnimation(woVar3.R0);
                break;
        }
    }
}
