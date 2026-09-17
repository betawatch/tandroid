package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ua(BaseController baseController, int i10, int i11) {
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
