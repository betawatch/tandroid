package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements wr {
    @Override // org.telegram.messenger.wr
    public final void a(int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", zr.d.getPackageName() + "/" + zr.d.getClassName());
        contentValues.put("count", Integer.valueOf(i7));
        t0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.wr
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
