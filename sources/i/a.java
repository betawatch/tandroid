package i;

import android.graphics.drawable.Animatable;
import j7.y7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
