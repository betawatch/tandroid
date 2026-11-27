// default package

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
