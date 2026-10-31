package e0;

import android.app.Notification;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class o {
    public static Notification.BubbleMetadata a(p pVar) {
        if (pVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(pVar.a, pVar.b.m(null));
        builder.setDeleteIntent(null).setAutoExpandBubble((pVar.d & 1) != 0).setSuppressNotification((pVar.d & 2) != 0);
        int i10 = pVar.c;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        return builder.build();
    }
}
