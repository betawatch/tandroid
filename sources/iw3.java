// default package

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iw3 implements ln5 {
    public final /* synthetic */ jw3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k47 c;
    public final /* synthetic */ kw3 d;

    public iw3(kw3 kw3Var, jw3 jw3Var, boolean z, k47 k47Var) {
        this.d = kw3Var;
        this.a = jw3Var;
        this.b = z;
        this.c = k47Var;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
        k47 k47Var;
        if (this.b && (k47Var = this.c) != null && k47Var.F2() && imageReceiver.y() != null && imageReceiver.y().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.y() != null) {
            imageReceiver2.y().I(0, false, true);
        }
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }
}
