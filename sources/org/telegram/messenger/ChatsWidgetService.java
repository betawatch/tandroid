package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class ChatsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        ng2 ng2Var = new ng2();
        ng2Var.a = new ArrayList();
        ng2Var.g = new zh6();
        ng2Var.h = new zh6();
        ng2Var.b = applicationContext;
        aob.S(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        ng2Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            ng2Var.d = k5.a(i);
        }
        StringBuilder sb = new StringBuilder("deleted");
        sb.append(intExtra);
        ng2Var.i = sharedPreferences.getBoolean(sb.toString(), false) || ng2Var.d == null;
        return ng2Var;
    }
}
