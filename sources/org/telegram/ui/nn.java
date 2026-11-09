package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ nn(rn rnVar, int i7) {
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
                rnVar.M.setChecked(rnVar.w0.autotranslation);
                break;
            default:
                rnVar.e.setImageDrawable(rnVar.r);
                rnVar.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.C0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().X3(rnVar.C0, true, false);
                }
                rnVar.O0 = true;
                if (rnVar.R0 == null) {
                    rnVar.R0 = new org.telegram.ui.Components.ah0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.b0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.b0.e.setAnimation(rnVar.R0);
                break;
        }
    }
}
