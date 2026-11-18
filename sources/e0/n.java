package e0;

import android.app.Notification;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class n {
    public static Notification.BubbleMetadata a(o oVar) {
        if (oVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(oVar.a, oVar.b.m(null));
        builder.setDeleteIntent(null).setAutoExpandBubble((oVar.d & 1) != 0).setSuppressNotification((oVar.d & 2) != 0);
        int i7 = oVar.c;
        if (i7 != 0) {
            builder.setDesiredHeight(i7);
        }
        return builder.build();
    }
}
