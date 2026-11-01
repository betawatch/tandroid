package e0;

import android.app.Notification;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
