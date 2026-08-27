package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rn b;
    public final /* synthetic */ MessagesController c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ne(rn rnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        this.b = rnVar;
        this.d = charSequence;
        this.c = messagesController;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rn.k0(this.b, this.d, this.c, this.e);
                break;
            default:
                rn rnVar = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.aa);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
                String string = LocaleController.getString(R.string.OK);
                MessagesController messagesController = this.c;
                alertDialog$Builder.k(string, new l9.b(rnVar, messagesController, this.d, this.e, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                String string2 = LocaleController.getString(R.string.SecretLinkPreviewAlert);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.P = string2;
                rnVar.showDialog(b2Var);
                messagesController.secretWebpagePreview = 0;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", messagesController.secretWebpagePreview).commit();
                break;
        }
    }

    public /* synthetic */ ne(rn rnVar, MessagesController messagesController, CharSequence charSequence, boolean z10) {
        this.b = rnVar;
        this.c = messagesController;
        this.d = charSequence;
        this.e = z10;
    }
}
