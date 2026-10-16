package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class n {
    public static Notification.BubbleMetadata a(p pVar) {
        PendingIntent pendingIntent;
        if (pVar == null || (pendingIntent = pVar.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(pVar.b.m(null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((pVar.d & 1) != 0).setSuppressNotification((pVar.d & 2) != 0);
        int i10 = pVar.c;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        return suppressNotification.build();
    }
}
