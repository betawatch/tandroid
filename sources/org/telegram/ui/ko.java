package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ so b;

    public /* synthetic */ ko(so soVar, int i10) {
        this.a = i10;
        this.b = soVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                so.V(this.b);
                break;
            case 1:
                so.a0(this.b);
                break;
            case 2:
                so soVar = this.b;
                soVar.b.dismiss();
                soVar.finishFragment();
                break;
            case 3:
                so soVar2 = this.b;
                soVar2.M.setChecked(soVar2.x0.autotranslation);
                break;
            default:
                so soVar3 = this.b;
                soVar3.e.setImageDrawable(soVar3.r);
                soVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = soVar3.D0;
                if (user != null) {
                    user.photo = null;
                    soVar3.getMessagesController().putUser(soVar3.D0, true);
                }
                soVar3.O0 = true;
                if (soVar3.R0 == null) {
                    soVar3.R0 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                soVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                soVar3.b0.e.setAnimation(soVar3.R0);
                break;
        }
    }
}
