package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
