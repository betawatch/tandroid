package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
