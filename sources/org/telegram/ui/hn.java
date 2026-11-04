package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln b;

    public /* synthetic */ hn(ln lnVar, int i3) {
        this.a = i3;
        this.b = lnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ln lnVar = this.b;
        switch (i3) {
            case 0:
                ln.a0(lnVar);
                break;
            case 1:
                ln.f0(lnVar);
                break;
            case 2:
                lnVar.b.dismiss();
                lnVar.finishFragment();
                break;
            case 3:
                lnVar.N.setChecked(lnVar.x0.autotranslation);
                break;
            default:
                lnVar.e.setImageDrawable(lnVar.r);
                lnVar.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = lnVar.D0;
                if (user != null) {
                    user.photo = null;
                    lnVar.getMessagesController().X3(lnVar.D0, true, false);
                }
                lnVar.P0 = true;
                if (lnVar.S0 == null) {
                    lnVar.S0 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                lnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                lnVar.c0.e.setAnimation(lnVar.S0);
                break;
        }
    }
}
