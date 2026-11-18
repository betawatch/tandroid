package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements wr {
    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", zr.d.getPackageName() + "/" + zr.d.getClassName());
        contentValues.put("count", Integer.valueOf(i7));
        t0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
