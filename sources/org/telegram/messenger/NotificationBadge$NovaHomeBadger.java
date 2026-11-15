package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements zr {
    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", cs.d.getPackageName() + "/" + cs.d.getClassName());
        contentValues.put("count", Integer.valueOf(i7));
        t0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
