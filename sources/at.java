// default package

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AnimatorSet b;

    public /* synthetic */ at(AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        this.b.start();
    }
}
