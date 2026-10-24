package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j10) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j10);
    }
}
