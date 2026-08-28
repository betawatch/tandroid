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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qn b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ ve.d d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bg(qn qnVar, ni niVar, org.telegram.ui.Cells.t1 t1Var, String str, CharacterStyle characterStyle) {
        this.b = qnVar;
        this.d = niVar;
        this.c = t1Var;
        this.e = str;
        this.f = characterStyle;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        long j10;
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
                    j10 = ((TLRPC.User) tLObject).id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    long j11 = -chat.id;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = j11;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                }
                qn qnVar = this.b;
                org.telegram.ui.Cells.t1 t1Var2 = this.c;
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(qnVar, t1Var2);
                org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(qnVar.getParentActivity(), qnVar.aa);
                I.p = new ke(ll0Var, 0);
                if (j10 != 0) {
                    bool = bool2;
                    z12 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new bg.e1(qnVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new qe(qnVar, ll0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new le(qnVar, str, 11), z12);
                }
                I.k();
                if (j10 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z13 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new bg.e1(qnVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                ll0Var.e(I);
                ll0Var.f(t1Var2, characterStyle, null, false);
                qnVar.showDialog(ll0Var);
                break;
            default:
                oi oiVar = (oi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                qn qnVar2 = this.b;
                if (qnVar2.wb == oiVar) {
                    iArr[0] = 0;
                    oiVar.c(false);
                    if (messages_messages != null) {
                        qnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        qnVar2.getMessagesController().putChats(messages_messages.chats, false);
                        int i9 = 0;
                        while (true) {
                            if (i9 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i9);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i9++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = messageObject.messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            cn cnVar = qnVar2.lc;
                            if (cnVar != null && (t1Var = this.c) != null) {
                                cnVar.g(t1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ bg(qn qnVar, oi oiVar, int[] iArr, org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        this.b = qnVar;
        this.d = oiVar;
        this.e = iArr;
        this.c = t1Var;
        this.f = messageObject;
    }
}
