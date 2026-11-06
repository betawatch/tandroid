package i;

import android.graphics.drawable.Animatable;
import c8.h0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends h0 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i7) {
        this.a = i7;
        this.b = animatable;
    }

    @Override // c8.h0
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

    @Override // c8.h0
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
