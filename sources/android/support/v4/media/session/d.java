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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void A0(int i7);

    void B();

    void B0();

    void C(String str, Bundle bundle);

    void D0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    List F0();

    void I(int i7, int i10);

    void L0();

    CharSequence M();

    MediaMetadataCompat Q();

    void S(String str, Bundle bundle);

    Bundle T();

    void U(b bVar);

    void U0(long j3);

    void V(String str, Bundle bundle);

    ParcelableVolumeInfo V0();

    void X(String str, Bundle bundle);

    void X0(int i7);

    void Y(int i7, int i10);

    void a();

    void a0();

    void b();

    void b0(Uri uri, Bundle bundle);

    void c(long j3);

    String c1();

    void d(float f10);

    void f();

    Bundle getExtras();

    PlaybackStateCompat i();

    boolean i0(KeyEvent keyEvent);

    void k(int i7);

    long l();

    void l0(RatingCompat ratingCompat, Bundle bundle);

    int m();

    void n0(MediaDescriptionCompat mediaDescriptionCompat, int i7);

    void next();

    void o(String str, Bundle bundle);

    void p(b bVar);

    void previous();

    void q(RatingCompat ratingCompat);

    String q0();

    void r(Uri uri, Bundle bundle);

    void s0(boolean z10);

    void stop();

    void v(MediaDescriptionCompat mediaDescriptionCompat);

    boolean w();

    void y(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent z();

    int z0();
}
