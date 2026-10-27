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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void B(int i10, int i11);

    String B0();

    CharSequence E();

    MediaMetadataCompat I();

    void J(String str, Bundle bundle);

    Bundle K();

    void L(b bVar);

    void M(String str, Bundle bundle);

    void P(String str, Bundle bundle);

    void Q(int i10, int i11);

    void S();

    void T(Uri uri, Bundle bundle);

    boolean Y(KeyEvent keyEvent);

    void a();

    void b(float f7);

    void b0(RatingCompat ratingCompat, Bundle bundle);

    PlaybackStateCompat d();

    void e();

    void e0(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void g(long j10);

    Bundle getExtras();

    String getTag();

    void h0(boolean z10);

    void i();

    void j(int i10);

    long k();

    int k0();

    int l();

    void l0(int i10);

    void m0();

    void n(String str, Bundle bundle);

    void n0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void next();

    void o(b bVar);

    List o0();

    void p(RatingCompat ratingCompat);

    void previous();

    void q(Uri uri, Bundle bundle);

    void q0();

    void s(MediaDescriptionCompat mediaDescriptionCompat);

    void stop();

    boolean t();

    void t0(long j10);

    void u(MediaDescriptionCompat mediaDescriptionCompat);

    ParcelableVolumeInfo u0();

    PendingIntent v();

    void x();

    void x0(int i10);

    void y(String str, Bundle bundle);
}
