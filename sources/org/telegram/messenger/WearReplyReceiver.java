package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class WearReplyReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceive$0(AccountInstance accountInstance, TLRPC.User user, CharSequence charSequence, long j10, long j11, int i9, int[] iArr) {
        accountInstance.getMessagesController().putUser(user, true);
        sendMessage(accountInstance, charSequence, j10, j11, i9, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceive$1(AccountInstance accountInstance, long j10, CharSequence charSequence, long j11, int i9, int[] iArr) {
        AndroidUtilities.runOnUIThread(new kc(this, accountInstance, accountInstance.getMessagesStorage().getUserSync(j10), charSequence, j10, j11, i9, iArr, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceive$2(AccountInstance accountInstance, TLRPC.Chat chat, CharSequence charSequence, long j10, long j11, int i9, int[] iArr) {
        accountInstance.getMessagesController().putChat(chat, true);
        sendMessage(accountInstance, charSequence, j10, j11, i9, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceive$3(AccountInstance accountInstance, long j10, CharSequence charSequence, long j11, int i9, int[] iArr) {
        AndroidUtilities.runOnUIThread(new kc(this, accountInstance, accountInstance.getMessagesStorage().getChatSync(-j10), charSequence, j10, j11, i9, iArr, 3));
    }

    private void sendMessage(AccountInstance accountInstance, CharSequence charSequence, long j10, long j11, int i9, int[] iArr) {
        MessageObject messageObject;
        MessageObject messageObject2 = null;
        if (i9 != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = i9;
            tL_message.peer_id = accountInstance.getMessagesController().getPeer(j10);
            messageObject = new MessageObject(accountInstance.getCurrentAccount(), tL_message, false, false);
        } else {
            messageObject = null;
        }
        if (j11 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.id = (int) j11;
            tL_message2.peer_id = accountInstance.getMessagesController().getPeer(j10);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            messageObject2 = new MessageObject(accountInstance.getCurrentAccount(), tL_message2, false, false);
        }
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, messageObject, messageObject2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>(iArr.length);
            int length = iArr.length;
            int i10 = 0;
            while (i10 < length) {
                i10 = j3.r0.e(iArr[i10], i10, 1, arrayList);
            }
            accountInstance.getMessagesStorage().markVoiceMessageContentAsRead(j10, arrayList);
        }
        if (j11 == 0) {
            accountInstance.getMessagesController().markDialogAsRead(j10, i9, i9, 0, false, j11, 0, true, 0);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null) {
            return;
        }
        final CharSequence charSequence = resultsFromIntent.getCharSequence(NotificationsController.EXTRA_VOICE_REPLY);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final long longExtra2 = intent.getLongExtra("topic_id", 0L);
        int intExtra2 = intent.getIntExtra("currentAccount", 0);
        final int[] intArrayExtra = intent.getIntArrayExtra("voice_msg_ids");
        if (longExtra == 0 || intExtra == 0 || !UserConfig.isValidAccount(intExtra2)) {
            return;
        }
        final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
        if (DialogObject.isUserDialog(longExtra)) {
            if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                final int i9 = 0;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: org.telegram.messenger.nl
                    public final /* synthetic */ WearReplyReceiver b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.b.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                break;
                            default:
                                this.b.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                                break;
                        }
                    }
                });
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            final int i10 = 1;
            Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: org.telegram.messenger.nl
                public final /* synthetic */ WearReplyReceiver b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.lambda$onReceive$1(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                            break;
                        default:
                            this.b.lambda$onReceive$3(accountInstance, longExtra, charSequence, longExtra2, intExtra, intArrayExtra);
                            break;
                    }
                }
            });
            return;
        }
        sendMessage(accountInstance, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
    }
}
