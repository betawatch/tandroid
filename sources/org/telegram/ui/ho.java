package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ ho(oo ooVar, int i10) {
        this.a = i10;
        this.b = ooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        oo ooVar = this.b;
        switch (i10) {
            case 0:
                oo.a0(ooVar);
                break;
            case 1:
                oo.f0(ooVar);
                break;
            case 2:
                ooVar.b.dismiss();
                ooVar.finishFragment();
                break;
            case 3:
                ooVar.M.setChecked(ooVar.w0.autotranslation);
                break;
            default:
                ooVar.e.setImageDrawable(ooVar.r);
                ooVar.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.dd.L0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ooVar.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar.getMessagesController().U3(ooVar.C0, true, false);
                }
                ooVar.O0 = true;
                if (ooVar.R0 == null) {
                    ooVar.R0 = new org.telegram.ui.Components.ci0(R.raw.camera_outline, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                }
                ooVar.b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                ooVar.b0.e.setAnimation(ooVar.R0);
                break;
        }
    }
}
