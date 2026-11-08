package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public /* synthetic */ ln(pn pnVar, int i7) {
        this.a = i7;
        this.b = pnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        pn pnVar = this.b;
        switch (i7) {
            case 0:
                pn.a0(pnVar);
                break;
            case 1:
                pn.f0(pnVar);
                break;
            case 2:
                pnVar.b.dismiss();
                pnVar.finishFragment();
                break;
            case 3:
                pnVar.M.setChecked(pnVar.w0.autotranslation);
                break;
            default:
                pnVar.e.setImageDrawable(pnVar.r);
                pnVar.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = pnVar.C0;
                if (user != null) {
                    user.photo = null;
                    pnVar.getMessagesController().X3(pnVar.C0, true, false);
                }
                pnVar.O0 = true;
                if (pnVar.R0 == null) {
                    pnVar.R0 = new org.telegram.ui.Components.zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                pnVar.b0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                pnVar.b0.e.setAnimation(pnVar.R0);
                break;
        }
    }
}
