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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void A(String str, Bundle bundle);

    void A0(int i10);

    String C0();

    void E(int i10, int i11);

    CharSequence G();

    MediaMetadataCompat J();

    void K(String str, Bundle bundle);

    Bundle L();

    void M(b bVar);

    void N(String str, Bundle bundle);

    void Q(String str, Bundle bundle);

    void R(int i10, int i11);

    void U();

    void V(Uri uri, Bundle bundle);

    void a(float f7);

    boolean a0(KeyEvent keyEvent);

    void b();

    PlaybackStateCompat d();

    void d0(RatingCompat ratingCompat, Bundle bundle);

    void e();

    void f0(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void g(long j3);

    Bundle getExtras();

    String getTag();

    void i();

    void i0(boolean z10);

    void j(int i10);

    long k();

    int l();

    int l0();

    void m0(int i10);

    void n(String str, Bundle bundle);

    void n0();

    void next();

    void o(b bVar);

    void p(RatingCompat ratingCompat);

    void previous();

    void q(Uri uri, Bundle bundle);

    void r0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    List s0();

    void stop();

    void u(MediaDescriptionCompat mediaDescriptionCompat);

    void v0();

    boolean w();

    void x(MediaDescriptionCompat mediaDescriptionCompat);

    void x0(long j3);

    PendingIntent y();

    ParcelableVolumeInfo y0();

    void z();
}
