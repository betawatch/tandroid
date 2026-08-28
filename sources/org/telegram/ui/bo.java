package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ bo(ho hoVar, int i9) {
        this.a = i9;
        this.b = hoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ho.U(this.b);
                break;
            case 1:
                ho.Z(this.b);
                break;
            case 2:
                ho hoVar = this.b;
                hoVar.b.dismiss();
                hoVar.finishFragment();
                break;
            case 3:
                ho hoVar2 = this.b;
                hoVar2.I.setChecked(hoVar2.t0.autotranslation);
                break;
            default:
                ho hoVar3 = this.b;
                hoVar3.e.setImageDrawable(hoVar3.r);
                hoVar3.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = hoVar3.z0;
                if (user != null) {
                    user.photo = null;
                    hoVar3.getMessagesController().putUser(hoVar3.z0, true);
                }
                hoVar3.K0 = true;
                if (hoVar3.N0 == null) {
                    hoVar3.N0 = new org.telegram.ui.Components.mi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                hoVar3.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                hoVar3.X.e.setAnimation(hoVar3.N0);
                break;
        }
    }
}
