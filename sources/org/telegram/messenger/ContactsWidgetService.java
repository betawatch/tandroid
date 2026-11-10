package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class ContactsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        i5 i5Var = new i5();
        i5Var.a = new ArrayList();
        i5Var.g = new a0.h();
        i5Var.b = applicationContext;
        org.telegram.ui.ActionBar.m6.T(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        i5Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i7 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i7 >= 0) {
            i5Var.d = c.a(i7);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        i5Var.h = sharedPreferences.getBoolean(sb2.toString(), false) || i5Var.d == null;
        return i5Var;
    }
}
