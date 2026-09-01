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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void B();

    String B0();

    MediaMetadataCompat C();

    void D(String str, Bundle bundle);

    Bundle E();

    void F(b bVar);

    void G(String str, Bundle bundle);

    void J(String str, Bundle bundle);

    void K(int i10, int i11);

    void O();

    void P(Uri uri, Bundle bundle);

    void T(long j10);

    void Y(float f10);

    boolean Z(KeyEvent keyEvent);

    void a();

    PlaybackStateCompat b();

    void b0(RatingCompat ratingCompat, Bundle bundle);

    void d0(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void e(int i10);

    long f();

    int g();

    void g0(boolean z4);

    Bundle getExtras();

    String getTag();

    void i(String str, Bundle bundle);

    void j(b bVar);

    int j0();

    void k0(int i10);

    void m(RatingCompat ratingCompat);

    void m0();

    void n(Uri uri, Bundle bundle);

    void next();

    void o(MediaDescriptionCompat mediaDescriptionCompat);

    boolean p();

    void p0();

    void previous();

    void q(MediaDescriptionCompat mediaDescriptionCompat);

    void q0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    PendingIntent r();

    List r0();

    void s();

    void s0();

    void stop();

    void t(String str, Bundle bundle);

    void v0(long j10);

    void w(int i10, int i11);

    ParcelableVolumeInfo x0();

    CharSequence y();

    void y0(int i10);
}
