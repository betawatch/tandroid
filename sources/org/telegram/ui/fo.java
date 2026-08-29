package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ko b;

    public /* synthetic */ fo(ko koVar, int i10) {
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
                koVar2.I.setChecked(koVar2.t0.autotranslation);
                break;
            default:
                ko koVar3 = this.b;
                koVar3.e.setImageDrawable(koVar3.r);
                koVar3.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar3.z0;
                if (user != null) {
                    user.photo = null;
                    koVar3.getMessagesController().putUser(koVar3.z0, true);
                }
                koVar3.K0 = true;
                if (koVar3.N0 == null) {
                    koVar3.N0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar3.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar3.X.e.setAnimation(koVar3.N0);
                break;
        }
    }
}
