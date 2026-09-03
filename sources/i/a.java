package i;

import android.graphics.drawable.Animatable;
import j7.y7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends y7 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.a = i10;
        this.b = animatable;
    }

    @Override // j7.y7
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

    @Override // j7.y7
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
