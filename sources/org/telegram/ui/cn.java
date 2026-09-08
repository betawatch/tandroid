package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ cn(on onVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = onVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        on onVar = this.b;
        switch (i10) {
            case 0:
                onVar.v(chat);
                break;
            case 1:
                onVar.b(chat);
                break;
            case 2:
                onVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.yc.a0(onVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
