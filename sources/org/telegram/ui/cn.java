package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
