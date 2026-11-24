package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
