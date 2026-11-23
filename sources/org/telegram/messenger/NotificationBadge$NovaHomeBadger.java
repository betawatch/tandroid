package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
