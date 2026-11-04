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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ChatsWidgetProvider extends AppWidgetProvider {
    public static void a(Context context, AppWidgetManager appWidgetManager, int i3) {
        t0.w();
        int i10 = 2;
        while (i10 * 72 < appWidgetManager.getAppWidgetOptions(i3).getInt("appWidgetMaxHeight")) {
            i10++;
        }
        int i11 = i10 - 1;
        Intent intent = new Intent(context, (Class<?>) ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i3);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        boolean z10 = sharedPreferences.getBoolean("deleted" + i3, false);
        int i12 = R.layout.shortcut_widget_layout_1;
        if (!z10) {
            int i13 = sharedPreferences.getInt("account" + i3, -1);
            if (i13 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(k2.p1.i(i3, "account"), h10.t0);
                edit.putInt(TeXSymbolParser.TYPE_ATTR + i3, 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            if (i13 >= 0) {
                qr.a0(c.a(i13).a).q0(i3, 0, arrayList, null, null, false);
            }
            if (i11 != 1 && arrayList.size() > 1) {
                i12 = (i11 == 2 || arrayList.size() <= 2) ? R.layout.shortcut_widget_layout_2 : (i11 == 3 || arrayList.size() <= 3) ? R.layout.shortcut_widget_layout_3 : R.layout.shortcut_widget_layout_4;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i12);
        remoteViews.setRemoteAdapter(i3, R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(t0.b, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i3, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i3, R.id.list_view);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i3, Bundle bundle) {
        a(context, appWidgetManager, i3);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i3, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        t0.w();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i10 = sharedPreferences.getInt("account" + iArr[i3], -1);
            if (i10 >= 0) {
                qr a02 = qr.a0(c.a(i10).a);
                a02.a.c(new kp(a02, iArr[i3], 2));
            }
            edit.remove("account" + iArr[i3]);
            edit.remove(TeXSymbolParser.TYPE_ATTR + iArr[i3]);
            edit.remove("deleted" + iArr[i3]);
        }
        edit.commit();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i3 : iArr) {
            a(context, appWidgetManager, i3);
        }
    }
}
