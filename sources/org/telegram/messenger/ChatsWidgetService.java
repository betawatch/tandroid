package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ChatsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        ih2 ih2Var = new ih2();
        ih2Var.a = new ArrayList();
        ih2Var.g = new vh6();
        ih2Var.h = new vh6();
        ih2Var.b = applicationContext;
        cmb.S(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        ih2Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            ih2Var.d = j5.a(i);
        }
        StringBuilder sb = new StringBuilder("deleted");
        sb.append(intExtra);
        ih2Var.i = sharedPreferences.getBoolean(sb.toString(), false) || ih2Var.d == null;
        return ih2Var;
    }
}
