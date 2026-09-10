package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ dn(pn pnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = pnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        pn pnVar = this.b;
        switch (i10) {
            case 0:
                pnVar.w(chat);
                break;
            case 1:
                pnVar.b(chat);
                break;
            case 2:
                pnVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.wc.a0(pnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
