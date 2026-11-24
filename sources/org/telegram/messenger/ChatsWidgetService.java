package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViewsService;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ChatsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        vf2 vf2Var = new vf2();
        vf2Var.a = new ArrayList();
        vf2Var.g = new vf6();
        vf2Var.h = new vf6();
        vf2Var.b = applicationContext;
        bkb.S(applicationContext);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        vf2Var.c = intExtra;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("shortcut_widget", 0);
        int i = sharedPreferences.getInt("account" + intExtra, -1);
        if (i >= 0) {
            vf2Var.d = j5.a(i);
        }
        StringBuilder sb = new StringBuilder("deleted");
        sb.append(intExtra);
        vf2Var.i = sharedPreferences.getBoolean(sb.toString(), false) || vf2Var.d == null;
        return vf2Var;
    }
}
