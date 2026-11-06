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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class ChatsWidgetProvider extends AppWidgetProvider {
    public static void a(Context context, AppWidgetManager appWidgetManager, int i7) {
        t0.w();
        int i10 = 2;
        while (i10 * 72 < appWidgetManager.getAppWidgetOptions(i7).getInt("appWidgetMaxHeight")) {
            i10++;
        }
        int i11 = i10 - 1;
        Intent intent = new Intent(context, (Class<?>) ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i7);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        boolean z9 = sharedPreferences.getBoolean("deleted" + i7, false);
        int i12 = R.layout.shortcut_widget_layout_1;
        if (!z9) {
            int i13 = sharedPreferences.getInt("account" + i7, -1);
            if (i13 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(jg.g.j(i7, "account"), p10.s0);
                edit.putInt(TeXSymbolParser.TYPE_ATTR + i7, 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            if (i13 >= 0) {
                yr.a0(c.a(i13).a).q0(i7, 0, arrayList, null, null, false);
            }
            if (i11 != 1 && arrayList.size() > 1) {
                i12 = (i11 == 2 || arrayList.size() <= 2) ? R.layout.shortcut_widget_layout_2 : (i11 == 3 || arrayList.size() <= 3) ? R.layout.shortcut_widget_layout_3 : R.layout.shortcut_widget_layout_4;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i12);
        remoteViews.setRemoteAdapter(i7, R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(t0.b, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i7, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i7, R.id.list_view);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i7, Bundle bundle) {
        a(context, appWidgetManager, i7);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i7, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        t0.w();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i10 = sharedPreferences.getInt("account" + iArr[i7], -1);
            if (i10 >= 0) {
                yr a02 = yr.a0(c.a(i10).a);
                a02.a.c(new tp(a02, iArr[i7], 2));
            }
            edit.remove("account" + iArr[i7]);
            edit.remove(TeXSymbolParser.TYPE_ATTR + iArr[i7]);
            edit.remove("deleted" + iArr[i7]);
        }
        edit.commit();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i7 : iArr) {
            a(context, appWidgetManager, i7);
        }
    }
}
