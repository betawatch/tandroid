package i;

import android.graphics.drawable.Animatable;
import c8.k0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
