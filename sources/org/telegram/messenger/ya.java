package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ya implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ya(BaseController baseController, int i10, int i11) {
        this.a = i11;
        this.b = baseController;
        this.c = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$convertToGigaGroup$271(this.c, dialogInterface);
                break;
            case 1:
                ((MessagesController) this.b).lambda$convertToMegaGroup$266(this.c, dialogInterface);
                break;
            default:
                ((SecretChatHelper) this.b).lambda$startSecretChat$31(this.c, dialogInterface);
                break;
        }
    }
}
