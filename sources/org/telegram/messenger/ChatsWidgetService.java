package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class ChatsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        g4 g4Var = new g4();
        g4Var.a = new ArrayList();
        g4Var.g = new a0.h();
        g4Var.h = new a0.h();
        g4Var.b = applicationContext;
        org.telegram.ui.ActionBar.m6.T(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        g4Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i7 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i7 >= 0) {
            g4Var.d = c.a(i7);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        g4Var.i = sharedPreferences.getBoolean(sb2.toString(), false) || g4Var.d == null;
        return g4Var;
    }
}
