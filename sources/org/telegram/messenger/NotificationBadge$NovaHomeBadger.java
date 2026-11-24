package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements yj7 {
    @Override // yj7
    public final void a(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", ak7.d.getPackageName() + "/" + ak7.d.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        a.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // yj7
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
