package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ bn(nn nnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = nnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        nn nnVar = this.b;
        switch (i10) {
            case 0:
                nnVar.x(chat);
                break;
            case 1:
                nnVar.b(chat);
                break;
            case 2:
                nnVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.vc.a0(nnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
