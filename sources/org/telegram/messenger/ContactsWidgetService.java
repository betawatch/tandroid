package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class ContactsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        k5 k5Var = new k5();
        k5Var.a = new ArrayList();
        k5Var.g = new a0.h();
        k5Var.b = applicationContext;
        org.telegram.ui.ActionBar.m6.T(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        k5Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i7 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i7 >= 0) {
            k5Var.d = c.a(i7);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        k5Var.h = sharedPreferences.getBoolean(sb2.toString(), false) || k5Var.d == null;
        return k5Var;
    }
}
