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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rn b;
    public final /* synthetic */ org.telegram.ui.Cells.s1 c;
    public final /* synthetic */ we.d d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cg(rn rnVar, pi piVar, org.telegram.ui.Cells.s1 s1Var, String str, CharacterStyle characterStyle) {
        this.b = rnVar;
        this.d = piVar;
        this.c = s1Var;
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
        org.telegram.ui.Cells.s1 s1Var;
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
                rn rnVar = this.b;
                org.telegram.ui.Cells.s1 s1Var2 = this.c;
                org.telegram.ui.Components.b70 I = org.telegram.ui.Components.b70.I(rnVar, s1Var2);
                org.telegram.ui.Components.ol0 ol0Var = new org.telegram.ui.Components.ol0(rnVar.getParentActivity(), rnVar.aa);
                I.p = new ke(ol0Var, 0);
                if (j10 != 0) {
                    bool = bool2;
                    z12 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new cg.a1(rnVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new qe(rnVar, ol0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new le(rnVar, str, 11), z12);
                }
                I.k();
                if (j10 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z13 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new cg.a1(rnVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                ol0Var.e(I);
                ol0Var.f(s1Var2, characterStyle, null, false);
                rnVar.showDialog(ol0Var);
                break;
            default:
                qi qiVar = (qi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                rn rnVar2 = this.b;
                if (rnVar2.wb == qiVar) {
                    iArr[0] = 0;
                    qiVar.c(false);
                    if (messages_messages != null) {
                        rnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        rnVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            dn dnVar = rnVar2.lc;
                            if (dnVar != null && (s1Var = this.c) != null) {
                                dnVar.i(s1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cg(rn rnVar, qi qiVar, int[] iArr, org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        this.b = rnVar;
        this.d = qiVar;
        this.e = iArr;
        this.c = s1Var;
        this.f = messageObject;
    }
}
