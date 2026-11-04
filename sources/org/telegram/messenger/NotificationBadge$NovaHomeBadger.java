package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements ur {
    @Override // org.telegram.messenger.ur
    public final void a(int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", wr.d.getPackageName() + "/" + wr.d.getClassName());
        contentValues.put("count", Integer.valueOf(i3));
        t0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.ur
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
