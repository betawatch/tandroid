package org.telegram.messenger;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationBadge$SonyHomeBadger implements zr {
    public static bs b;
    public final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        if (t0.b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", cs.d.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", cs.d.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i7));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i7 > 0);
            g0.h3(new s(intent, 5));
            return;
        }
        if (i7 < 0) {
            return;
        }
        if (b == null) {
            b = new bs(t0.b.getApplicationContext().getContentResolver());
        }
        String packageName = cs.d.getPackageName();
        String className = cs.d.getClassName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i7));
        contentValues.put("package_name", packageName);
        contentValues.put("activity_name", className);
        b.startInsert(0, null, this.a, contentValues);
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
