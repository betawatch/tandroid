package i;

import android.graphics.drawable.Animatable;
import v7.w7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends w7 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.a = i10;
        this.b = animatable;
    }

    @Override // v7.w7
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((x4.d) this.b).start();
                break;
        }
    }

    @Override // v7.w7
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((x4.d) this.b).stop();
                break;
        }
    }
}
