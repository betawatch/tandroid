package i;

import android.graphics.drawable.Animatable;
import v7.f8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a extends f8 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.a = i10;
        this.b = animatable;
    }

    @Override // v7.f8
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

    @Override // v7.f8
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
