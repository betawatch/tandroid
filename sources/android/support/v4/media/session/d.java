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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface d extends IInterface {
    void A();

    void B(String str, Bundle bundle);

    void B0(int i10);

    String D0();

    void F(int i10, int i11);

    CharSequence H();

    MediaMetadataCompat K();

    void L(String str, Bundle bundle);

    Bundle M();

    void N(b bVar);

    void O(String str, Bundle bundle);

    void R(String str, Bundle bundle);

    void S(int i10, int i11);

    void V();

    void W(Uri uri, Bundle bundle);

    void a();

    void b(float f7);

    boolean b0(KeyEvent keyEvent);

    void e();

    void e0(RatingCompat ratingCompat, Bundle bundle);

    void f(long j10);

    void g0(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    Bundle getExtras();

    PlaybackStateCompat h();

    String i0();

    void j();

    void k(int i10);

    void k0(boolean z10);

    long l();

    int m();

    int n0();

    void next();

    void o(String str, Bundle bundle);

    void o0(int i10);

    void p(b bVar);

    void p0();

    void previous();

    void q(RatingCompat ratingCompat);

    void r(Uri uri, Bundle bundle);

    void stop();

    void t0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    List u0();

    void v(MediaDescriptionCompat mediaDescriptionCompat);

    void w0();

    boolean x();

    void y(MediaDescriptionCompat mediaDescriptionCompat);

    void y0(long j10);

    PendingIntent z();

    ParcelableVolumeInfo z0();
}
