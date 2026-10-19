package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;

    public /* synthetic */ bo(io ioVar, int i10) {
        this.a = i10;
        this.b = ioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                io.V(this.b);
                break;
            case 1:
                io.a0(this.b);
                break;
            case 2:
                io ioVar = this.b;
                ioVar.b.dismiss();
                ioVar.finishFragment();
                break;
            case 3:
                io ioVar2 = this.b;
                ioVar2.M.setChecked(ioVar2.x0.autotranslation);
                break;
            default:
                io ioVar3 = this.b;
                ioVar3.e.setImageDrawable(ioVar3.r);
                ioVar3.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = ioVar3.D0;
                if (user != null) {
                    user.photo = null;
                    ioVar3.getMessagesController().putUser(ioVar3.D0, true);
                }
                ioVar3.O0 = true;
                if (ioVar3.R0 == null) {
                    ioVar3.R0 = new org.telegram.ui.Components.uj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                ioVar3.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                ioVar3.b0.e.setAnimation(ioVar3.R0);
                break;
        }
    }
}
