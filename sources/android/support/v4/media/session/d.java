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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void A(int i7, int i10);

    void B0(int i7);

    CharSequence D();

    String E0();

    MediaMetadataCompat H();

    void I(String str, Bundle bundle);

    Bundle J();

    void K(b bVar);

    void L(String str, Bundle bundle);

    void N(String str, Bundle bundle);

    void O(int i7, int i10);

    void Q();

    void R(Uri uri, Bundle bundle);

    boolean W(KeyEvent keyEvent);

    void Y(RatingCompat ratingCompat, Bundle bundle);

    void a();

    void a0(MediaDescriptionCompat mediaDescriptionCompat, int i7);

    void b();

    void c(long j3);

    String c0();

    void d(float f10);

    void e0(boolean z9);

    void f();

    Bundle getExtras();

    PlaybackStateCompat i();

    int i0();

    void j0(int i7);

    void k(int i7);

    void k0();

    long l();

    int m();

    void m0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void next();

    void o(String str, Bundle bundle);

    List o0();

    void p(b bVar);

    void previous();

    void q(RatingCompat ratingCompat);

    void r(Uri uri, Bundle bundle);

    void s(MediaDescriptionCompat mediaDescriptionCompat);

    void s0();

    void stop();

    boolean t();

    void u(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent v();

    void w();

    void x(String str, Bundle bundle);

    void y0(long j3);

    ParcelableVolumeInfo z0();
}
