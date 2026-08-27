package i;

import android.graphics.drawable.Animatable;
import g7.v7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends v7 {
    public final /* synthetic */ int a;
    public final Animatable b;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.a = i10;
        this.b = animatable;
    }

    @Override // g7.v7
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

    @Override // g7.v7
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
