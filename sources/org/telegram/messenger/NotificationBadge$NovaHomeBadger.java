package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements bm7 {
    @Override // bm7
    public final void a(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", dm7.d.getPackageName() + "/" + dm7.d.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        a.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // bm7
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
