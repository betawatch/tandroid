package i;

import android.graphics.drawable.Animatable;
import c8.l0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a extends l0 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i7) {
        this.a = i7;
        this.b = animatable;
    }

    @Override // c8.l0
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

    @Override // c8.l0
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
