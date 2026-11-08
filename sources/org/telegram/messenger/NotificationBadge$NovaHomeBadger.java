package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements cs {
    @Override // org.telegram.messenger.cs
    public final void a(int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", fs.d.getPackageName() + "/" + fs.d.getClassName());
        contentValues.put("count", Integer.valueOf(i7));
        t0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.cs
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
