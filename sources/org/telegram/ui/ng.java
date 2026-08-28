package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements wu0, wx {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ng(qn qnVar, boolean z10, MessageObject messageObject, int i9) {
        this.c = qnVar;
        this.a = z10;
        this.d = messageObject;
        this.b = i9;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.wx
    public /* synthetic */ boolean I(dy dyVar) {
        return false;
    }

    @Override // org.telegram.ui.wu0
    public void b(TLRPC.MessageMedia messageMedia) {
        int i9;
        qn qnVar = (qn) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        if (!this.a) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            messageObject.messageOwner.media = messageMedia;
            qnVar.getSendMessagesHelper().editMessage(messageObject, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = qnVar.getMessagesController().getInputPeer(messageObject.getDialogId());
        tL_messages_appendTodoList.msg_id = messageObject.getId();
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i9 = this.b;
                if (i10 >= i9) {
                    break;
                }
                i11 = Math.max(i11, tL_messageMediaToDo.todo.list.get(i10).id);
                i10++;
            }
            while (i9 < tL_messageMediaToDo.todo.list.size()) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i9);
                if (todoItem.id <= i11) {
                    todoItem.id = i11 + 1;
                }
                tL_messages_appendTodoList.list.add(todoItem);
                i11 = Math.max(i11, todoItem.id);
                i9++;
            }
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        messageObject.messageOwner.media = messageMedia;
        qnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    @Override // org.telegram.ui.wx
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        Pattern pattern = LaunchActivity.x1;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (DialogObject.isEncryptedDialog(j10)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
        } else if (DialogObject.isUserDialog(j10)) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        int i11 = this.b;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, dyVar)) {
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i11).saveDraft(j10, 0, str, null, null, false, 0L);
            ((ActionBarLayout) launchActivity.O()).S(new qn(bundle), true, false);
        }
        return true;
    }

    public /* synthetic */ ng(LaunchActivity launchActivity, boolean z10, int i9, String str) {
        this.c = launchActivity;
        this.a = z10;
        this.b = i9;
        this.d = str;
    }
}
