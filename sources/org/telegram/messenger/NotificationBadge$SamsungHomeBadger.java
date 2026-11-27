package org.telegram.messenger;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class NotificationBadge$SamsungHomeBadger implements xm7 {
    public static final String[] a = {"_id", "class"};
    public static NotificationBadge$DefaultBadger b;

    public static ContentValues c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // xm7
    public final void a(int i) {
        try {
            NotificationBadge$DefaultBadger notificationBadge$DefaultBadger = b;
            if (notificationBadge$DefaultBadger == null) {
                notificationBadge$DefaultBadger = new NotificationBadge$DefaultBadger();
                b = notificationBadge$DefaultBadger;
            }
            notificationBadge$DefaultBadger.a(i);
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = a.b.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, a, "package=?", new String[]{zm7.d.getPackageName()}, null);
            if (cursor != null) {
                String className = zm7.d.getClassName();
                boolean z = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(zm7.d, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z = true;
                    }
                }
                if (!z) {
                    contentResolver.insert(parse, c(zm7.d, i, true));
                }
            }
            if (cursor == null || cursor.isClosed()) {
                return;
            }
            cursor.close();
        } finally {
        }
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
