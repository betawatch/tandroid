package c2;

import a4.k;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.y;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c extends y {
    public int[] e;
    public MediaSessionCompat$Token f;

    @Override // e0.y
    public final void b(k kVar) {
        Notification.Builder builder = (Notification.Builder) kVar.d;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            a.d(builder, a.b(a.a(), this.e, this.f));
        }
    }
}
