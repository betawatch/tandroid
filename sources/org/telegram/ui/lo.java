package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ lo(ro roVar, int i10) {
        this.a = i10;
        this.b = roVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ro.V(this.b);
                break;
            case 1:
                ro.a0(this.b);
                break;
            case 2:
                ro roVar = this.b;
                roVar.b.dismiss();
                roVar.finishFragment();
                break;
            case 3:
                ro roVar2 = this.b;
                roVar2.J.setChecked(roVar2.u0.autotranslation);
                break;
            default:
                ro roVar3 = this.b;
                roVar3.e.setImageDrawable(roVar3.r);
                roVar3.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = roVar3.A0;
                if (user != null) {
                    user.photo = null;
                    roVar3.getMessagesController().putUser(roVar3.A0, true);
                }
                roVar3.L0 = true;
                if (roVar3.O0 == null) {
                    roVar3.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                roVar3.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                roVar3.Y.e.setAnimation(roVar3.O0);
                break;
        }
    }
}
