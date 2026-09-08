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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ co b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ of.e d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mg(co coVar, zi ziVar, org.telegram.ui.Cells.t1 t1Var, String str, CharacterStyle characterStyle) {
        this.b = coVar;
        this.d = ziVar;
        this.c = t1Var;
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
        org.telegram.ui.Cells.t1 t1Var;
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
                co coVar = this.b;
                org.telegram.ui.Cells.t1 t1Var2 = this.c;
                org.telegram.ui.Components.n70 I = org.telegram.ui.Components.n70.I(coVar, t1Var2);
                org.telegram.ui.Components.am0 am0Var = new org.telegram.ui.Components.am0(coVar.getParentActivity(), coVar.ea);
                I.p = new qe(am0Var, 0);
                if (j3 != 0) {
                    bool = bool2;
                    z12 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new le(coVar, j3, 3), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ye(coVar, am0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new se(coVar, str, 11), z12);
                }
                I.k();
                if (j3 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z13 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new le(coVar, j3, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                am0Var.e(I);
                am0Var.f(t1Var2, characterStyle, null, false);
                coVar.showDialog(am0Var);
                break;
            default:
                aj ajVar = (aj) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                co coVar2 = this.b;
                if (coVar2.Ab == ajVar) {
                    iArr[0] = 0;
                    ajVar.c(false);
                    if (messages_messages != null) {
                        coVar2.getMessagesController().putUsers(messages_messages.users, false);
                        coVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            on onVar = coVar2.pc;
                            if (onVar != null && (t1Var = this.c) != null) {
                                onVar.k(t1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ mg(co coVar, aj ajVar, int[] iArr, org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        this.b = coVar;
        this.d = ajVar;
        this.e = iArr;
        this.c = t1Var;
        this.f = messageObject;
    }
}
