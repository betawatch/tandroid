package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j3) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j3);
    }
}
