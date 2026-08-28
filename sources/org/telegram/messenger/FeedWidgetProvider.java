package org.telegram.messenger;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FeedWidgetProvider extends AppWidgetProvider {
    public static void updateWidget(Context context, AppWidgetManager appWidgetManager, int i9) {
        Intent intent = new Intent(context, (Class<?>) FeedWidgetService.class);
        intent.putExtra("appWidgetId", i9);
        intent.setData(Uri.parse(intent.toUri(1)));
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.feed_widget_layout);
        remoteViews.setRemoteAdapter(R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i9, remoteViews);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        for (int i9 = 0; i9 < iArr.length; i9++) {
            context.getSharedPreferences("shortcut_widget", 0).edit().remove("account" + iArr[i9]).remove("dialogId" + iArr[i9]).commit();
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i9 : iArr) {
            updateWidget(context, appWidgetManager, i9);
        }
    }
}
