package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ChatsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        h4 h4Var = new h4();
        h4Var.a = new ArrayList();
        h4Var.g = new a0.h();
        h4Var.h = new a0.h();
        h4Var.b = applicationContext;
        org.telegram.ui.ActionBar.t6.T(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        h4Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i10 = sharedPreferences.getInt("account" + intExtra, -1);
        if (i10 >= 0) {
            h4Var.d = c.a(i10);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(intExtra);
        h4Var.i = sharedPreferences.getBoolean(sb2.toString(), false) || h4Var.d == null;
        return h4Var;
    }
}
