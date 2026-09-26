package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ jo(ro roVar, int i10) {
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
                roVar2.M.setChecked(roVar2.x0.autotranslation);
                break;
            default:
                ro roVar3 = this.b;
                roVar3.e.setImageDrawable(roVar3.r);
                roVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = roVar3.D0;
                if (user != null) {
                    user.photo = null;
                    roVar3.getMessagesController().putUser(roVar3.D0, true);
                }
                roVar3.O0 = true;
                if (roVar3.R0 == null) {
                    roVar3.R0 = new org.telegram.ui.Components.ij0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                roVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                roVar3.b0.e.setAnimation(roVar3.R0);
                break;
        }
    }
}
