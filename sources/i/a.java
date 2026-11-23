package i;

import android.graphics.drawable.Animatable;
import c8.k0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a extends k0 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i7) {
        this.a = i7;
        this.b = animatable;
    }

    @Override // c8.k0
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((a5.e) this.b).start();
                break;
        }
    }

    @Override // c8.k0
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((a5.e) this.b).stop();
                break;
        }
    }
}
