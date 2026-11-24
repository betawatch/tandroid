package org.telegram.messenger;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationBadge$SonyHomeBadger implements bm7 {
    public static cm7 b;
    public final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override // bm7
    public final void a(int i) {
        if (a.b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", dm7.d.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", dm7.d.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
            gm.c3(new hl(intent, (byte) 5));
            return;
        }
        if (i < 0) {
            return;
        }
        if (b == null) {
            b = new cm7(a.b.getApplicationContext().getContentResolver());
        }
        String packageName = dm7.d.getPackageName();
        String className = dm7.d.getClassName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", packageName);
        contentValues.put("activity_name", className);
        b.startInsert(0, null, this.a, contentValues);
    }

    @Override // bm7
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
