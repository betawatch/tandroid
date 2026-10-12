package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class eb implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ eb(BaseController baseController, int i10, int i11) {
        this.a = i11;
        this.b = baseController;
        this.c = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$convertToGigaGroup$270(this.c, dialogInterface);
                break;
            case 1:
                ((MessagesController) this.b).lambda$convertToMegaGroup$265(this.c, dialogInterface);
                break;
            default:
                ((SecretChatHelper) this.b).lambda$startSecretChat$31(this.c, dialogInterface);
                break;
        }
    }
}
