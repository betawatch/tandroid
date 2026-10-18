package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$0(AccountInstance accountInstance, TLRPC.User user, int i10, long j10, int i11) {
        accountInstance.getMessagesController().putUser(user, true);
        MessagesController.getInstance(i10).markDialogAsRead(j10, i11, i11, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i10).markReactionsAsRead(j10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$1(AccountInstance accountInstance, long j10, int i10, int i11) {
        AndroidUtilities.runOnUIThread(new t(accountInstance, accountInstance.getMessagesStorage().getUserSync(j10), i10, j10, i11, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$2(AccountInstance accountInstance, TLRPC.Chat chat, int i10, long j10, int i11) {
        accountInstance.getMessagesController().putChat(chat, true);
        MessagesController.getInstance(i10).markDialogAsRead(j10, i11, i11, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i10).markReactionsAsRead(j10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$3(AccountInstance accountInstance, long j10, int i10, int i11) {
        AndroidUtilities.runOnUIThread(new t(accountInstance, accountInstance.getMessagesStorage().getChatSync(-j10), i10, j10, i11, 1));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        long longExtra = intent.getLongExtra("dialog_id", 0L);
        int intExtra = intent.getIntExtra("max_id", 0);
        int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !UserConfig.isValidAccount(intExtra2)) {
            return;
        }
        AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
        if (DialogObject.isUserDialog(longExtra)) {
            if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                Utilities.globalQueue.postRunnable(new s(accountInstance, longExtra, intExtra2, intExtra, 0));
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            Utilities.globalQueue.postRunnable(new s(accountInstance, longExtra, intExtra2, intExtra, 1));
            return;
        }
        MessagesController.getInstance(intExtra2).markDialogAsRead(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(intExtra2).markReactionsAsRead(longExtra, 0L);
    }
}
