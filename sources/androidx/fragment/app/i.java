package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j3) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j3);
    }
}
