package org.telegram.messenger;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class NotificationBadge$SonyHomeBadger implements cs {
    public static es b;
    public final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        if (t0.b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", fs.d.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", fs.d.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i7));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i7 > 0);
            g0.h3(new s(intent, 5));
            return;
        }
        if (i7 < 0) {
            return;
        }
        if (b == null) {
            b = new es(t0.b.getApplicationContext().getContentResolver());
        }
        String packageName = fs.d.getPackageName();
        String className = fs.d.getClassName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i7));
        contentValues.put("package_name", packageName);
        contentValues.put("activity_name", className);
        b.startInsert(0, null, this.a, contentValues);
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
