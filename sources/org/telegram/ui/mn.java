package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ mn(rn rnVar, int i7) {
        this.a = i7;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        rn rnVar = this.b;
        switch (i7) {
            case 0:
                rn.a0(rnVar);
                break;
            case 1:
                rn.f0(rnVar);
                break;
            case 2:
                rnVar.b.dismiss();
                rnVar.finishFragment();
                break;
            case 3:
                rnVar.N.setChecked(rnVar.x0.autotranslation);
                break;
            default:
                rnVar.e.setImageDrawable(rnVar.r);
                rnVar.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.N0(2131752200, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.D0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().e4(rnVar.D0, true, false);
                }
                rnVar.P0 = true;
                if (rnVar.S0 == null) {
                    rnVar.S0 = new org.telegram.ui.Components.oh0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.c0.e.setAnimation(rnVar.S0);
                break;
        }
    }
}
