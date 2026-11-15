package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements zr {
    @Override // org.telegram.messenger.zr
    public final void a(int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", cs.d.getPackageName() + "/" + cs.d.getClassName());
        contentValues.put("count", Integer.valueOf(i7));
        t0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.zr
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
