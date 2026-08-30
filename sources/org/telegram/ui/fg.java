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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xn b;
    public final /* synthetic */ org.telegram.ui.Cells.t1 c;
    public final /* synthetic */ af.f d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fg(xn xnVar, vi viVar, org.telegram.ui.Cells.t1 t1Var, String str, CharacterStyle characterStyle) {
        this.b = xnVar;
        this.d = viVar;
        this.c = t1Var;
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
                xn xnVar = this.b;
                org.telegram.ui.Cells.t1 t1Var2 = this.c;
                org.telegram.ui.Components.o70 I = org.telegram.ui.Components.o70.I(xnVar, t1Var2);
                org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(xnVar.getParentActivity(), xnVar.ba);
                I.p = new pe(im0Var, 0);
                if (j10 != 0) {
                    bool = bool2;
                    z11 = false;
                    I.c(z4 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z4 ? R.string.ViewChannel : R.string.SendMessage), new gg.y0(xnVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z11 = false;
                }
                boolean z12 = z4;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ve(xnVar, im0Var, str, 1), z11);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new qe(xnVar, str, 11), z11);
                }
                I.k();
                if (j10 != 0) {
                    I.n(tLObject, LocaleController.getString(z10 ? R.string.ViewProfile : z12 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new gg.y0(xnVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                im0Var.e(I);
                im0Var.f(t1Var2, characterStyle, null, false);
                xnVar.showDialog(im0Var);
                break;
            default:
                wi wiVar = (wi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                xn xnVar2 = this.b;
                if (xnVar2.xb == wiVar) {
                    iArr[0] = 0;
                    wiVar.c(false);
                    if (messages_messages != null) {
                        xnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        xnVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            jn jnVar = xnVar2.mc;
                            if (jnVar != null && (t1Var = this.c) != null) {
                                jnVar.k(t1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fg(xn xnVar, wi wiVar, int[] iArr, org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        this.b = xnVar;
        this.d = wiVar;
        this.e = iArr;
        this.c = t1Var;
        this.f = messageObject;
    }
}
