package e0;

import android.app.Notification;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class q {
    public static Notification.BubbleMetadata a(r rVar) {
        if (rVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(rVar.a, rVar.b.m(null));
        builder.setDeleteIntent(null).setAutoExpandBubble((rVar.d & 1) != 0).setSuppressNotification((rVar.d & 2) != 0);
        int i10 = rVar.c;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        return builder.build();
    }
}
