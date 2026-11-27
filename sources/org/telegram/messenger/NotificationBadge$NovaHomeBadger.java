package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class NotificationBadge$NovaHomeBadger implements xm7 {
    @Override // xm7
    public final void a(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", zm7.d.getPackageName() + "/" + zm7.d.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        a.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override // xm7
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
