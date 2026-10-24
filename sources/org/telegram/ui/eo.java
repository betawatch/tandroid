package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ko b;

    public /* synthetic */ eo(ko koVar, int i10) {
        this.a = i10;
        this.b = koVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ko.V(this.b);
                break;
            case 1:
                ko.a0(this.b);
                break;
            case 2:
                ko koVar = this.b;
                koVar.b.dismiss();
                koVar.finishFragment();
                break;
            case 3:
                ko koVar2 = this.b;
                koVar2.M.setChecked(koVar2.w0.autotranslation);
                break;
            default:
                ko koVar3 = this.b;
                koVar3.e.setImageDrawable(koVar3.r);
                koVar3.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar3.C0;
                if (user != null) {
                    user.photo = null;
                    koVar3.getMessagesController().putUser(koVar3.C0, true);
                }
                koVar3.N0 = true;
                if (koVar3.Q0 == null) {
                    koVar3.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar3.b0.e.setAnimation(koVar3.Q0);
                break;
        }
    }
}
