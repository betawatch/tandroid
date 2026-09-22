package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class va implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ va(BaseController baseController, int i10, int i11) {
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
