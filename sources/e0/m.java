package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class m {
    public static Notification.BubbleMetadata a(o oVar) {
        PendingIntent pendingIntent;
        if (oVar == null || (pendingIntent = oVar.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(oVar.b.m(null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((oVar.d & 1) != 0).setSuppressNotification((oVar.d & 2) != 0);
        int i7 = oVar.c;
        if (i7 != 0) {
            suppressNotification.setDesiredHeight(i7);
        }
        return suppressNotification.build();
    }
}
