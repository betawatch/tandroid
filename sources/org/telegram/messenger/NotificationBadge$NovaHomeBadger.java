package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements ms {
    @Override // org.telegram.messenger.ms
    public final void a(int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", ps.d.getPackageName() + "/" + ps.d.getClassName());
        contentValues.put("count", Integer.valueOf(i10));
        w0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.ms
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
