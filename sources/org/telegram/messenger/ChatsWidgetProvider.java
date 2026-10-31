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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ChatsWidgetProvider extends AppWidgetProvider {
    public static void a(Context context, AppWidgetManager appWidgetManager, int i10) {
        w0.w();
        int i11 = 2;
        while (i11 * 72 < appWidgetManager.getAppWidgetOptions(i10).getInt("appWidgetMaxHeight")) {
            i11++;
        }
        int i12 = i11 - 1;
        Intent intent = new Intent(context, (Class<?>) ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i10);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        boolean z10 = sharedPreferences.getBoolean("deleted" + i10, false);
        int i13 = R.layout.shortcut_widget_layout_1;
        if (!z10) {
            int i14 = sharedPreferences.getInt("account" + i10, -1);
            if (i14 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(i0.a.i(i10, "account"), d20.s0);
                edit.putInt(TeXSymbolParser.TYPE_ATTR + i10, 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            if (i14 >= 0) {
                hs.a0(c.a(i14).a).q0(i10, 0, arrayList, null, null, false);
            }
            if (i12 != 1 && arrayList.size() > 1) {
                i13 = (i12 == 2 || arrayList.size() <= 2) ? R.layout.shortcut_widget_layout_2 : (i12 == 3 || arrayList.size() <= 3) ? R.layout.shortcut_widget_layout_3 : R.layout.shortcut_widget_layout_4;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i13);
        remoteViews.setRemoteAdapter(i10, R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(w0.b, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i10, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i10, R.id.list_view);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        a(context, appWidgetManager, i10);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i10, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        w0.w();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = sharedPreferences.getInt("account" + iArr[i10], -1);
            if (i11 >= 0) {
                hs a02 = hs.a0(c.a(i11).a);
                a02.a.c(new yp(a02, iArr[i10], 2));
            }
            edit.remove("account" + iArr[i10]);
            edit.remove(TeXSymbolParser.TYPE_ATTR + iArr[i10]);
            edit.remove("deleted" + iArr[i10]);
        }
        edit.commit();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i10 : iArr) {
            a(context, appWidgetManager, i10);
        }
    }
}
