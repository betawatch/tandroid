package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
