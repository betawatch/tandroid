package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
