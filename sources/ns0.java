// default package

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ns0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rs0 b;
    public final /* synthetic */ AnimatorSet c;

    public /* synthetic */ ns0(rs0 rs0Var, AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = rs0Var;
        this.c = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AnimatorSet animatorSet = this.c;
        rs0 rs0Var = this.b;
        switch (b) {
            case 0:
                rs0Var.c.postOnAnimation(new ns0(rs0Var, animatorSet, (byte) 1));
                break;
            default:
                if (rs0Var.y == animatorSet) {
                    animatorSet.start();
                    break;
                }
                break;
        }
    }
}
