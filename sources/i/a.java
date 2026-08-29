package i;

import android.graphics.drawable.Animatable;
import h7.b8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends b8 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.a = i10;
        this.b = animatable;
    }

    @Override // h7.b8
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

    @Override // h7.b8
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
