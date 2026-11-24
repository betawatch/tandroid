// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ic0 implements v46, be3 {
    public final ImageReceiver a;
    public final pb0 b;
    public long c;
    public boolean d;
    public final /* synthetic */ jc0 e;

    public ic0(jc0 jc0Var, View view) {
        this.e = jc0Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.q0(jc0Var.e / 2);
        pb0 pb0Var = new pb0((wjb) null);
        this.b = pb0Var;
        pb0Var.s(gl.L(22.0f));
    }

    @Override // be3
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.K();
        }
        this.c = 0L;
    }

    @Override // v46
    public final int b(boolean z) {
        if (z) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ic0) && this.c == ((ic0) obj).c;
    }

    @Override // v46
    public final int getHeight() {
        return this.e.e;
    }

    @Override // v46
    public final int getWidth() {
        return this.e.e;
    }
}
