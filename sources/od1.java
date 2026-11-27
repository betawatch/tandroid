// default package

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class od1 extends u99 {
    @Override // u99
    public final void b(MediaError mediaError) {
        cc4.d("Chromecast Media Error: " + mediaError);
    }

    @Override // u99
    public final void g() {
        cc4.b("onStatusUpdated");
        go.E();
    }
}
