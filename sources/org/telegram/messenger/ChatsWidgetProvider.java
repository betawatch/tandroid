package org.telegram.messenger;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ChatsWidgetProvider extends AppWidgetProvider {
    public static void a(Context context, AppWidgetManager appWidgetManager, int i) {
        a.v();
        int i2 = 2;
        while (i2 * 72 < appWidgetManager.getAppWidgetOptions(i).getInt("appWidgetMaxHeight")) {
            i2++;
        }
        int i3 = i2 - 1;
        Intent intent = new Intent(context, (Class<?>) ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        boolean z = sharedPreferences.getBoolean("deleted" + i, false);
        int i4 = R.layout.shortcut_widget_layout_1;
        if (!z) {
            int i5 = sharedPreferences.getInt("account" + i, -1);
            if (i5 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(uh9.k(i, "account"), yac.t0);
                edit.putInt(TeXSymbolParser.TYPE_ATTR + i, 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            if (i5 >= 0) {
                kf7.a0(k5.a(i5).a).p0(i, 0, arrayList, null, null, false);
            }
            if (i3 != 1 && arrayList.size() > 1) {
                i4 = (i3 == 2 || arrayList.size() <= 2) ? R.layout.shortcut_widget_layout_2 : (i3 == 3 || arrayList.size() <= 3) ? R.layout.shortcut_widget_layout_3 : R.layout.shortcut_widget_layout_4;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i4);
        remoteViews.setRemoteAdapter(i, R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(a.b, (Class<?>) LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(a.b, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i, R.id.list_view);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        a(context, appWidgetManager, i);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        a.v();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = sharedPreferences.getInt("account" + iArr[i], -1);
            if (i2 >= 0) {
                kf7 a0 = kf7.a0(k5.a(i2).a);
                a0.a.c(new bd7(a0, iArr[i], (byte) 1));
            }
            edit.remove("account" + iArr[i]);
            edit.remove(TeXSymbolParser.TYPE_ATTR + iArr[i]);
            edit.remove("deleted" + iArr[i]);
        }
        edit.commit();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i : iArr) {
            a(context, appWidgetManager, i);
        }
    }
}
