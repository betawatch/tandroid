package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j10) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j10);
    }
}
