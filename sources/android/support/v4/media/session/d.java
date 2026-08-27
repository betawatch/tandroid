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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public interface d extends IInterface {
    CharSequence A();

    String B0();

    void E();

    MediaMetadataCompat F();

    void G(String str, Bundle bundle);

    Bundle H();

    void I(b bVar);

    void K(String str, Bundle bundle);

    void N(String str, Bundle bundle);

    void O(int i10, int i11);

    void Q();

    void R(Uri uri, Bundle bundle);

    void S(long j10);

    void X(float f10);

    void a();

    boolean a0(KeyEvent keyEvent);

    PlaybackStateCompat b();

    void e(int i10);

    void e0(RatingCompat ratingCompat, Bundle bundle);

    long f();

    int g();

    void g0(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    Bundle getExtras();

    String getTag();

    void i(String str, Bundle bundle);

    void j(b bVar);

    void j0(boolean z10);

    void k(RatingCompat ratingCompat);

    void m(Uri uri, Bundle bundle);

    int m0();

    void n(MediaDescriptionCompat mediaDescriptionCompat);

    void n0(int i10);

    void next();

    boolean o();

    void o0();

    void p(MediaDescriptionCompat mediaDescriptionCompat);

    void previous();

    PendingIntent r();

    void r0();

    void s();

    void s0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void stop();

    void t(String str, Bundle bundle);

    List t0();

    void v0();

    void x(int i10, int i11);

    void x0(long j10);

    ParcelableVolumeInfo y0();

    void z0(int i10);
}
