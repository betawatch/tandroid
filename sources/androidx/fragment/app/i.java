package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j3) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j3);
    }
}
