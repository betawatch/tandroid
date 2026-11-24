// default package

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oe1 extends j89 {
    @Override // j89
    public final void b(MediaError mediaError) {
        fc4.d("Chromecast Media Error: " + mediaError);
    }

    @Override // j89
    public final void g() {
        fc4.b("onStatusUpdated");
        fp.E();
    }
}
