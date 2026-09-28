package i;

import android.graphics.drawable.Animatable;
import v7.g8;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class a extends g8 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.a = i10;
        this.b = animatable;
    }

    @Override // v7.g8
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

    @Override // v7.g8
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
