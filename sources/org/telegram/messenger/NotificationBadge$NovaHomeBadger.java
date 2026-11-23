package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements xr {
    @Override // org.telegram.messenger.xr
    public final void a(int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", as.d.getPackageName() + "/" + as.d.getClassName());
        contentValues.put("count", Integer.valueOf(i7));
        t0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.xr
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
