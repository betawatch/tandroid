// default package

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gd1 extends h69 {
    @Override // h69
    public final void b(MediaError mediaError) {
        fa4.d("Chromecast Media Error: " + mediaError);
    }

    @Override // h69
    public final void g() {
        fa4.b("onStatusUpdated");
        fo.E();
    }
}
