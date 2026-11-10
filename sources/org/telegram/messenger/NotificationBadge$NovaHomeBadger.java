package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
