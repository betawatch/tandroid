// default package

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
