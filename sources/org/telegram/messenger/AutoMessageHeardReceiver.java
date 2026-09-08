package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$0(AccountInstance accountInstance, TLRPC.User user, int i10, long j3, int i11) {
        accountInstance.getMessagesController().putUser(user, true);
        MessagesController.getInstance(i10).markDialogAsRead(j3, i11, i11, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i10).markReactionsAsRead(j3, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$1(AccountInstance accountInstance, long j3, int i10, int i11) {
        AndroidUtilities.runOnUIThread(new s(accountInstance, accountInstance.getMessagesStorage().getUserSync(j3), i10, j3, i11, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$2(AccountInstance accountInstance, TLRPC.Chat chat, int i10, long j3, int i11) {
        accountInstance.getMessagesController().putChat(chat, true);
        MessagesController.getInstance(i10).markDialogAsRead(j3, i11, i11, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(i10).markReactionsAsRead(j3, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$3(AccountInstance accountInstance, long j3, int i10, int i11) {
        AndroidUtilities.runOnUIThread(new s(accountInstance, accountInstance.getMessagesStorage().getChatSync(-j3), i10, j3, i11, 1));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ApplicationLoader.postInitApplication();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra == 0 || intExtra == 0 || !UserConfig.isValidAccount(intExtra2)) {
            return;
        }
        final AccountInstance accountInstance = AccountInstance.getInstance(intExtra2);
        if (DialogObject.isUserDialog(longExtra)) {
            if (accountInstance.getMessagesController().getUser(Long.valueOf(longExtra)) == null) {
                final int i10 = 0;
                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                AutoMessageHeardReceiver.lambda$onReceive$1(accountInstance, longExtra, intExtra2, intExtra);
                                break;
                            default:
                                AutoMessageHeardReceiver.lambda$onReceive$3(accountInstance, longExtra, intExtra2, intExtra);
                                break;
                        }
                    }
                });
                return;
            }
        } else if (DialogObject.isChatDialog(longExtra) && accountInstance.getMessagesController().getChat(Long.valueOf(-longExtra)) == null) {
            final int i11 = 1;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.q
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            AutoMessageHeardReceiver.lambda$onReceive$1(accountInstance, longExtra, intExtra2, intExtra);
                            break;
                        default:
                            AutoMessageHeardReceiver.lambda$onReceive$3(accountInstance, longExtra, intExtra2, intExtra);
                            break;
                    }
                }
            });
            return;
        }
        MessagesController.getInstance(intExtra2).markDialogAsRead(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
        MessagesController.getInstance(intExtra2).markReactionsAsRead(longExtra, 0L);
    }
}
