package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ContactsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        ov2 ov2Var = new ov2();
        ov2Var.a = new ArrayList();
        ov2Var.g = new zh6();
        ov2Var.b = applicationContext;
        aob.S(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        ov2Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            ov2Var.d = k5.a(i);
        }
        StringBuilder sb = new StringBuilder("deleted");
        sb.append(intExtra);
        ov2Var.h = sharedPreferences.getBoolean(sb.toString(), false) || ov2Var.d == null;
        return ov2Var;
    }
}
