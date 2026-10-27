package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ q8(o9 o9Var, int i10) {
        this.a = i10;
        this.b = o9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) view.getTag();
                o9 o9Var = this.b;
                ChatObject.Call groupCall = o9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = o9Var.getMessagesController().getChat(l4);
                o9Var.L = chat;
                if (groupCall == null) {
                    o9Var.M = l4;
                    o9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.g2.l(chat, null, false, null, o9Var.getParentActivity(), o9Var, o9Var.getAccountInstance());
                    break;
                }
            default:
                Bundle i10 = a1.g.i("isCall", true);
                o9 o9Var2 = this.b;
                o9Var2.presentFragment(new h9(i10, o9Var2.getCurrentAccount(), o9Var2));
                break;
        }
    }
}
