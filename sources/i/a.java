package i;

import android.graphics.drawable.Animatable;
import f7.h8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends h8 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i9) {
        this.a = i9;
        this.b = animatable;
    }

    @Override // f7.h8
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((k2.d) this.b).start();
                break;
        }
    }

    @Override // f7.h8
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((k2.d) this.b).stop();
                break;
        }
    }
}
