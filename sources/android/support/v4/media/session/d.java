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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public interface d extends IInterface {
    PendingIntent A();

    int A0();

    void B0(int i7);

    void C();

    void C0();

    void D(String str, Bundle bundle);

    void E0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    List G0();

    void J(int i7, int i10);

    void M0();

    CharSequence N();

    MediaMetadataCompat R();

    void T(String str, Bundle bundle);

    Bundle U();

    void U0(long j3);

    void V(b bVar);

    ParcelableVolumeInfo V0();

    void W(String str, Bundle bundle);

    void X0(int i7);

    void Y(String str, Bundle bundle);

    void Z(int i7, int i10);

    void a();

    void b();

    void b0();

    void c(long j3);

    void c0(Uri uri, Bundle bundle);

    String c1();

    void d(float f10);

    void f();

    Bundle getExtras();

    PlaybackStateCompat i();

    boolean j0(KeyEvent keyEvent);

    void k(int i7);

    long l();

    int m();

    void m0(RatingCompat ratingCompat, Bundle bundle);

    void next();

    void o(String str, Bundle bundle);

    void o0(MediaDescriptionCompat mediaDescriptionCompat, int i7);

    void p(b bVar);

    void previous();

    void q(RatingCompat ratingCompat);

    void r(Uri uri, Bundle bundle);

    String r0();

    void stop();

    void t0(boolean z10);

    void w(MediaDescriptionCompat mediaDescriptionCompat);

    boolean x();

    void z(MediaDescriptionCompat mediaDescriptionCompat);
}
