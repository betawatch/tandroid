package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ po b;

    public /* synthetic */ jo(po poVar, int i10) {
        this.a = i10;
        this.b = poVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                po.V(this.b);
                break;
            case 1:
                po.a0(this.b);
                break;
            case 2:
                po poVar = this.b;
                poVar.b.dismiss();
                poVar.finishFragment();
                break;
            case 3:
                po poVar2 = this.b;
                poVar2.J.setChecked(poVar2.u0.autotranslation);
                break;
            default:
                po poVar3 = this.b;
                poVar3.e.setImageDrawable(poVar3.r);
                poVar3.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = poVar3.A0;
                if (user != null) {
                    user.photo = null;
                    poVar3.getMessagesController().putUser(poVar3.A0, true);
                }
                poVar3.L0 = true;
                if (poVar3.O0 == null) {
                    poVar3.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                poVar3.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                poVar3.Y.e.setAnimation(poVar3.O0);
                break;
        }
    }
}
