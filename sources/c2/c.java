package c2;

import a4.k;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.y;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
