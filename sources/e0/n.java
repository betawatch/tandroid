package e0;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
