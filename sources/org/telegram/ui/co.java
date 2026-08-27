package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class co implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;

    public /* synthetic */ co(jo joVar, int i10) {
        this.a = i10;
        this.b = joVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jo.V(this.b);
                break;
            case 1:
                jo.a0(this.b);
                break;
            case 2:
                jo joVar = this.b;
                joVar.b.dismiss();
                joVar.finishFragment();
                break;
            case 3:
                jo joVar2 = this.b;
                joVar2.I.setChecked(joVar2.t0.autotranslation);
                break;
            default:
                jo joVar3 = this.b;
                joVar3.e.setImageDrawable(joVar3.r);
                joVar3.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = joVar3.z0;
                if (user != null) {
                    user.photo = null;
                    joVar3.getMessagesController().putUser(joVar3.z0, true);
                }
                joVar3.K0 = true;
                if (joVar3.N0 == null) {
                    joVar3.N0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                joVar3.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                joVar3.X.e.setAnimation(joVar3.N0);
                break;
        }
    }
}
