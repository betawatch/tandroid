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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zn b;
    public final /* synthetic */ org.telegram.ui.Cells.u1 c;
    public final /* synthetic */ nf.e d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kg(zn znVar, yi yiVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.b = znVar;
        this.d = yiVar;
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
                zn znVar = this.b;
                org.telegram.ui.Cells.u1 u1Var2 = this.c;
                org.telegram.ui.Components.w70 I = org.telegram.ui.Components.w70.I(znVar, u1Var2);
                org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(znVar.getParentActivity(), znVar.ea);
                I.p = new re(nm0Var, 0);
                if (j3 != 0) {
                    bool = bool2;
                    z12 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new le(znVar, j3, 3), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ye(znVar, nm0Var, str, 2), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new te(znVar, str, 11), z12);
                }
                I.k();
                if (j3 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z13 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new le(znVar, j3, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                nm0Var.e(I);
                nm0Var.f(u1Var2, characterStyle, null, false);
                znVar.showDialog(nm0Var);
                break;
            default:
                zi ziVar = (zi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                zn znVar2 = this.b;
                if (znVar2.zb == ziVar) {
                    iArr[0] = 0;
                    ziVar.c(false);
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
                            ln lnVar = znVar2.oc;
                            if (lnVar != null && (u1Var = this.c) != null) {
                                lnVar.l(u1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kg(zn znVar, zi ziVar, int[] iArr, org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        this.b = znVar;
        this.d = ziVar;
        this.e = iArr;
        this.c = u1Var;
        this.f = messageObject;
    }
}
