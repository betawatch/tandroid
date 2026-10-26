package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo b;

    public /* synthetic */ go(mo moVar, int i10) {
        this.a = i10;
        this.b = moVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mo.W(this.b);
                break;
            case 1:
                mo.b0(this.b);
                break;
            case 2:
                mo moVar = this.b;
                moVar.b.dismiss();
                moVar.finishFragment();
                break;
            case 3:
                mo moVar2 = this.b;
                moVar2.M.setChecked(moVar2.w0.autotranslation);
                break;
            default:
                mo moVar3 = this.b;
                moVar3.e.setImageDrawable(moVar3.r);
                moVar3.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = moVar3.C0;
                if (user != null) {
                    user.photo = null;
                    moVar3.getMessagesController().putUser(moVar3.C0, true);
                }
                moVar3.N0 = true;
                if (moVar3.Q0 == null) {
                    moVar3.Q0 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                moVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                moVar3.b0.e.setAnimation(moVar3.Q0);
                break;
        }
    }
}
