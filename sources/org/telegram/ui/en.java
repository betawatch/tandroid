package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ en(qn qnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        qn qnVar = this.b;
        switch (i10) {
            case 0:
                qnVar.q(chat);
                break;
            case 1:
                qnVar.a(chat);
                break;
            case 2:
                qnVar.a.pa(chat);
                break;
            default:
                org.telegram.ui.Components.zc.a0(qnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
