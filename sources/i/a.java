package i;

import android.graphics.drawable.Animatable;
import b8.qc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends qc {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i3) {
        this.a = i3;
        this.b = animatable;
    }

    @Override // b8.qc
    public final void c() {
        switch (this.a) {
            case 0:
                this.b.start();
                break;
            default:
                ((z4.d) this.b).start();
                break;
        }
    }

    @Override // b8.qc
    public final void d() {
        switch (this.a) {
            case 0:
                this.b.stop();
                break;
            default:
                ((z4.d) this.b).stop();
                break;
        }
    }
}
