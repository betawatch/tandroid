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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void A(int i9, int i10);

    String B0();

    CharSequence C();

    void F();

    MediaMetadataCompat G();

    void H(String str, Bundle bundle);

    Bundle I();

    void J(b bVar);

    void K(String str, Bundle bundle);

    void N(String str, Bundle bundle);

    void O(int i9, int i10);

    void Q();

    void R(Uri uri, Bundle bundle);

    void S(long j10);

    void X(float f10);

    boolean Y(KeyEvent keyEvent);

    void a();

    void a0(RatingCompat ratingCompat, Bundle bundle);

    PlaybackStateCompat b();

    void c0(MediaDescriptionCompat mediaDescriptionCompat, int i9);

    void e(int i9);

    long f();

    void f0(boolean z10);

    int g();

    Bundle getExtras();

    String getTag();

    int i0();

    void j(String str, Bundle bundle);

    void j0(int i9);

    void k(b bVar);

    void k0();

    void l(RatingCompat ratingCompat);

    void m(Uri uri, Bundle bundle);

    void m0();

    void n0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void next();

    List o0();

    void p(MediaDescriptionCompat mediaDescriptionCompat);

    void previous();

    boolean q();

    void q0();

    void r(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent s();

    void stop();

    void t();

    void u(String str, Bundle bundle);

    void w0(long j10);

    ParcelableVolumeInfo y0();

    void z0(int i9);
}
