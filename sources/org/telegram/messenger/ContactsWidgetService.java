package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ContactsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        ew2 ew2Var = new ew2();
        ew2Var.a = new ArrayList();
        ew2Var.g = new vh6();
        ew2Var.b = applicationContext;
        cmb.S(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        ew2Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            ew2Var.d = j5.a(i);
        }
        StringBuilder sb = new StringBuilder("deleted");
        sb.append(intExtra);
        ew2Var.h = sharedPreferences.getBoolean(sb.toString(), false) || ew2Var.d == null;
        return ew2Var;
    }
}
