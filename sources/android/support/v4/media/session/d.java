package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public interface d extends IInterface {
    CharSequence A();

    String B0();

    void D();

    MediaMetadataCompat F();

    void G(String str, Bundle bundle);

    Bundle H();

    void I(b bVar);

    void J(String str, Bundle bundle);

    void L(String str, Bundle bundle);

    void M(int i10, int i11);

    void O();

    void P(Uri uri, Bundle bundle);

    void R(long j10);

    void W(float f9);

    boolean X(KeyEvent keyEvent);

    void Z(RatingCompat ratingCompat, Bundle bundle);

    void a();

    PlaybackStateCompat b();

    void b0(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void e(int i10);

    void e0(boolean z10);

    long f();

    int g();

    Bundle getExtras();

    String getTag();

    void j(String str, Bundle bundle);

    int j0();

    void k(b bVar);

    void k0(int i10);

    void l(RatingCompat ratingCompat);

    void l0();

    void m(Uri uri, Bundle bundle);

    void n(MediaDescriptionCompat mediaDescriptionCompat);

    void next();

    boolean o();

    void o0();

    void p0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void previous();

    void q(MediaDescriptionCompat mediaDescriptionCompat);

    List q0();

    PendingIntent r();

    void r0();

    void s();

    void stop();

    void t(String str, Bundle bundle);

    void w0(long j10);

    void x(int i10, int i11);

    ParcelableVolumeInfo x0();

    void y0(int i10);
}
