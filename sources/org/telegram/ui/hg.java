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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zn b;
    public final /* synthetic */ org.telegram.ui.Cells.s1 c;
    public final /* synthetic */ ze.c d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hg(zn znVar, xi xiVar, org.telegram.ui.Cells.s1 s1Var, String str, CharacterStyle characterStyle) {
        this.b = znVar;
        this.d = xiVar;
        this.c = s1Var;
        this.e = str;
        this.f = characterStyle;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        boolean z4;
        boolean z10;
        long j10;
        Boolean bool;
        boolean z11;
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
                    z4 = false;
                    z10 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    long j11 = -chat.id;
                    z4 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = j11;
                    z10 = false;
                } else {
                    z4 = false;
                    z10 = false;
                    j10 = 0;
                }
                zn znVar = this.b;
                org.telegram.ui.Cells.s1 s1Var2 = this.c;
                org.telegram.ui.Components.p70 I = org.telegram.ui.Components.p70.I(znVar, s1Var2);
                org.telegram.ui.Components.hm0 hm0Var = new org.telegram.ui.Components.hm0(znVar.getParentActivity(), znVar.ba);
                I.p = new re(hm0Var, 0);
                if (j10 != 0) {
                    bool = bool2;
                    z11 = false;
                    I.c(z4 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z4 ? R.string.ViewChannel : R.string.SendMessage), new gg.y0(znVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z11 = false;
                }
                boolean z12 = z4;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new xe(znVar, hm0Var, str, 1), z11);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new se(znVar, str, 11), z11);
                }
                I.k();
                if (j10 != 0) {
                    I.n(tLObject, LocaleController.getString(z10 ? R.string.ViewProfile : z12 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new gg.y0(znVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                hm0Var.e(I);
                hm0Var.f(s1Var2, characterStyle, null, false);
                znVar.showDialog(hm0Var);
                break;
            default:
                yi yiVar = (yi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                zn znVar2 = this.b;
                if (znVar2.xb == yiVar) {
                    iArr[0] = 0;
                    yiVar.c(false);
                    if (messages_messages != null) {
                        znVar2.getMessagesController().putUsers(messages_messages.users, false);
                        znVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            ln lnVar = znVar2.mc;
                            if (lnVar != null && (s1Var = this.c) != null) {
                                lnVar.k(s1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hg(zn znVar, yi yiVar, int[] iArr, org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        this.b = znVar;
        this.d = yiVar;
        this.e = iArr;
        this.c = s1Var;
        this.f = messageObject;
    }
}
