package i;

import a8.qc;
import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends qc {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.a = i10;
        this.b = animatable;
    }

    @Override // a8.qc
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((y4.d) this.b).start();
                break;
        }
    }

    @Override // a8.qc
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((y4.d) this.b).stop();
                break;
        }
    }
}
