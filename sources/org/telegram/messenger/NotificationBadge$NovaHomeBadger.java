package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements ls {
    @Override // org.telegram.messenger.ls
    public final void a(int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", os.d.getPackageName() + "/" + os.d.getClassName());
        contentValues.put("count", Integer.valueOf(i10));
        w0.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // org.telegram.messenger.ls
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
