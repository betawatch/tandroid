package org.telegram.messenger;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$SamsungHomeBadger implements ls {
    public static final String[] a = {"_id", "class"};
    public static NotificationBadge$DefaultBadger b;

    public static ContentValues c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        try {
            if (b == null) {
                b = new NotificationBadge$DefaultBadger();
            }
            b.a(i10);
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = w0.b.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, a, "package=?", new String[]{os.d.getPackageName()}, null);
            if (cursor != null) {
                String className = os.d.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(os.d, i10, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, c(os.d, i10, true));
                }
            }
            if (cursor == null || cursor.isClosed()) {
                return;
            }
            cursor.close();
        } finally {
        }
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
