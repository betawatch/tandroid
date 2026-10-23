package i;

import android.graphics.drawable.Animatable;
import v7.w7;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
