package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yn b;
    public final /* synthetic */ org.telegram.ui.Cells.u1 c;
    public final /* synthetic */ nf.e d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lg(yn ynVar, xi xiVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.b = ynVar;
        this.d = xiVar;
        this.c = u1Var;
        this.e = str;
        this.f = characterStyle;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        long j3;
        Boolean bool;
        boolean z12;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.a) {
            case 0:
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    long j10 = -chat.id;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = j10;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j3 = 0;
                }
                yn ynVar = this.b;
                org.telegram.ui.Cells.u1 u1Var2 = this.c;
                org.telegram.ui.Components.b80 I = org.telegram.ui.Components.b80.I(ynVar, u1Var2);
                org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(ynVar.getParentActivity(), ynVar.ca);
                I.p = new se(sm0Var, 0);
                if (j3 != 0) {
                    bool = bool2;
                    z12 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new gg(ynVar, j3, 2), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new af(ynVar, sm0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new ue(ynVar, str, 11), z12);
                }
                I.k();
                if (j3 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z13 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new gg(ynVar, j3, 3));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                sm0Var.e(I);
                sm0Var.f(u1Var2, characterStyle, null, false);
                ynVar.showDialog(sm0Var);
                break;
            default:
                yi yiVar = (yi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                yn ynVar2 = this.b;
                if (ynVar2.xb == yiVar) {
                    iArr[0] = 0;
                    yiVar.c(false);
                    if (messages_messages != null) {
                        ynVar2.getMessagesController().putUsers(messages_messages.users, false);
                        ynVar2.getMessagesController().putChats(messages_messages.chats, false);
                        int i10 = 0;
                        while (true) {
                            if (i10 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i10);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i10++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = messageObject.messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            kn knVar = ynVar2.mc;
                            if (knVar != null && (u1Var = this.c) != null) {
                                knVar.i(u1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lg(yn ynVar, yi yiVar, int[] iArr, org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        this.b = ynVar;
        this.d = yiVar;
        this.e = iArr;
        this.c = u1Var;
        this.f = messageObject;
    }
}
