package org.telegram.messenger;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$SonyHomeBadger implements ls {
    public static ns b;
    public final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        if (w0.b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", os.d.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", os.d.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i10));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i10 > 0);
            i0.g3(new t(intent, 5));
            return;
        }
        if (i10 < 0) {
            return;
        }
        if (b == null) {
            b = new ns(w0.b.getApplicationContext().getContentResolver());
        }
        String packageName = os.d.getPackageName();
        String className = os.d.getClassName();
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i10));
        contentValues.put("package_name", packageName);
        contentValues.put("activity_name", className);
        b.startInsert(0, null, this.a, contentValues);
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
