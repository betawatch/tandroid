package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ContactsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        tu2 tu2Var = new tu2();
        tu2Var.a = new ArrayList();
        tu2Var.g = new vf6();
        tu2Var.b = applicationContext;
        bkb.S(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        tu2Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            tu2Var.d = j5.a(i);
        }
        StringBuilder sb = new StringBuilder("deleted");
        sb.append(intExtra);
        tu2Var.h = sharedPreferences.getBoolean(sb.toString(), false) || tu2Var.d == null;
        return tu2Var;
    }
}
