// default package

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
