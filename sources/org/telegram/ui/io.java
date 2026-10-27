package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ io(oo ooVar, int i10) {
        this.a = i10;
        this.b = ooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oo.W(this.b);
                break;
            case 1:
                oo.b0(this.b);
                break;
            case 2:
                oo ooVar = this.b;
                ooVar.b.dismiss();
                ooVar.finishFragment();
                break;
            case 3:
                oo ooVar2 = this.b;
                ooVar2.M.setChecked(ooVar2.w0.autotranslation);
                break;
            default:
                oo ooVar3 = this.b;
                ooVar3.e.setImageDrawable(ooVar3.r);
                ooVar3.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = ooVar3.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar3.getMessagesController().putUser(ooVar3.C0, true);
                }
                ooVar3.N0 = true;
                if (ooVar3.Q0 == null) {
                    ooVar3.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                ooVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                ooVar3.b0.e.setAnimation(ooVar3.Q0);
                break;
        }
    }
}
