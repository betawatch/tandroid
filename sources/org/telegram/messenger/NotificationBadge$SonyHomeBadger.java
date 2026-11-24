package org.telegram.messenger;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationBadge$SonyHomeBadger implements yj7 {
    public static zj7 b;
    public final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override // yj7
    public final void a(int i) {
        if (a.b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", ak7.d.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", ak7.d.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
            gl.c3(new hk(intent, (byte) 5));
            return;
        }
        if (i < 0) {
            return;
        }
        if (b == null) {
            b = new zj7(a.b.getApplicationContext().getContentResolver());
        }
        String packageName = ak7.d.getPackageName();
        String className = ak7.d.getClassName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", packageName);
        contentValues.put("activity_name", className);
        b.startInsert(0, null, this.a, contentValues);
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
