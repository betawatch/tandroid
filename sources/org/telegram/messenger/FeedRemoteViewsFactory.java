package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FeedRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory, NotificationCenter.NotificationCenterDelegate {
    private AccountInstance accountInstance;
    private int classGuid;
    private long dialogId;
    private Context mContext;
    private ArrayList<MessageObject> messages = new ArrayList<>();
    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public FeedRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            this.dialogId = sharedPreferences.getLong("dialogId" + intExtra, 0L);
            this.accountInstance = AccountInstance.getInstance(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDataSetChanged$0() {
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        if (this.classGuid == 0) {
            this.classGuid = ConnectionsManager.generateClassGuid();
        }
        this.accountInstance.getMessagesController().loadMessages(this.dialogId, 0L, false, 20, 0, 0, true, 0, this.classGuid, 0, 0, 0, 0L, 0, 1, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.messagesDidLoad && ((Integer) objArr[10]).intValue() == this.classGuid) {
            this.messages.clear();
            this.messages.addAll((ArrayList) objArr[2]);
            this.countDownLatch.countDown();
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.messages.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RemoteViews getViewAt(int i) {
        int i2;
        CharSequence charSequence;
        ArrayList<TLRPC.PhotoSize> arrayList;
        File pathToAttach;
        MessageObject messageObject = this.messages.get(i);
        RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), R.layout.feed_widget_item);
        if (messageObject.type == 0) {
            i2 = R.id.feed_widget_item_text;
            charSequence = messageObject.messageText;
        } else {
            if (TextUtils.isEmpty(messageObject.caption)) {
                remoteViews.setViewVisibility(R.id.feed_widget_item_text, 8);
                arrayList = messageObject.photoThumbs;
                if (arrayList != null && !arrayList.isEmpty()) {
                    pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize()));
                    if (pathToAttach.exists()) {
                        int i3 = R.id.feed_widget_item_image;
                        remoteViews.setViewVisibility(i3, 0);
                        Uri uriForFile = FileProvider.getUriForFile(this.mContext, ApplicationLoader.getApplicationId() + ".provider", pathToAttach);
                        grantUriAccessToWidget(this.mContext, uriForFile);
                        remoteViews.setImageViewUri(i3, uriForFile);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chatId", -messageObject.getDialogId());
                        bundle.putInt("message_id", messageObject.getId());
                        bundle.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                        Intent intent = new Intent();
                        intent.putExtras(bundle);
                        remoteViews.setOnClickFillInIntent(R.id.shortcut_widget_item, intent);
                        return remoteViews;
                    }
                }
                remoteViews.setViewVisibility(R.id.feed_widget_item_image, 8);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chatId", -messageObject.getDialogId());
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putInt("currentAccount", this.accountInstance.getCurrentAccount());
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                return remoteViews;
            }
            i2 = R.id.feed_widget_item_text;
            charSequence = messageObject.caption;
        }
        remoteViews.setTextViewText(i2, charSequence);
        remoteViews.setViewVisibility(i2, 0);
        arrayList = messageObject.photoThumbs;
        if (arrayList != null) {
            pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize()));
            if (pathToAttach.exists()) {
            }
        }
        remoteViews.setViewVisibility(R.id.feed_widget_item_image, 8);
        Bundle bundle22 = new Bundle();
        bundle22.putLong("chatId", -messageObject.getDialogId());
        bundle22.putInt("message_id", messageObject.getId());
        bundle22.putInt("currentAccount", this.accountInstance.getCurrentAccount());
        Intent intent22 = new Intent();
        intent22.putExtras(bundle22);
        remoteViews.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 1;
    }

    protected void grantUriAccessToWidget(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uri, 1);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        ApplicationLoader.postInitApplication();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance == null || !accountInstance.getUserConfig().isClientActivated()) {
            this.messages.clear();
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FeedRemoteViewsFactory$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FeedRemoteViewsFactory.this.lambda$onDataSetChanged$0();
            }
        });
        try {
            this.countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }
}
