package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ChatsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        e4 e4Var = new e4();
        e4Var.a = new ArrayList();
        e4Var.g = new a0.h();
        e4Var.h = new a0.h();
        e4Var.b = applicationContext;
        org.telegram.ui.ActionBar.k6.T(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        e4Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i3 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i3 >= 0) {
            e4Var.d = c.a(i3);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        e4Var.i = sharedPreferences.getBoolean(sb2.toString(), false) || e4Var.d == null;
        return e4Var;
    }
}
