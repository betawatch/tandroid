package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ ln(qn qnVar, int i7) {
        this.a = i7;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        qn qnVar = this.b;
        switch (i7) {
            case 0:
                qn.a0(qnVar);
                break;
            case 1:
                qn.f0(qnVar);
                break;
            case 2:
                qnVar.b.dismiss();
                qnVar.finishFragment();
                break;
            case 3:
                qnVar.N.setChecked(qnVar.x0.autotranslation);
                break;
            default:
                qnVar.e.setImageDrawable(qnVar.r);
                qnVar.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = qnVar.D0;
                if (user != null) {
                    user.photo = null;
                    qnVar.getMessagesController().X3(qnVar.D0, true, false);
                }
                qnVar.P0 = true;
                if (qnVar.S0 == null) {
                    qnVar.S0 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                qnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                qnVar.c0.e.setAnimation(qnVar.S0);
                break;
        }
    }
}
