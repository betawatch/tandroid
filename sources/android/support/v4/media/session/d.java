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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void A(String str, Bundle bundle);

    void B0(int i3);

    void D(int i3, int i10);

    String E0();

    CharSequence F();

    MediaMetadataCompat I();

    void J(String str, Bundle bundle);

    Bundle K();

    void L(b bVar);

    void M(String str, Bundle bundle);

    void O(String str, Bundle bundle);

    void P(int i3, int i10);

    void R();

    void S(Uri uri, Bundle bundle);

    boolean Z(KeyEvent keyEvent);

    void a();

    void b(float f10);

    void d0(RatingCompat ratingCompat, Bundle bundle);

    void e();

    void f(long j10);

    void f0(MediaDescriptionCompat mediaDescriptionCompat, int i3);

    Bundle getExtras();

    PlaybackStateCompat h();

    String h0();

    void j();

    void k(int i3);

    void k0(boolean z10);

    long l();

    int m();

    void n(String str, Bundle bundle);

    void next();

    int o0();

    void p(b bVar);

    void p0(int i3);

    void previous();

    void q0();

    void r(RatingCompat ratingCompat);

    void r0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void s(Uri uri, Bundle bundle);

    List s0();

    void stop();

    void u(MediaDescriptionCompat mediaDescriptionCompat);

    boolean v();

    void v0();

    void w(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent x();

    void y0(long j10);

    void z();

    ParcelableVolumeInfo z0();
}
